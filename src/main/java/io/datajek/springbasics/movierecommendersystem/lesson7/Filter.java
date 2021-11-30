package io.datajek.springbasics.movierecommendersystem.lesson7;

public interface Filter {
    String[] getRecommendations(String movie);
}
