package it.java_advanced_2.exercise_two;

public abstract class Instrument implements Playable {
    protected String name;
    protected String brand;
    Instrument(String name, String brand){
        this.name = name;
        this.brand = brand;
    }
}
