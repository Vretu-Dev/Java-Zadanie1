package com.example.zadanie1;

import com.example.zadanie1.controller.ProduktController;
import com.example.zadanie1.model.Produkt;
import tools.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Zadanie1Application {

    public static void main(String[] args) {
        SpringApplication.run(Zadanie1Application.class, args);
    }

    // CommandLineRunner pozwala wykonać kod zaraz po uruchomieniu aplikacji Spring Boot
    @Bean
    public CommandLineRunner run() {
        return args -> {
            // Pobranie przykładowych produktów
            List<Produkt> produkty = ProduktController.pobierzPrzykladoweProdukty();

            // Użycie ObjectMapper do przekształcenia obiektów w format JSON
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(produkty);

            // Wypisanie informacji o produktach w konsoli w formacie JSON
            System.out.println("==================================================");
            System.out.println("Zadanie 2: Informacje o produktach w formacie JSON:");
            System.out.println(json);
            System.out.println("==================================================");
        };
    }
}
