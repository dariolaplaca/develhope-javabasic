package it.java_advanced_2.exercise_two;

public class Boat implements Movable {
    String name;

    public Boat(String name) {
        this.name = name;
    }

    @Override
    public void moveForward() {
        System.out.println("Sailing Forward...");
    }

    @Override
    public void moveBackward() {
        System.out.println("Sailing Backward...");
    }
}
