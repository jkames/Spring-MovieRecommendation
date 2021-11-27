package lesson8;

import lesson7.RecommenderImplementation;
import lesson7.RecommenderImplementation2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class LearnspringApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(LearnspringApplication.class);

        ContentBasedFiltering cbf1 = appContext.getBean(ContentBasedFiltering.class);
        ContentBasedFiltering cbf2 = appContext.getBean(ContentBasedFiltering.class);
        ContentBasedFiltering cbf3 = appContext.getBean(ContentBasedFiltering.class);

        System.out.println(cbf1);
        System.out.println(cbf2);
        System.out.println(cbf3);
    }
}
