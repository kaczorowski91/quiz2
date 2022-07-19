package pl.kaczorowski.Quiz.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.kaczorowski.Quiz.dto.UserAnswerDto;
import pl.kaczorowski.Quiz.service.UserAnswerService;

import java.lang.reflect.Type;
import java.util.ArrayList;

@RestController

@AllArgsConstructor
@RequestMapping("/v1/answer")
public class UserAnswerController {

    private UserAnswerService userAnswerService;

    @CrossOrigin(origins = "*")
    @RequestMapping( produces = "application/json", method = RequestMethod.POST)
    public String getAnswer(@RequestBody Object answerDtoList) {

        Gson gson = new Gson();
        Type userAnswer = new TypeToken<ArrayList<UserAnswerDto>>() {}.getType();
        ArrayList<UserAnswerDto> userAnswerDtos = gson.fromJson(answerDtoList.toString(), userAnswer);

        return userAnswerService.checkAnswerList(userAnswerDtos);
    }

}