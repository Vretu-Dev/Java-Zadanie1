package com.example.zadanie1.controller;

import com.example.zadanie1.model.Produkt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produkty")
public class ProduktController {

    public static List<Produkt> pobierzPrzykladoweProdukty() {
        List<Produkt> produkty = new ArrayList<>();
        produkty.add(new Produkt(1L, "Laptop", 3500.00));
        produkty.add(new Produkt(2L, "Myszka komputerowa", 120.00));
        produkty.add(new Produkt(3L, "Klawiatura mechaniczna", 250.00));
        produkty.add(new Produkt(4L, "Monitor 27 cali", 1100.00));
        return produkty;
    }

    // Endpoint GET http://localhost:8080/produkty return productList in JSON
    @GetMapping
    public List<Produkt> getProdukty() {
        return pobierzPrzykladoweProdukty();
    }
}
