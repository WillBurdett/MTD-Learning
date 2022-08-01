package com.will.MTDlearning.foo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/foo")
public class FooController {

    private final FooService fooService;

    @Autowired
    public FooController(FooService fooService) {
        this.fooService = fooService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Foo> getAllFoo(){
        return fooService.getAllFoo();
    }
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public Optional<Foo> getFooByName(@PathVariable String name){
        return fooService.getFooByName(name.toLowerCase());
    }
    @RequestMapping(method = RequestMethod.POST)
    public void addFoo(@RequestBody Foo foo){
        fooService.addFoo(foo);
    }
}
