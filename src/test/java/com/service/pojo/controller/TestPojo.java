package com.service.pojo.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestPojo {

    PojoDelegate pojoDelegate = new PojoDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = pojoDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
