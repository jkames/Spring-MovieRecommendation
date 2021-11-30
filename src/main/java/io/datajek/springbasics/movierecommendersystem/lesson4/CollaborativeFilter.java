package io.datajek.springbasics.movierecommendersystem.lesson4;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CollaborativeFilter implements Filter {
    @Override
    public String[] getRecommendations(String movie){

        return new String[]{"hello", "wow"};
    }
}
