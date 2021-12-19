package pl.kaczorowski.Quiz.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.kaczorowski.Quiz.dto.UserAnswerDto;
import pl.kaczorowski.Quiz.entity.UserAnswer;
import pl.kaczorowski.Quiz.mapper.UserAnswerMapper;
import pl.kaczorowski.Quiz.repository.UserAnswerRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UserAnswerService {

    private UserAnswerMapper userAnswerMapper;
    private UserAnswerRepository userAnswerRepository;

    public UserAnswerDto saveAnswer(UserAnswerDto userAnswerDto) {
        UserAnswer userAnswer = userAnswerMapper.mapToUserAnswer(userAnswerDto);
        userAnswerRepository.save(userAnswer);
        System.out.println(userAnswer);
        return userAnswerDto;
    }
    public String saveAnswers(UserAnswerDto userAnswerDto) {
        UserAnswer userAnswer = userAnswerMapper.mapToUserAnswer(userAnswerDto);
        userAnswerRepository.save(userAnswer);
        System.out.println(userAnswer);
        return "UDAlo sie";
    }



}
