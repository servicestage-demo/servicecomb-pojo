package com.service.pojo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.apache.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2020-04-13T10:46:51.816Z")

@RpcSchema(schemaId = "pojo")
public class PojoImpl implements Pojo{

    @Autowired
    private PojoDelegate pojoDelegate;


    public String helloworld(String name) {

        return pojoDelegate.helloworld(name);
    }

}
