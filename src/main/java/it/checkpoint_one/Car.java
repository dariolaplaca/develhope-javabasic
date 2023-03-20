package it.checkpoint_one;

public class Car {
    private static int idCounter;
    private int id;
    private String plate;
    private String model;
    private String brand;
    private double price;
    private int kilometersByLiters;
    private boolean isElectric;

    //CONSTRUCTORS
    public Car(String model, String brand, String plate, double price, int kilometersByLiters, boolean isElectric) {
        id = ++idCounter;
        this.model = model;
        this.brand = brand;
        this.plate = plate;
        this.price = price;
        this.kilometersByLiters = kilometersByLiters;
        this.isElectric = isElectric;
    }

    public Car(String plate, String model, String brand) {
        id = ++idCounter;
        this.plate = plate;
        this.model = model;
        this.brand = brand;
    }

    //GETTERS

    public int getId() {
        return this.id;
    }

    public String getPlate() {
        return this.plate;
    }

    public String getModel() {
        return this.model;
    }

    public String getBrand() {
        return this.brand;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getKilometersByLiters() {
        return this.kilometersByLiters;
    }

    //SETTERS

    public boolean isElectric() {
        return this.isElectric;
    }

    public boolean isGreen() {
        if (isElectric || kilometersByLiters > 20) {
            return true;
        }
        return false;
    }
}
