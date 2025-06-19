package com.example.Amazon_backend.Exception;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.IOException;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(CustomException.class)
    public void handleCustomException(HttpServletResponse response, CustomException ex) throws IOException {
        response.sendError(ex.getStatus().value(),ex.getMessage());
    }


}
