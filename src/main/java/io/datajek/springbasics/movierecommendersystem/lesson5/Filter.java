package io.datajek.springbasics.movierecommendersystem.lesson5;

public interface Filter {
    String[] getRecommendations(String movie);
}
