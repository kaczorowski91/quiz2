package pl.kaczorowski.Quiz.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
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
    @ElementCollection
    private List<Boolean> answers = new ArrayList<>();

    public Question(String questionNumber, String question, String answer1, String answer2, List<Boolean> answers) {
        this.questionNumber = questionNumber;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answers = answers;
    }

    public Question(String questionNumber, String question, String answer1, String answer2, String answer3, List<Boolean> answers) {
        this.questionNumber = questionNumber;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answers = answers;
    }

    public Question(String questionNumber, String question, String answer1, String answer2, String answer3, String answer4, List<Boolean> answers) {
        this.questionNumber = questionNumber;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answers = answers;
    }

    public Question(String questionNumber, String question, String answer1, String answer2, String answer3, String answer4, String answer5, List<Boolean> answers) {
        this.questionNumber = questionNumber;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
        this.answers = answers;
    }

    public Question(String questionNumber, String question, String answer1, String answer2, String answer3, String answer4, String answer5, String answer6, List<Boolean> answers) {
        this.questionNumber = questionNumber;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
        this.answer6 = answer6;
        this.answers = answers;
    }

    public Question(String questionNumber, String question, String answer1, String answer2, String answer3, String answer4, String answer5, String answer6, String answer7, List<Boolean> answers) {
        this.questionNumber = questionNumber;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
        this.answer6 = answer6;
        this.answer7 = answer7;
        this.answers = answers;
    }

    public Question(String questionNumber, String question, String answer1, String answer2, String answer3, String answer4, String answer5, String answer6, String answer7, String answer8, List<Boolean> answers) {
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
        this.answers = answers;
    }

    public Question(String questionNumber, String question, String answer1, String answer2, String answer3, String answer4, String answer5, String answer6, String answer7, String answer8, String answer9, List<Boolean> answers) {
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
        this.answers = answers;
    }

}
