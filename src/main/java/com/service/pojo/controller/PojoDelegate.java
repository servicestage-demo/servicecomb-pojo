package com.service.pojo.controller;

import org.springframework.stereotype.Component;


@Component
public class PojoDelegate implements Pojo {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
