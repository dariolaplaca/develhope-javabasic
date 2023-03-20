package it.java_advanced_2.exercise_two;

public class Circle extends Shape {
    public Circle(double radius) {
        super(radius * 2, radius * 2);
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow((height / 2), 2);
    }
}
