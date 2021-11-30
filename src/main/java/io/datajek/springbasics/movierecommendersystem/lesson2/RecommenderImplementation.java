package io.datajek.springbasics.movierecommendersystem.lesson2;

public class RecommenderImplementation {
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
