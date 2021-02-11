package com.example.demo.exceptions;

import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PetshopNotExistsException extends Exception{

    public PetshopNotExistsException(String message)
    {
        super(message);
    }
}