package com.will.MTDlearning.foo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Foo {
    @Id
    private String name;
    private Integer legs;
    private Boolean canFly;

    public Foo(String name, Integer legs, Boolean canFly) {
        this.name = name;
        this.legs = legs;
        this.canFly = canFly;
    }
}


