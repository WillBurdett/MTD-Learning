package com.will.MTDlearning.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class FooNotFoundException extends IllegalStateException{

    public FooNotFoundException(String message){super(message);}
}
