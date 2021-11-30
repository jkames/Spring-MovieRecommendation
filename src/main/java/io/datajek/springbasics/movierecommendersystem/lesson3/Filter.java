package io.datajek.springbasics.movierecommendersystem.lesson3;

public interface Filter {
    String[] getRecommendations(String movie);
}
