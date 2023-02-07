package it.develhope.exercise_four;
public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
        exercise5Bonus();
        playAroundWithModulus();
    }

    /*
            Remember the symbols you need to do maths are

            Plus = +
            Minus = -
            Multiply or times = *
            Divide = /
     */

    /**
     * 1: Create an int variable, add 1 to the value and then print it. Use the + operator
     * Then minus 1 from the same variable and print it.
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        //Create a variable myNumber, set it to 10 then print it
        int myNumber = 10;
        System.out.println("My number is " + myNumber);
        //Increase myNumber by 1
        myNumber++;
        //Print the variable myNumber
        System.out.println("My number plus one is " + myNumber);
        //Decrease myNumber by 1
        myNumber--;
        //Print the variable myNumber
        System.out.println("My number minus one is " + myNumber);

    }

    /**
     * 2: Create a double variable, times by 2 and then print it.
     * <p>
     * Create another double variable, which is the previous variable divided by 2
     * and then print it
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        // Write your code here
        //Create a variable of type double and print it
        double myDouble = 3.99d;
        System.out.println("My double is " + myDouble);
        //Multiply the variable by 2
        myDouble *= 2;
        //Print the variable myDouble
        System.out.println("My double times 2 is " + myDouble);
        //Divide the variable by 2
        myDouble /= 2;
        //Print the variable myDouble
        System.out.println("My double divided by 2 is " + myDouble);
    }

    /**
     * 3: We are going to convert the temperature from celsius to fahrenheit
     * <p>
     * Create a double variable called celsius
     * <p>
     * Create a new variable called fahrenheit
     * <p>
     * The variable fahrenheit should be set as
     * celsius times by 1.8 plus 32
     * <p>
     * Print out celsius and fahrenheit with 2 print statements
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // Write your code here
        //Create a variable that store the temperature in celsius
        double celsius = 36.6d;
        //Create a variable that convert celsius to fahrenheit
        double fahrenheit = celsius * 1.8d + 32;
        //Print the two temperatures in 2 different print statements
        System.out.println("Temperature in celsius: " + celsius);
        System.out.println("Temperature in fahrenheit: " + fahrenheit);

    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age with a starting value of 10.
     * <p>
     * Only using the '++' operator increase this value to 15
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4:");
        // Write your code here
        //Create a variable that store the age and print it
        int age = 10;
        System.out.println("Age is " + age);
        //Create a while loop that increase age to 15 by using only the "++" operator
        while(age < 15){
            age++;
        }
        System.out.println("New age is " + age);
    }

    /**
     * 5: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age set as 50
     * <p>
     * Using the -= operator change this value from 50 to 0 in one line of code,
     * <p>
     * Underneath create another int called secondAge set as 50
     * <p>
     * Change this value from 50 to 0 in 3 lines of code
     */
    private static void exercise5Bonus() {
        System.out.println("\nExercise 5:");
        // Write your code here
        //Create an int variable that store the age, set it to 50 and then print it
        int age = 50;
        System.out.println("Age: " + age);
        //Change the value of age to 0 using "-=" operator in one line of code
        age -= age;
        System.out.println("New age: " + age);
        //Create a variable second age, set it to 50 and then print it
        int secondAge = 50;
        System.out.println("Second age: " + secondAge);

        //Change the value of secondAge to 0 using a while loop in 3 lines of code
        while (secondAge > 0){
            secondAge--;
        }

        System.out.println("New second age: " + secondAge);
    }

    /**
     * This is completely optional, but if you guys want to play around with
     * modulus to get a better understanding. Simply change the code below
     */
    private static void playAroundWithModulus() {
        System.out.println("\nModulus testing!:");

        int value = 12;   // <--- change this value
        int modulus = 5; // <--- and this value to see the results of modulus

        System.out.println("Modulus calculation, " + value + " % " + modulus +
                "= " + value % modulus);
    }

}
