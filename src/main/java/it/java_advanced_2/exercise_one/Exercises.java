package it.java_advanced_2.exercise_one;

import java.util.Arrays;
import java.util.HashSet;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     * <p>
     * <p>
     * Create a class called "Dog" that extends the Animal class.
     * <p>
     * Add a new field called "breed" to the Dog class.
     * <p>
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     * <p>
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        Dog pug = new Dog(20, 20, "Pug");
        Dog labrador = new Dog(120, 60, "Labrador");
        System.out.println(pug.getBreed() + " weight: " + pug.getWeight() + " height: " + pug.getHeight());
        System.out.println(labrador.getBreed() + " weight: " + labrador.getWeight() + " height: " + labrador.getHeight());
        // Your code here
    }

    /**
     * 2:
     * <p>
     * <p>
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     * <p>
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     * <p>
     * Also create constructors, getters and setters
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        Fish goldFish = new Fish(0.2, 0.1, "GoldFish");
        Bird crow = new Bird(10, 15, 0.8, "Crow");
        System.out.println(goldFish.getSpecies() + " weight: " + goldFish.getWeight() + " height: " + goldFish.getHeight());
        System.out.println(crow.getSpecies() + " weight: " + crow.getWeight() + " height: " + crow.getHeight() + " wing spawn: " + crow.getWingSpan());
    }


    /**
     * 3:
     * <p>
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     * <p>
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        Dog husky = new Dog(50, 70, "Husky");
        Bird eagle = new Bird(30, 60, 80, "Eagle");
        Fish shark = new Fish(50, 120, "Shark");
        HashSet<Animal> animals = new HashSet<>(Arrays.asList(husky, eagle, shark));
        Animal fastestAnimal = null;
        double fastestSpeed = 0;
        for (Animal a : animals) {
            if (a.getSpeed() > fastestSpeed) {
                fastestSpeed = a.getSpeed();
                fastestAnimal = a;
            }
        }
        assert fastestAnimal != null;
        System.out.println("The fastest animal is: " + fastestAnimal.getName() + " with a speed of " + fastestAnimal.getSpeed() + "m/s");
        // Your code here

    }
}
