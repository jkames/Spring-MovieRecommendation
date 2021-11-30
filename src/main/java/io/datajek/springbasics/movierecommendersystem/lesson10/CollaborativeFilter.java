package io.datajek.springbasics.movierecommendersystem.lesson10;

import io.datajek.springbasics.movierecommendersystem.lesson8.Filter;
import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie){

        return new String[]{"hello", "wow"};
    }
}
