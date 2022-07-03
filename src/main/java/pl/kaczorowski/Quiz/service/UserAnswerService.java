package pl.kaczorowski.Quiz.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.kaczorowski.Quiz.dto.UserAnswerDto;
import pl.kaczorowski.Quiz.entity.Question;
import pl.kaczorowski.Quiz.entity.UserAnswer;
import pl.kaczorowski.Quiz.mapper.UserAnswerMapper;
import pl.kaczorowski.Quiz.repository.QuestionRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UserAnswerService {

    private UserAnswerMapper userAnswerMapper;
    private QuestionRepository questionRepository;

    public boolean checkAnswer(UserAnswerDto userAnswerDto) {

        UserAnswer userAnswer = userAnswerMapper.mapToUserAnswer(userAnswerDto);
        List<Boolean> userAnswersList = userAnswer.getAnswers();

        Question question = questionRepository.findByQuestionNumber(userAnswer.getQuestionNumber());
        List<Boolean> correctAnswer = question.getAnswers();

        for (int i = 0; i < correctAnswer.size(); i++) {

            boolean line = correctAnswer.get(i).equals(userAnswersList.get(i));
            if (!line) {
                System.out.println(question.getQuestionNumber() + " false");
                return false;
            }
        }
        System.out.println(question.getQuestionNumber() + " true");
        return true;
    }

    public String checkAnswerList(ArrayList<UserAnswerDto> userAnswerDtos) {

        StringBuilder result = new StringBuilder();
        int count = 0;

        for (int i = 0; i < userAnswerDtos.size(); i++) {
            UserAnswerDto userAnswerDto = userAnswerDtos.get(i);
            result.append("Pytanie nr. " +userAnswerDto.getQuestionNumber() + " Odpowiedz: ");

            if(checkAnswer(userAnswerDto)){
                result.append("prawidłowa. ");
                count++;
            }else {
                result.append("nieprawidłowa. ");
            }
        }
        result.append( "Uzyskany wynik to: " + count);
        return result.toString();
    }
}
