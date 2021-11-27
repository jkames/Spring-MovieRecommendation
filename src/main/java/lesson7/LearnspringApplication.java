package lesson7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class LearnspringApplication {

    public static void main(String[] args) {
        //ApplicationContext manages the beans and dependencies
        ApplicationContext appContext = SpringApplication.run(LearnspringApplication.class, args);

        System.out.println("Calling getBean() on recommenderImplementation");

        //use ApplicationContext to find which filter is being used
        RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

        //call method to get recommendations
        String[] result = recommender.recommendedMovies("Finding Dory");

        //display results
        System.out.println(Arrays.toString(result));

        System.out.println("Calling getBean() on RecommenderImplementation2");
        RecommenderImplementation2 recommender2 = appContext.getBean(RecommenderImplementation2.class);
        result = recommender2.recommendedMovies(("elf"));
        System.out.println(Arrays.toString(result));
    }
}
