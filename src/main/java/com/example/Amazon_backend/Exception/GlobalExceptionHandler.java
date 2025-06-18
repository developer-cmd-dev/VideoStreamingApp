package com.example.Amazon_backend.Exception;

import com.example.Amazon_backend.Response.ErrorResponse;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.IOException;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(CustomException.class)
    public void handleCustomException(HttpServletResponse response, CustomException ex) throws IOException {
        ErrorResponse errorResponse = new ErrorResponse(ex.getMessage(),ex.getStatus());
        response.sendError(errorResponse.getStatus().value(),errorResponse.getMessage());
    }


}
