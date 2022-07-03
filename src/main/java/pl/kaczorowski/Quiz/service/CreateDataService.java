package pl.kaczorowski.Quiz.service;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import lombok.AllArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.kaczorowski.Quiz.entity.Question;
import pl.kaczorowski.Quiz.repository.QuestionRepository;

import java.io.*;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Service
@AllArgsConstructor
public class CreateDataService {

    private QuestionRepository questionRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void readCSV() throws FileNotFoundException {
        try {
            FileReader filereader = new FileReader("src/main/resources/question.csv");
            CSVParser parser = new CSVParserBuilder().withSeparator(';').build();
            CSVReader csvReader = new CSVReaderBuilder(filereader)
                    .withCSVParser(parser)
                    .build();
            List<String[]> allData = csvReader.readAll();

            for (String[] row : allData) {
                String number = row[0];
                String question = row[1];
                String answer1 = row[2];
                String answer2 = row[3];
                String answer3 = row[4];
                if (answer3.equals("")) {
                    answer3 = null;
                }
                String answer4 = row[5];
                if (answer4.equals("")) {
                    answer4 = null;
                }
                String answer5 = row[6];
                if (answer5.equals("")) {
                    answer5 = null;
                }
                String answer6 = row[7];
                if (answer6.equals("")) {
                    answer6 = null;
                }
                String answer7 = row[8];
                if (answer7.equals("")) {
                    answer7 = null;
                }
                String answer8 = row[9];
                if (answer8.equals("")) {
                    answer8 = null;
                }
                String answer9 = row[10];
                if (answer9.equals("")) {
                    answer9 = null;
                }
                Boolean answer1_boolean = Boolean.valueOf(row[11]);
                Boolean answer2_boolean = Boolean.parseBoolean(row[12]);
                Boolean answer3_boolean = Boolean.parseBoolean(row[13]);
                Boolean answer4_boolean = Boolean.parseBoolean(row[14]);
                Boolean answer5_boolean = Boolean.parseBoolean(row[15]);
                Boolean answer6_boolean = Boolean.parseBoolean(row[16]);
                Boolean answer7_boolean = Boolean.parseBoolean(row[17]);
                Boolean answer8_boolean = Boolean.parseBoolean(row[18]);
                Boolean answer9_boolean = Boolean.parseBoolean(row[19]);

                List<Boolean> answers = Arrays.asList(answer1_boolean, answer2_boolean, answer3_boolean, answer4_boolean, answer5_boolean,
                        answer6_boolean, answer7_boolean, answer8_boolean, answer9_boolean);

                questionRepository.save(new Question(number, question, answer1, answer2, answer3, answer4, answer5, answer6, answer7, answer8, answer9, answers));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
