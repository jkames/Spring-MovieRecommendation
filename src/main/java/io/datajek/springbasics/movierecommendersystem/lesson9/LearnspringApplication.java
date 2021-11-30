package io.datajek.springbasics.movierecommendersystem.lesson9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"io.datajek.springbasics.movierecommendersystem.lesson9",
        "io.datajek.springbasics.movierecommendersystem.lesson10"})
public class LearnspringApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(LearnspringApplication.class,args);

        System.out.println("ContentBasedFiltering bean found = " + appContext.containsBean("contentBasedFiltering"));
        System.out.println("CollaborativeFilter bean found = " + appContext.containsBean("collaborativeFilter"));




    }
}
