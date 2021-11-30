package io.datajek.springbasics.movierecommendersystem.lesson6;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CBF")
@Primary
public class ContentBasedFiltering implements Filter {
    public String[] getRecommendations(String movie){

        return new String[]{"Happy Feet", "Shark Tale"};
    }
}
