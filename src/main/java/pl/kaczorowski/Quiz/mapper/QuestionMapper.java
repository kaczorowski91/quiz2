package pl.kaczorowski.Quiz.mapper;

import org.springframework.stereotype.Component;
import pl.kaczorowski.Quiz.dto.QuestionDto;
import pl.kaczorowski.Quiz.entity.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class QuestionMapper {

    public QuestionDto mapToQuestionDto(final Question question) {
        return new QuestionDto(
                question.getQuestionNumber(),
                question.getQuestion(),
                question.getAnswer1(),
                question.getAnswer2(),
                question.getAnswer3(),
                question.getAnswer4(),
                question.getAnswer5(),
                question.getAnswer6(),
                question.getAnswer7(),
                question.getAnswer8(),
                question.getAnswer9());
    }

    public List<QuestionDto> mapToQuestionDtoList(List<Question> questions) {
        return questions.stream()
                .map(this::mapToQuestionDto)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
