package com.will.MTDlearning.foo;

import com.will.MTDlearning.exceptions.FooNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FooService {

    private final FooRepository fooRepository;

    @Autowired
    public FooService(FooRepository fooRepository) {
        this.fooRepository = fooRepository;
    }

    public List<Foo> getAllFoo() {
        return fooRepository.findAll();
    }

    public void addFoo(Foo foo) {
        fooRepository.insert(foo);
    }

    public Optional<Foo> getFooByName(String name) {
       if (fooExists(name)) {
           return fooRepository.findById(name);
       } else {
           throw new FooNotFound(name + " not found");
        }
    }

    public Boolean fooExists(String name){
            if (fooRepository.existsById(name)){
                return true;
        }
        return false;
    }
}
