package com.will.MTDlearning.foo;

import com.will.MTDlearning.foo.Foo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FooRepository extends MongoRepository<Foo, String> {
}
