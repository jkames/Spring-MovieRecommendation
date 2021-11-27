package lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    @Autowired
    private Filter contentBasedFiltering;

    String[] recommendedMovies(String movie){
        System.out.println("name of the filter: " + contentBasedFiltering);
        String[] results = contentBasedFiltering.getRecommendations(movie);

        return results;
    }
}
