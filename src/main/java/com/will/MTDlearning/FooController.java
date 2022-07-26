package com.will.MTDlearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FooController {

    private final FooService fooService;

    @Autowired
    public FooController(FooService fooService) {
        this.fooService = fooService;
    }

    @GetMapping(path = "/foo")
    public List<Foo> getAllFoo(){
        return fooService.getAllFoo();
    }

    @PostMapping(path = "/foo")
    public void addFoo(@RequestBody Foo foo){
        fooService.addFoo(foo);
    }
}
