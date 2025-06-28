package com.example.Amazon_backend.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.imageio.IIOException;
import java.io.IOException;

@RestController
@RequestMapping("/")
public class HealthCheckController {

    @GetMapping("health-check")
    public ResponseEntity<String> healthCheck(){
     return ResponseEntity.ok("Ok");
    }




}
