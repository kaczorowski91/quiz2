package pl.kaczorowski.Quiz.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.kaczorowski.Quiz.dto.QuestionDto;
import pl.kaczorowski.Quiz.mapper.QuestionMapper;
import pl.kaczorowski.Quiz.repository.QuestionRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class QuestionService {

    private QuestionRepository questionRepository;
    private QuestionMapper questionMapper;

    public List<QuestionDto> getQuestions() {
        return questionMapper.mapToQuestionDtoList(questionRepository.findAll());
    }

}
