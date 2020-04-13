package com.service.pojo;

import org.apache.servicecomb.springboot2.starter.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceComb
public class PojoApplication {
    public static void main(String[] args) {
       SpringApplication.run(PojoApplication.class,args);
    }
}
