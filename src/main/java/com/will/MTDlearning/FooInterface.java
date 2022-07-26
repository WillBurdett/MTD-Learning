package com.will.MTDlearning;

import java.util.List;

public interface FooInterface {
    public List<Foo> getAllFoo();

    void addFoo(Foo foo);

    public Foo getFooByName(String name);
}
