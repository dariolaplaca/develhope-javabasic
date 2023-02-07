package it.develhope.exercise_six;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Create a String to hold some text, decide on the text you want it to hold and then name it appropriately
     *
     *    print out your string in upper case, and in lower case
     */
    private static void exercise1() {
        System.out.println("\nExercise 1:");
        //Write your code here
        //Create a String variable
        String myFirstName = "Dario";
        //Print my string
        System.out.println("My name is " + myFirstName);
        //Print my string in upper case
        System.out.println("My name in upper case is " + myFirstName.toUpperCase());
        //Print my string in lower case
        System.out.println("My name in lower case is " + myFirstName.toLowerCase());
    }

    /**
     * 2: Edit the code below so it prints out the first name and last name in uppercase, and the middle name in lower case
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        // Change these
        String firstName = "Dario";
        String middleName = "Wolfie";
        String lastName = "La Placa";

        System.out.println(firstName.toUpperCase() + " " + middleName.toLowerCase() + " " + lastName.toUpperCase()); // <--- Edit this line
    }


     /**
     * 3: Assign the value of 2 or more primitive types to our variable textFrom2Primitives
     *
     * Use the '+' operator
     *
     * choose from these primitives: double, int, char, boolean
     * use primitive literals like: 1.5, 67, 'b', true
     *
     * +
     *
     * Experiment with these different types, how do an int and a double behave when added?
     *
     * What about a boolean and an int?
      *
      * "" + 1.5
     *
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        /*
        *   If we add any primitive to a String they will just auto-cast to string
        *
        *   If we add an int to a double the int will auto-cast to a double
        *   If we add an int and a char it will give an int representing the Unicode of the char plus the int added
        *
        *   If we add a boolean to any type of primitive it will give a compile-time error since there will be a mismatch error
        *
        *   If we add a char and a double it will auto cast the char to Unicode and then sum it to the double
        * */
        String textFrom2Primitives = "All the behaviours examined"; // <--- Edit this line
        System.out.println(textFrom2Primitives);
    }


     /**
     * 4: Without editing the Strings below make the print statement print
     *
     *    1 2 3 4 5 6 7 8 9 with the correct spacing in between all the numbers
     *
     *    You will need to use .trim()
     */
    private static void exercise4() {
        System.out.println("\nExercise 4:");
        String endNumbers = "7 8 9";
        String middleNumbers = "       4 5 6";
        String earlyNumbers = "1 2 3";

        System.out.println(earlyNumbers + " " +middleNumbers.trim() + " " + endNumbers); // <--- Write your code here
    }


}