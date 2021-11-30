package io.datajek.springbasics.movierecommendersystem.lesson10;

public interface Filter {
    String[] getRecommendations(String movie);
}
