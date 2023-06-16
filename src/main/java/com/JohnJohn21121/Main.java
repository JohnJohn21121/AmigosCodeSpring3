package com.JohnJohn21121;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greeting")
    public GreetResponse greet() {
        GreetResponse response = new GreetResponse("Hello you, Human",
                List.of("Spanish", "English", "French"),
                new Person("John", 24));
        return response;
    }

    record Person(String name, int age) {
    }

    record GreetResponse(String greet, List<String> favLanguage, Person person) {
    }
}
