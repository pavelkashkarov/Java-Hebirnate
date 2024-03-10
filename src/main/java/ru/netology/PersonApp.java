package ru.netology;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@RequiredArgsConstructor
@SpringBootApplication
public class PersonApp {

    public static void main(String[] args) {
        SpringApplication.run(PersonApp.class, args);
    }

}