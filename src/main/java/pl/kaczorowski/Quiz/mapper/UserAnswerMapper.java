package pl.kaczorowski.Quiz.mapper;

import org.springframework.stereotype.Component;
import pl.kaczorowski.Quiz.dto.UserAnswerDto;
import pl.kaczorowski.Quiz.entity.UserAnswer;

import java.util.List;

@Component
public class UserAnswerMapper {

    public UserAnswer mapToUserAnswer(final UserAnswerDto userAnswerDto) {

        Boolean[] answers = new Boolean[9];

        answers[0] = userAnswerDto.isUserAnswer1();
        answers[1] = userAnswerDto.isUserAnswer2();
        answers[2] = userAnswerDto.isUserAnswer3();
        answers[3] = userAnswerDto.isUserAnswer4();
        answers[4] = userAnswerDto.isUserAnswer5();
        answers[5] = userAnswerDto.isUserAnswer6();
        answers[6] = userAnswerDto.isUserAnswer7();
        answers[7] = userAnswerDto.isUserAnswer8();
        answers[8] = userAnswerDto.isUserAnswer9();

        return new UserAnswer(
                userAnswerDto.getQuestionNumber(),
                answers);
    }

    public List<UserAnswer> mapToUserAnswer(List<UserAnswerDto> userAnswerDtoList){
        for (int i =0; i<=userAnswerDtoList.size(); i++){


        }


    }
}
