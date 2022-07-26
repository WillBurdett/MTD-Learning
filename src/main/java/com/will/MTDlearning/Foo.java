package com.will.MTDlearning;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Foo {
    @Id
    private String name;
    private Integer legs;
    private Boolean canFly;
}
