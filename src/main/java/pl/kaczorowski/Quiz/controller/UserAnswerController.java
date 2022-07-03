package pl.kaczorowski.Quiz.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.AllArgsConstructor;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.kaczorowski.Quiz.dto.UserAnswerDto;
import pl.kaczorowski.Quiz.service.UserAnswerService;

import java.lang.reflect.Type;
import java.util.ArrayList;

@RestController
@RequestMapping("/v1/")
@AllArgsConstructor
public class UserAnswerController {

    private UserAnswerService userAnswerService;

    @PostMapping(value = "useranswers",  consumes = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public String getAnswer(@RequestBody Object answerDtoList) {

        Gson gson = new Gson();
        Type userAnswer = new TypeToken<ArrayList<UserAnswerDto>>() {
        }.getType();
        ArrayList<UserAnswerDto> userAnswerDtos = gson.fromJson(answerDtoList.toString(), userAnswer);

        return userAnswerService.checkAnswerList(userAnswerDtos);
    }

}