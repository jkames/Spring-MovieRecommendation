package lesson7;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class ContentBasedFiltering implements Filter {
    public String[] getRecommendations(String movie){

        return new String[]{"Happy Feet", "Shark Tale"};
    }
}
