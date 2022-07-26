package com.will.MTDlearning;

import com.will.MTDlearning.Exceptions.FooNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FooService {

    private final FooRepo fooRepo;

    @Autowired
    public FooService(FooRepo fooRepo) {
        this.fooRepo = fooRepo;
    }

    public List<Foo> getAllFoo() {
        return fooRepo.getAllFoo();
    }

    public void addFoo(Foo foo) {
        fooRepo.addFoo(foo);
    }

    public Foo getFooByName(String name) {
        if (fooExists(name)){
            return fooRepo.getFooByName(name);
        } else {
            throw new FooNotFoundException(name + " not found");
        }
    }

    public Boolean fooExists(String name){
        for (Foo f : getAllFoo()){
            if (name.equals(f.getName().toLowerCase())){
                return true;
            }
        }
        return false;
    }
}
