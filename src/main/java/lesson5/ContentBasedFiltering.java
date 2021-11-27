package lesson5;

import org.springframework.stereotype.Component;

@Component
public class ContentBasedFiltering implements Filter {
    public String[] getRecommendations(String movie){

        return new String[]{"Happy Feet", "Shark Tale"};
    }
}
