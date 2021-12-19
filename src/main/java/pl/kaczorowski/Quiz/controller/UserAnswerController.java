package pl.kaczorowski.Quiz.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.AllArgsConstructor;

import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import pl.kaczorowski.Quiz.dto.UserAnswerDto;
import pl.kaczorowski.Quiz.service.UserAnswerService;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/v1/")
@AllArgsConstructor
public class UserAnswerController {

    private UserAnswerService userAnswerService;

    @Consumes(MediaType.APPLICATION_JSON_VALUE)
    @PostMapping(value = "useranswers")
    public String getAnswer(@RequestBody Object answerDtoList) {

        Gson gson = new Gson();
        Type userAnswer = new TypeToken<ArrayList<UserAnswerDto>>(){}.getType();
        ArrayList<UserAnswerDto> userAnswerDtos=gson.fromJson(answerDtoList.toString(), userAnswer);

        return "Odpowiedz pobrana";
    }

}