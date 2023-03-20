package it.develhope2.exercise_thirteen;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Add 8 random integers to the array list
     * <p>
     * Print out the first item
     * <p>
     * Remove the first 3 items
     * <p>
     * Then print out the first remaining item
     */
    public static void exercise1() {
        System.out.println("Exercise 1:");
        // Creating the array list to store our integers
        ArrayList<Integer> numbers = new ArrayList<>();
        // Adding 8 integers to the  with a range of values 0 to 99
        for (int i = 0; i < 8; i++) {
            numbers.add((int) (Math.random() * 100));
        }
        // Printing the first item
        System.out.println(numbers.get(0));
        // Removing the first 3 items from the list
        numbers.subList(0, 3).clear();
        // Printing the new first item
        System.out.println(numbers.get(0));
    }

    /**
     * 2: Create 2 Array Lists,
     * <p>
     * A list of strings called 'menuItems'
     * <p>
     * And a list of Doubles called 'menuPrices'
     * <p>
     * The indexes of these two lists correspond to eachother
     * <p>
     * Create a print statement to output the name and price of each
     * menu item correspond
     */
    public static void exercise2() {
        System.out.println("\nExercise 1:");
        // Creating two ArraysLists, one for the dish's names and the other one for the dish's prices
        ArrayList<String> menuItems = new ArrayList<>(Arrays.asList("Fries", "Chicken Wings", "Hamburger", "Cheeseburger", "Pizza"));
        ArrayList<Double> menuPrices = new ArrayList<>(Arrays.asList(3.99d, 5.99d, 6.99d, 8.99d, 9.99d));
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i) + " " + menuPrices.get(i) + "€");
        }
    }

    /**
     * 3: I changed this to an int array after recording!
     * <p>
     * You'll still need to find the total but using [index] instead of .get(index)
     * <p>
     * Find the total sum of all items in the ArrayList below.
     * <p>
     * Use the + operator
     * <p>
     * print the total
     */
    public static void exercise3() {
        System.out.println("\nExercise 3:");
        int[] items = new int[]{5, 10404, -234348, -53, 9, 91, 92, 34534, 12334, 1435};
        // Creating a variable to store the total sum
        int totalSum = 0;
        // Looping through the Array and summing all elements to our total sum
        for (int item : items) {
            totalSum += item;
        }
        // Printing the total sum
        System.out.println("The total sum is " + totalSum);
    }
}
