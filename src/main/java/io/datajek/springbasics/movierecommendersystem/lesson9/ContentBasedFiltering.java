package io.datajek.springbasics.movierecommendersystem.lesson9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ContentBasedFiltering implements Filter {

    private static int instances = 0;

    @Autowired
    private Movie movie;
   ContentBasedFiltering(){
       super();
       instances++;

       System.out.println("ContentBasedFiltering constructor called");
   }
   public Movie getMovie(){
       return movie;
   }

   public static int getInstances(){
       return ContentBasedFiltering.instances;
   }

    @Override
    public String[] getRecommendations(String movie) {
        return new String[]{"Happy Feet", "Ice Age"};
    }
}
