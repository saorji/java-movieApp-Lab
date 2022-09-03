package com.javaunit3.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.javaunit3.springmvc")
public class SpringmvcApplication {
    public static void main(String[] args){
        SpringApplication.run(SpringmvcApplication.class, args);
    }
}
