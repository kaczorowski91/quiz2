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
@Data
@Table(name= " \"UserAnswer\"")
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
