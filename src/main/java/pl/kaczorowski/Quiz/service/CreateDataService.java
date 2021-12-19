package pl.kaczorowski.Quiz.service;

import lombok.AllArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.kaczorowski.Quiz.entity.Question;
import pl.kaczorowski.Quiz.repository.QuestionRepository;

import java.util.Arrays;

@Service
@AllArgsConstructor
public class CreateDataService {

    private QuestionRepository questionRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void addData() {

        Question question1 = new Question("1.1", "Jakich wymiarów jest, według przepisów, boisko do gry?",
                "40x20 metrów", "42x20 metrów", "38x18 metrów", "Długość pomiędzy 38 a 42 m, szerokość pomiędzy 18 a 22 metry",
                Arrays.asList(true,false,false,false));

        Question question2 = new Question("1.2", "Jakie są wymagane wymiary w świetle bramki?",
                "1.92 x 2.92 m",
                "2.00 x 3.00 m",
                "2.05 x 3.05 m",
                "2.08 x 3.08 m",
                Arrays.asList(false, true, false, false));

        Question question3 = new Question("1.3", "Jak szeroka jest linia bramkowa pomiędzy słupkami??",
                "5 cm",
                "6 cm",
                "8 cm",
                "10 cm",
                Arrays.asList(false, false, true, false));

        Question question4 = new Question("2.19", "Kto NIE jest uprawniony do wykonywania rzutów karnych, w sytuacji, kiedy mecz jest nierozstrzygnięty po zakończeniu dogrywek?",
                "Zawodnik, który ubliża sędziom krótko po zakończeniu dogrywki",
                "Bramkarze",
                "Zawodnik, którego 2-minutowe wykluczenie nie zakończyło się przed końcem dogrywki",
                "Zawodnik zdyskwalifikowany",
                "Zawodnik, któremu została udzielona pomoc medyczna na boisku, ale jego drużyna nie przeprowadziła ataków przed zakończeniem dogrywki",
                Arrays.asList(true, false, true, true, false));

        questionRepository.save(question1);
        questionRepository.save(question2);
        questionRepository.save(question3);
        questionRepository.save(question4);
    }

}
