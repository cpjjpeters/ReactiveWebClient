package com.example.reactive;

/* carlpeters created on 27/08/2024 inside the package - com.example.reactive */
import org.springframework.http.HttpStatus;

public class MyHttpException extends Exception{
    private final HttpStatus status;

    public MyHttpException(String error, HttpStatus status) {
        super(error);
        this.status = status;
    }

    public HttpStatus getStatus(){
        return status;
    }
}
