package pl.kaczorowski.Quiz.mapper;

import org.springframework.stereotype.Component;
import pl.kaczorowski.Quiz.dto.UserAnswerDto;
import pl.kaczorowski.Quiz.entity.UserAnswer;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserAnswerMapper {

    public UserAnswer mapToUserAnswer(final UserAnswerDto userAnswerDto) {

        List<Boolean> answers = new ArrayList<>();

        answers.add(userAnswerDto.isUserAnswer1());
        answers.add(userAnswerDto.isUserAnswer2());
        answers.add(userAnswerDto.isUserAnswer3());
        answers.add(userAnswerDto.isUserAnswer4());
        answers.add(userAnswerDto.isUserAnswer5());
        answers.add(userAnswerDto.isUserAnswer6());
        answers.add(userAnswerDto.isUserAnswer7());
        answers.add(userAnswerDto.isUserAnswer8());
        answers.add(userAnswerDto.isUserAnswer9());

        return new UserAnswer(
                userAnswerDto.getQuestionNumber(),
                answers);
    }

}
