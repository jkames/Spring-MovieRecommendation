package io.datajek.springbasics.movierecommendersystem.lesson2;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class LearnspringApplication {

    public static void main(String[] args) {
        RecommenderImplementation rec = new RecommenderImplementation(new CollaborativeFilter());
        String[] recMovies = rec.recommendedMovies("Elf");
        System.out.println(Arrays.toString(recMovies));
    }

}
