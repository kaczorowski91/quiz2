package pl.kaczorowski.Quiz.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class QuestionDto {

    private String questionNumber;
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String answer5;
    private String answer6;
    private String answer7;
    private String answer8;
    private String answer9;

    public QuestionDto(String questionNumber, String question, String answer1, String answer2) {
        this.questionNumber = questionNumber;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
    }

    public QuestionDto(String questionNumber, String question, String answer1, String answer2, String answer3) {
        this.questionNumber = questionNumber;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
    }

    public QuestionDto(String questionNumber, String question, String answer1, String answer2, String answer3, String answer4) {
        this.questionNumber = questionNumber;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
    }

    public QuestionDto(String questionNumber, String question, String answer1, String answer2, String answer3, String answer4, String answer5) {
        this.questionNumber = questionNumber;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
    }

    public QuestionDto(String questionNumber, String question, String answer1, String answer2, String answer3, String answer4, String answer5, String answer6) {
        this.questionNumber = questionNumber;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
        this.answer6 = answer6;
    }

    public QuestionDto(String questionNumber, String question, String answer1, String answer2, String answer3, String answer4, String answer5, String answer6, String answer7) {
        this.questionNumber = questionNumber;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
        this.answer6 = answer6;
        this.answer7 = answer7;
    }

    public QuestionDto(String questionNumber, String question, String answer1, String answer2, String answer3, String answer4, String answer5, String answer6, String answer7, String answer8) {
        this.questionNumber = questionNumber;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
        this.answer6 = answer6;
        this.answer7 = answer7;
        this.answer8 = answer8;
    }

    public QuestionDto(String questionNumber, String question, String answer1, String answer2, String answer3, String answer4, String answer5, String answer6, String answer7, String answer8, String answer9) {
        this.questionNumber = questionNumber;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
        this.answer6 = answer6;
        this.answer7 = answer7;
        this.answer8 = answer8;
        this.answer9 = answer9;
    }
}
