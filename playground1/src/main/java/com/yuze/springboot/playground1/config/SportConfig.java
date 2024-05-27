package com.yuze.springboot.playground1.config;

import com.yuze.springboot.playground1.dependencyClasses.Coach;
import com.yuze.springboot.playground1.dependencyClasses.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    //bean id defaults to the method name
    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
