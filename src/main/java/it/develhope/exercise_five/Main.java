package it.develhope.exercise_five;

public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
    }

    /**
     * 1: Create a double variable called value, create another double variable called valueSquareRoot
     * <p>
     * Use Math.sqrt to find the square root of value and assign it to valueSquareRoot
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        //Creating a variable of type double
        double value = 25d;
        //Creating another variable and assigning it the squared root of the previous variable
        double valueSquareRoot = Math.sqrt(value);
        //Printing all the variables
        System.out.println("The value is: " + value + " The squared root of the value is: " + valueSquareRoot);

    }

    /**
     * 2: See the code below
     * <p>
     * Print out the highest value using Math.max()
     * <p>
     * Then print out the lowest value using Math.min()
     * <p>
     * You must put your variables into these methods and separate them with a comma
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        int valueA = 5;
        int valueB = 10;

        System.out.println("Max=" + Math.max(valueA, valueB));
        System.out.println("Min=" + Math.min(valueA, valueB));

        // Write your code here
    }

    /**
     * 3: Use Modulus (%) to calculate the remaining amount of money if we buy as many burgers as possible, print remainder
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        int totalMoney = 50;
        int costPerBurger = 9;
        // Write your code here
        int remainingMoneyAfterBuyingAsMuchBurgerAsPossible = totalMoney % costPerBurger;
        System.out.println("Remainder=" + remainingMoneyAfterBuyingAsMuchBurgerAsPossible);
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * I've chosen loads of methods from the Math Library, write comments above each line to guess what they do!
     * <p>
     * You do not need to write any code
     * <p>
     * Answers can be found in resources
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4 (Bonus!):");

        double ourValue = 4.5;

        // Rounds up a double value
        System.out.println(ourValue + " after using ceiling=" + Math.ceil(ourValue));
        // Rounds down a double value
        System.out.println(ourValue + " after using floor=" + Math.floor(ourValue));
        // Rounds a double value up or down based to the closest integer
        System.out.println(ourValue + " after using round=" + Math.round(ourValue));
        // Square the value
        System.out.println(ourValue + " after using powerOf with the value of 2=" + Math.pow(ourValue, 2));
        // Cube the value
        System.out.println(ourValue + " after using powerOf with the value of 3=" + Math.pow(ourValue, 3));
        // Multiply the value by a random number that is set between 0 (inclusive) and 1 (exclusive)
        System.out.println(ourValue + " times random =" + Math.random() * ourValue);
    }
}