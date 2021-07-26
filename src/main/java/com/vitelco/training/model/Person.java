package com.vitelco.training.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String name;

    public String sayHello(String name){
        return "Hello " + this.getName();
    }

    public float timesTwo(float prm){
        return prm * 2;
    }

    public float divide(float prm){
        return 100 / prm ;
    }

}
