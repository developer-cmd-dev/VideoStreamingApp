package com.example.Amazon_backend.Exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class CustomException extends RuntimeException{
    private HttpStatus status;
    public CustomException(String message,HttpStatus status){
        super(message);
        this.status = status;
    }

}
