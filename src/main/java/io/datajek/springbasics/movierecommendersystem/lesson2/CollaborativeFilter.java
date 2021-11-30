package io.datajek.springbasics.movierecommendersystem.lesson2;

public class CollaborativeFilter implements Filter{
    @Override
    public String[] getRecommendations(String movie){

        return new String[]{"hello", "wow"};
    }
}
