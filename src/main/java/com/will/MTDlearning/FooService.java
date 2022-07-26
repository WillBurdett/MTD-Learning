package com.will.MTDlearning;

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
}
