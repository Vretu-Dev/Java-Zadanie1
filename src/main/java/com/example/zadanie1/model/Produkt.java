package com.example.zadanie1.model;

public class Produkt {

    private Long id;
    private String nazwa;
    private double cena;

    // Konstruktor bezargumentowy (wymagany m.in. przy serializacji/deserializacji)
    public Produkt() {
    }

    // Konstruktor z parametrami ułatwiający tworzenie obiektów
    public Produkt(Long id, String nazwa, double cena) {
        this.id = id;
        this.nazwa = nazwa;
        this.cena = cena;
    }

    // Gettery i settery
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    // Metoda toString do czytelnego wypisywania obiektu
    @Override
    public String toString() {
        return "Produkt{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                '}';
    }
}
