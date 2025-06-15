package com.example.Amazon_backend.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.sql.Timestamp;
import java.util.Date;

@Getter
@AllArgsConstructor
public class ErrorResponse {
    private String message;
    private HttpStatus status;
}
