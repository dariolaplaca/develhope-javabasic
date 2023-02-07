package it.develhope;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }


    /**
     * 1: Read the code below, change the 'porridgeHeatInCentigrade' so it prints out "Just right"
     */
    private static void exercise1() {
        System.out.println("\nExercise 1:");
        int porridgeHeatInCentigrade = 60; // <--- Change this value

        if (porridgeHeatInCentigrade < 60) {
            System.out.println("Too cold!");
        } else if (porridgeHeatInCentigrade > 60) {
            System.out.println("Too hot!");
        } else {
            System.out.println("Just right");
        }
    }

     /**
     * 2: Write an if statement that checks if we can afford lunch with the 2 variables, 'remainingMoney' and 'lunchCost'
     *
     *    Print: "Lunch time!" if you can afford lunch, if lunchCost is less than remainingMoney
     *    Print: "You go hungry today", if lunchCost is more than remaining money
     *
     *    Experiment with the values to check both conditions work
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        double remainingMoney = 15.0;
        double lunchCost = 5.0;

        // Your if statement here
        if(remainingMoney >= lunchCost){
            System.out.println("Lunch time!");
        } else {
            System.out.println("You go hungry today");
        }
    }

    /**
     * 3: Write an if statement that checks if a double value is greater than 2.5
     *
     *    If our value is greater than 2.5, print: "Greater than"
     *
     *    If our value is less than 2.5, do the following:
     *    * Add the value of 1.0 to 'ourDouble'
     *    * Print out "Still less than", if the value is still less than 2.5
     *    * Print out "Now greater than", if the value is now greater than 2.5
     *
     *    Remember we can have multiple lines of code inside our 'code blocks'
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        double ourDouble = 3.5;
        //Write your code here
    }


    /**
     * 4: Create an if statement with 4 outcomes, (1 if, 2 else if and an else)
     *
     *    That checks the following:
     *    1 - if our age is greater than OR EQUAL TO (>=) 65 print: "Retired"
     *    2 - if our age is greater than OR EQUAL TO 35 but less than 65 print "Experienced Worker"
     *    3 - if our age is greater than OR EQUAL TO 18 but less than 35 print "New Worker"
     *    4 - if our age is less than 18 print: "School age"
     *
     *    Remember, the order is very important!
     */
    private static void exercise4() {
        System.out.println("\nExercise 4:");

        int employeeAge = 30;

        //Write your if statement here
    }
}
