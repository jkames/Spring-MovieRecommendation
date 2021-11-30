package io.datajek.springbasics.movierecommendersystem.lesson6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    @Autowired
    @Qualifier("CF")
    private Filter filter;

    String[] recommendedMovies(String movie){
        System.out.println("name of the filter: " + filter);
        String[] results = filter.getRecommendations(movie);

        return results;
    }
}
