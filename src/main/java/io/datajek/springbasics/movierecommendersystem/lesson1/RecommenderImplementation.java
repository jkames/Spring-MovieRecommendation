package io.datajek.springbasics.movierecommendersystem.lesson1;

public class RecommenderImplementation {
    String[] recommendedMovies(String movie){
        ContentBasedFiltering filter = new ContentBasedFiltering();
        String[] movieRecommendations = filter.getRecommendation(movie);

        return movieRecommendations;
    }
}
