package io.datajek.springbasics.movierecommendersystem.lesson4;

public interface Filter {
    String[] getRecommendations(String movie);
}
