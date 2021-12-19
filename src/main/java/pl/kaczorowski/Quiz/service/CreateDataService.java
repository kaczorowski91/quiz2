package pl.kaczorowski.Quiz.service;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.kaczorowski.Quiz.entity.Question;
import pl.kaczorowski.Quiz.repository.QuestionRepository;

@Service
@AllArgsConstructor
public class CreateDataService {

    private QuestionRepository questionRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void addData() {

        Boolean answer1[] = {false, false};

        Question question1 = new Question("1.1", "Jakich wymiarów jest, według przepisów, boisko do gry?",
                "40x20 metrów", "42x20 metrów", "38x18 metrów", "Długość pomiędzy 38 a 42 m, szerokość pomiędzy 18 a 22 metry",
                new Boolean[]{true, false, false, false, false});


        Question question2 = new Question("2.19", "Kto NIE jest uprawniony do wykonywania rzutów karnych, w sytuacji, kiedy mecz jest nierozstrzygnięty po zakończeniu dogrywek?",
                "Zawodnik, który ubliża sędziom krótko po zakończeniu dogrywki",
                "Bramkarze",
                "Zawodnik, którego 2-minutowe wykluczenie nie zakończyło się przed końcem dogrywki",
                "Zawodnik zdyskwalifikowany",
                "Zawodnik, któremu została udzielona pomoc medyczna na boisku, ale jego drużyna nie przeprowadziła ataków przed zakończeniem dogrywki",
                new Boolean[]{true, false, true, true, false});

        questionRepository.save(question1);
        questionRepository.save(question2);
    }

}
