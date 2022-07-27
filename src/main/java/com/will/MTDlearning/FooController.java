package com.will.MTDlearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping(path = "/foo/{name}")
    public Optional<Foo> getFooByName(@PathVariable String name){
        return fooService.getFooByName(name.toLowerCase());
    }
    @PostMapping(path = "/foo")
    public void addFoo(@RequestBody Foo foo){
        fooService.addFoo(foo);
    }
}
