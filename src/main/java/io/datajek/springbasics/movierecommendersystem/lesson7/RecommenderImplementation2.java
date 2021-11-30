package io.datajek.springbasics.movierecommendersystem.lesson7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation2 {
    private Filter filter;

    @Autowired
    @Qualifier("contentBasedFiltering")
    public void setFilter(Filter filter){
        this.filter = filter;
        System.out.println("Setter method invoked..");
    }

    String[] recommendedMovies(String movie) {
        System.out.println("name of the filter: " + filter);
        String[] results = filter.getRecommendations(movie);

        return results;
    }
}
