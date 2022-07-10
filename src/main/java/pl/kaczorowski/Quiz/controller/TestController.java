package pl.kaczorowski.Quiz.controller;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.kaczorowski.Quiz.dto.QuestionDto;

import java.util.List;

@Controller
@RequestMapping("/test" )
@AllArgsConstructor
public class TestController {


    @GetMapping
    public String test() {
        return "test";
    }
}
