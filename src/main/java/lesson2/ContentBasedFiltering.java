package lesson2;

public class ContentBasedFiltering implements Filter{
    public String[] getRecommendations(String movie){

        return new String[]{"Happy Feet", "Shark Tale"};
    }
}
