package io.datajek.springbasics.movierecommendersystem.lesson7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    private Filter filter;

    @Autowired
    public RecommenderImplementation(@Qualifier("contentBasedFiltering")Filter filter){
        super();
        this.filter = filter;
        System.out.println("Constructor invoked...");
    }

    String[] recommendedMovies(String movie){
        System.out.println("name of the filter: " + filter);
        String[] results = filter.getRecommendations(movie);

        return results;
    }
}
