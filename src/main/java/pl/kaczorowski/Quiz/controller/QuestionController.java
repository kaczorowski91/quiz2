package pl.kaczorowski.Quiz.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.kaczorowski.Quiz.dto.QuestionDto;
import pl.kaczorowski.Quiz.service.QuestionService;
import java.util.List;

@RestController
@RequestMapping("/v1/question")
@AllArgsConstructor
public class QuestionController {

    private QuestionService questionService;

    @GetMapping
    public List<QuestionDto> getQuestions() {
        return questionService.getQuestions();
    }

}
