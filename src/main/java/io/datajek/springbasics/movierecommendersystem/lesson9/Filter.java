package io.datajek.springbasics.movierecommendersystem.lesson9;

public interface Filter {
    String[] getRecommendations(String movie);
}
