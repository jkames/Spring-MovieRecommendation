package io.datajek.springbasics.movierecommendersystem.lesson8;

public interface Filter {
    String[] getRecommendations(String movie);
}
