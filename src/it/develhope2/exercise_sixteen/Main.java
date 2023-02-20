package it.develhope2.exercise_sixteen;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }
    /**
     * 1: Take the code below and put it into a function, read the code and see what it is.
     * <p>
     * What do you think the function does? Name the function appropriately and make sure
     * <p>
     * return the appropriate result type
     *
     */
    static String convertCelsiusToFahrenheit(double celsius){
        // Put this into a function
        double fahrenheit = ((celsius * 9) / 5) + 32;
        return celsius + " Celsius is " + fahrenheit + " fahrenheit";
    }

    private static void exercise1() {
        System.out.println("Exercise 1:");
        System.out.println(convertCelsiusToFahrenheit(30));
    }

    /**
     * 2: Create a function that processes and prints out all the names in the ArrayList
     *
     *    Make sure to put all the formatting code in the function, formatting:
     *    1) to Upper case
     *    2) Remove spaces at the start and the end
     *    3) If the name contains any numbers, instead of returning the name, return "Invalid"
     */

    static String nameFormat(String name){
        if(Pattern.compile("\\d").asPredicate().test(name)){
            return "Invalid";
        }
        return name.toUpperCase().trim();
    }
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<String> names = Arrays.asList("Alan   ", "Alice   ", "Ant0ni0   ", "  Aziz");

        for (String name : names) {
            System.out.println(nameFormat(name));
        }
    }

    /**
     * 3: Write a function that prints out every variable seen in the code. It should not return anything
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        double myLunchPrice = 5.99;
        String lunchType = "sandwich";
        String description = "Nice big sandwich";
        int weightInGrams = 500;
        eatLunch(myLunchPrice, lunchType, description, weightInGrams);
        // Call your function
    }

    static void eatLunch(double lunchPrice, String lunchType, String description, int weightInGrams){
        System.out.println(lunchPrice+ "€ " + lunchType + " - " + description + " " + weightInGrams + "g");
    }
}
