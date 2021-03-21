package ru.geekbrains.lesson3.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getMain() {

        return "main page";
    }
}
