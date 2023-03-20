package it.java_advanced_2.exercise_two;

public class Car implements Movable {
    String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void moveForward() {
        System.out.println("Driving Forward...");
    }

    @Override
    public void moveBackward() {
        System.out.println("Driving Backward...");
    }
}
