package pl.kaczorowski.Quiz.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class UserAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String questionNumber;
    @ElementCollection
    private List<Boolean> answers = new ArrayList<>();

    public UserAnswer(String questionNumber, List<Boolean> answers) {
        this.questionNumber = questionNumber;
        this.answers = answers;
    }
}
