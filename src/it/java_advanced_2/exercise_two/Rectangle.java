package it.java_advanced_2.exercise_two;

public class Rectangle extends Shape{

    public Rectangle(double height, double weight){
        super(weight, height);
    }
    @Override
    public double calculateArea() {
        return height * weight;
    }
}
