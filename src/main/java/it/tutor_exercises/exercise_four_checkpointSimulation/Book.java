package it.tutor_exercises.exercise_four_checkpointSimulation;

import java.time.LocalDate;

public class Book {
    private String name;
    private String author;
    private LocalDate dateOfRelease;
    private double price;
    private String description;

    public Book(String name, String author, LocalDate dateOfRelease, double price, String description) {
        this.name = name;
        this.author = author;
        this.dateOfRelease = dateOfRelease;
        this.price = price;
        this.description = description;
    }

    public Book(String name, LocalDate dateOfRelease, double price) {
        this.name = name;
        this.dateOfRelease = dateOfRelease;
        this.price = price;
    }

    public static void compareBook(Book b1, Book b2) {
        if (b1.dateOfRelease.isBefore(b2.dateOfRelease)) {
            System.out.println(b1.name);
        } else {
            System.out.println(b2.name);
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getDateOfRelease() {
        return this.dateOfRelease;
    }

    public void setDateOfRelease(LocalDate dateOfRelease) {
        this.dateOfRelease = dateOfRelease;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void printInfo() {
        System.out.println(this.name + " " + this.author + " " + this.price + "€\n" + this.description + "\n" + this.dateOfRelease);
    }
}
