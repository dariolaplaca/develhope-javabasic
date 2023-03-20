package it.java_advanced.exercise_five;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Uncomment the Files.createFile() line below and write a try catch block that
     * prints it's stack trace
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        try {
            Files.createFile(Path.of("src\\it\\java_advanced\\exercise_five\\Test.txt"));
        } catch (IOException IOexception) {
            IOexception.printStackTrace();
            System.err.println("File is already created!");
        }

    }

    /**
     * 2:
     * <p>
     * Write a try-catch block that attempts to open a file
     * <p>
     * In the catch block, print a message that informs the user that the file could not be found.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        try {
            String userInputFileName = "src\\it\\java_advanced\\exercise_five\\test-file.txt";
            Files.readString(Path.of(userInputFileName));
        } catch (IOException e) {
            System.out.println("File not found.");
        }

    }

    /**
     * 3:
     * <p>
     * Write a try-catch block that attempts to parse a string as an integer.
     * <p>
     * In the catch block, print a message that informs the user that the input was not a valid integer.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        try {
            Integer.parseInt("house");
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Input is not a valid integer!");
        }

    }

    /**
     * 4:
     * <p>
     * Write a try block that around this print statement that attempts to divide 2 numbers
     * <p>
     * Create multiple catch blocks that catch different types of exceptions, such as NumberFormatException and DivideByZeroException.
     * <p>
     * In each catch block, print a message that informs the user of the specific exception that was caught and why it occurred.
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        double num1 = 10.0;
        String num2AsString = "0.0";
        try {
            double result = num1 / Double.parseDouble(num2AsString);
            if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY || Double.isNaN(result)) {
                throw new ArithmeticException();
            }
            System.out.println(num1 / Double.parseDouble(num2AsString));

        } catch (NumberFormatException numberFormatException) {
            System.out.println("The format of your number is wrong!");
        } catch (ArithmeticException divideByZeroException) {
            System.out.println("You tried to divide by zero!");
        }
    }
}
