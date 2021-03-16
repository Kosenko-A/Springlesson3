package ru.geekbrains.lesson3.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.geekbrains.lesson3.config.Product;

@RestController
@RequestMapping("/json")
public class Controller1 {

    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getJson() {
        Product product = new Product(1, "skirt", 1000);
        return product.toString();
    }
}
