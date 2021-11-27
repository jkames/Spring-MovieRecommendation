package lesson4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    @Autowired
    private Filter filter;

    RecommenderImplementation(Filter filter){
        super();
        this.filter = filter;
    }

    String[] recommendedMovies(String movie){
        System.out.println("name of the filter: " + filter);
        String[] results = filter.getRecommendations(movie);

        return results;
    }
}
