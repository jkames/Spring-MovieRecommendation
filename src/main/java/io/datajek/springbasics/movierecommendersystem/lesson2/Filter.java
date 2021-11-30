package io.datajek.springbasics.movierecommendersystem.lesson2;

public interface Filter {
    String[] getRecommendations(String movie);
}
