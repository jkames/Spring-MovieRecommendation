package io.datajek.springbasics.movierecommendersystem.lesson6;

public interface Filter {
    String[] getRecommendations(String movie);
}
