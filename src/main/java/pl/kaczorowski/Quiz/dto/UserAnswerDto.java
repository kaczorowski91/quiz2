package pl.kaczorowski.Quiz.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class UserAnswerDto {

    private String questionNumber;
    private boolean userAnswer1;
    private boolean userAnswer2;
    private boolean userAnswer3;
    private boolean userAnswer4;
    private boolean userAnswer5;
    private boolean userAnswer6;
    private boolean userAnswer7;
    private boolean userAnswer8;
    private boolean userAnswer9;

    public UserAnswerDto(String questionNumber, boolean userAnswer1, boolean userAnswer2) {
        this.questionNumber = questionNumber;
        this.userAnswer1 = userAnswer1;
        this.userAnswer2 = userAnswer2;
    }

    public UserAnswerDto(String questionNumber, boolean userAnswer1, boolean userAnswer2, boolean userAnswer3) {
        this.questionNumber = questionNumber;
        this.userAnswer1 = userAnswer1;
        this.userAnswer2 = userAnswer2;
        this.userAnswer3 = userAnswer3;
    }

    public UserAnswerDto(String questionNumber, boolean userAnswer1, boolean userAnswer2, boolean userAnswer3, boolean userAnswer4) {
        this.questionNumber = questionNumber;
        this.userAnswer1 = userAnswer1;
        this.userAnswer2 = userAnswer2;
        this.userAnswer3 = userAnswer3;
        this.userAnswer4 = userAnswer4;
    }

    public UserAnswerDto(String questionNumber, boolean userAnswer1, boolean userAnswer2, boolean userAnswer3, boolean userAnswer4, boolean userAnswer5) {
        this.questionNumber = questionNumber;
        this.userAnswer1 = userAnswer1;
        this.userAnswer2 = userAnswer2;
        this.userAnswer3 = userAnswer3;
        this.userAnswer4 = userAnswer4;
        this.userAnswer5 = userAnswer5;
    }

    public UserAnswerDto(String questionNumber, boolean userAnswer1, boolean userAnswer2, boolean userAnswer3, boolean userAnswer4, boolean userAnswer5, boolean userAnswer6) {
        this.questionNumber = questionNumber;
        this.userAnswer1 = userAnswer1;
        this.userAnswer2 = userAnswer2;
        this.userAnswer3 = userAnswer3;
        this.userAnswer4 = userAnswer4;
        this.userAnswer5 = userAnswer5;
        this.userAnswer6 = userAnswer6;
    }

    public UserAnswerDto(String questionNumber, boolean userAnswer1, boolean userAnswer2, boolean userAnswer3, boolean userAnswer4, boolean userAnswer5, boolean userAnswer6, boolean userAnswer7) {
        this.questionNumber = questionNumber;
        this.userAnswer1 = userAnswer1;
        this.userAnswer2 = userAnswer2;
        this.userAnswer3 = userAnswer3;
        this.userAnswer4 = userAnswer4;
        this.userAnswer5 = userAnswer5;
        this.userAnswer6 = userAnswer6;
        this.userAnswer7 = userAnswer7;
    }

    public UserAnswerDto(String questionNumber, boolean userAnswer1, boolean userAnswer2, boolean userAnswer3, boolean userAnswer4, boolean userAnswer5, boolean userAnswer6, boolean userAnswer7, boolean userAnswer8) {
        this.questionNumber = questionNumber;
        this.userAnswer1 = userAnswer1;
        this.userAnswer2 = userAnswer2;
        this.userAnswer3 = userAnswer3;
        this.userAnswer4 = userAnswer4;
        this.userAnswer5 = userAnswer5;
        this.userAnswer6 = userAnswer6;
        this.userAnswer7 = userAnswer7;
        this.userAnswer8 = userAnswer8;
    }

    public UserAnswerDto(String questionNumber, boolean userAnswer1, boolean userAnswer2, boolean userAnswer3, boolean userAnswer4, boolean userAnswer5, boolean userAnswer6, boolean userAnswer7, boolean userAnswer8, boolean answer9) {
        this.questionNumber = questionNumber;
        this.userAnswer1 = userAnswer1;
        this.userAnswer2 = userAnswer2;
        this.userAnswer3 = userAnswer3;
        this.userAnswer4 = userAnswer4;
        this.userAnswer5 = userAnswer5;
        this.userAnswer6 = userAnswer6;
        this.userAnswer7 = userAnswer7;
        this.userAnswer8 = userAnswer8;
        this.userAnswer9 = answer9;
    }

    @Override
    public String toString() {
        return "UserAnswerDto{" +
                "questionNumber='" + questionNumber + '\'' +
                ", userAnswer1=" + userAnswer1 +
                ", userAnswer2=" + userAnswer2 +
                ", userAnswer3=" + userAnswer3 +
                ", userAnswer4=" + userAnswer4 +
                ", userAnswer5=" + userAnswer5 +
                ", userAnswer6=" + userAnswer6 +
                ", userAnswer7=" + userAnswer7 +
                ", userAnswer8=" + userAnswer8 +
                ", userAnswer9=" + userAnswer9 +
                '}';
    }
}
