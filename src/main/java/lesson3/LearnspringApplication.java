package lesson3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class LearnspringApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(LearnspringApplication.class, args);

        RecommenderImplementation recomender = appContext.getBean(RecommenderImplementation.class);

        String[] result = recomender.recommendedMovies("Elf");
        System.out.println(Arrays.toString(result));
    }

}
