package it.java_advanced_2.exercise_two;

public abstract class Shape {
    protected double weight;
    protected double height;

    public Shape(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public abstract double calculateArea();
}
