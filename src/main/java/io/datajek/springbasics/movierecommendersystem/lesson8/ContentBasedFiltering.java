package io.datajek.springbasics.movierecommendersystem.lesson8;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ContentBasedFiltering implements Filter {
    public String[] getRecommendations(String movie){

        return new String[]{"Happy Feet", "Shark Tale"};
    }
}
