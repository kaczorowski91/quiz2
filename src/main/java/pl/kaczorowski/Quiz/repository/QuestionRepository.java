package pl.kaczorowski.Quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kaczorowski.Quiz.entity.Question;

import java.util.Optional;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Long> {

    Question findByQuestionNumber(String number);
}
