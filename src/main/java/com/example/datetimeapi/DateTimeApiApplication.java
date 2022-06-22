package com.example.datetimeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DateTimeApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DateTimeApiApplication.class, args);
    }

}

@RestController
class Hallo{

    @GetMapping("/hi")
    public String hi(){
        return "Hallo";
    }
}