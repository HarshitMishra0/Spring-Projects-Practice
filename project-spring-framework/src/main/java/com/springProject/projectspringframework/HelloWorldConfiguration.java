package com.springProject.projectspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record person(String name, int age){};
record address(String firstLine, String city){};
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Harshit";
    }
    @Bean
    public int age(){
        return 19;
    }
    @Bean
    public person person(){
        return new person("Shruti", 20);
    }

    @Bean
    public address address(){
        return new address("HR-107/A Flat-18", "New Delhi");
    }



}
