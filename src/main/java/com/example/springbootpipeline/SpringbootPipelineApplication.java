package com.example.springbootpipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/v1")
public class SpringbootPipelineApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootPipelineApplication.class, args);
    }

    @GetMapping("/greeting")
    public ResponseEntity<String> getMessage(){

        return ResponseEntity.status(HttpStatus.OK).body("User Logged in Success");
    }

}
