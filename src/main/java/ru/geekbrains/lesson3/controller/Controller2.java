package ru.geekbrains.lesson3.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.geekbrains.lesson3.config.Product;


@RestController
@RequestMapping("/xml")
public class Controller2 {

    @GetMapping(value = "get", produces = MediaType.APPLICATION_XML_VALUE)
    public String getXml() {
        Product product = new Product(2, "hat", 500);
        return product.toString();
    }
}
