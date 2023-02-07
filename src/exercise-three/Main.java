public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        // Storing age in a variable
        int myAge = 25;
        // Printing out the variable
        System.out.println("I am " + myAge + " years old.");

    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        //Write your code here
        // Storing my age and my initial in two different variables
        int myAge = 25;
        char myInitial = 'D';
        // Printing the output
        System.out.println("My Age= " + myAge +", my initial= " + myInitial);
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        //Print in a line the number of the exercise
        System.out.println("\nExercise 3:");
        //Store a boolean literal in a variable to know if lunch was eaten and set it to false
        boolean hasEatenLunch = false;
        //Store the price of the lunch as a double
        double lunchCost = 5.99;
        //Print the price of the lunch
        System.out.println("Lunch cost=" + lunchCost);
        //Print if lunch was eaten
        System.out.println("Has Eaten lunch=" + hasEatenLunch);
    }
}
