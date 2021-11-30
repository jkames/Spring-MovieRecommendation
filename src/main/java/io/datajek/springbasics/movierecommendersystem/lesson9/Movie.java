package io.datajek.springbasics.movierecommendersystem.lesson9;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component @Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode= ScopedProxyMode.TARGET_CLASS)
public class Movie {
    String name;
    String genre;
    String producer;
    static int instances = 0;

    Movie(){
        super();
        instances++;
        System.out.println("Movie Constructor Called");
    }

    static int getInstances(){
        return Movie.instances;
    }
}
