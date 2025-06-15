package com.example.Amazon_backend.Controller;

import com.example.Amazon_backend.Exception.CustomException;
import com.example.Amazon_backend.Response.ErrorResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.imageio.IIOException;
import java.io.IOException;

@RestController
@RequestMapping("/api/v1")
public class HealthCheckController {

    @GetMapping("/health-check")
    public ResponseEntity<String> healthCheck(){
        throw new CustomException("Server Health is not Good", HttpStatus.BAD_REQUEST);
    }


//    @ExceptionHandler(CustomException.class)
//    public ResponseEntity<ErrorResponse> handleCustomException(CustomException ex){
//        ErrorResponse response = new ErrorResponse(ex.getMessage(),ex.getStatus());
//        return new ResponseEntity<>(response, response.getStatus());
//    }





}
