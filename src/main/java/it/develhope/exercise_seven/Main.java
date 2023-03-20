package it.develhope.exercise_seven;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Using the 'Integer' and the String class, convert ourNumber below to an int
     * <p>
     * Once this is converted to an int, increase its value by 2
     * <p>
     * Then convert this back to a string and print it, it should be 90 and not 882
     */
    private static void exercise1() {
        System.out.println("\nExercise 1:");
        String ourNumberStr = "88";
        //Write your code here
        //Creating a new int variable and set it to the integer value of ourNumberStr
        int ourStrNumber = Integer.valueOf(ourNumberStr);
        //Adding 2 to the new integer
        ourStrNumber += 2;
        //Creating a new String variable and storing the parsed String of the integer
        String ourNewStrNumber = String.valueOf(ourStrNumber);
        //Printing the outputs
        System.out.println("Our string number was: " + ourNumberStr + "\nOur new string number is: " + ourNewStrNumber);

    }

    /**
     * 2a: Convert ourChar to a String, make it uppercase
     * <p>
     * 2b: Play around line 37, experiment the integer of 0 to a number where it prints 'w', instead of 'H'
     * think about what the charAt method is doing?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2a:");
        char ourChar = 'a';
        String ourCharString = String.valueOf(ourChar).toUpperCase(); // <--- Change this line
        // Notice below what happens, the `charAt()` method
        System.out.println(ourCharString.charAt(0));

        System.out.println("\nExercise 2b:");
        String anotherString = "Hello world";
        int charAtIndex = 6; // <--- Change this line
        System.out.println("Make this print 'w' -> current result: '" + anotherString.charAt(charAtIndex) + "'");
    }


    /**
     * 3: This exercise currently throws 'exceptions' (big red error messages in our console)
     * <p>
     * Change the 3 lines indicated below so it no longer crashes, think about the type
     * conversions. "hello" can't be a number
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        String intStrToConvert = "5"; // Change this line
        System.out.println(Integer.valueOf(intStrToConvert));

        String booleanStrToConvert = "maybe"; // And this line
        System.out.println(Boolean.valueOf(booleanStrToConvert));

        String doubleStrToConvert = "5.5"; // Also this line
        System.out.println(Double.valueOf(doubleStrToConvert));
    }


    /**
     * 4: Given our string 'startStr'
     * 4.1: use a string method to make sure it can convert to an int and convert it to an int
     * 4.2: Times our number by 2
     * 4.3: Convert back to a string, and concatenate our number with itself,
     * (i.e. 4 concatenated with itself is 44, not 8)
     * 4.4: Convert to a double and divide our number by 3.5
     * 4.5: Use Math.floor to remove decimal places on our number
     * <p>
     * Your result should be 288.0!
     */
    private static void exercise4() {
        System.out.println("\nExercise 4:");
        String startStr = "5 ";
        // Write your code here
        //Create a variable to store the integer value of our String
        int startInt = Integer.valueOf(startStr.trim());
        //Double it and give it to the next person
        startInt *= 2;
        //Concatenate the String value and set it back to Int
        startInt = Integer.valueOf(String.valueOf(startInt) + String.valueOf(startInt));
        //Creating a double variable to store our value divided by 3.5
        double finalDouble = startInt / 3.5d;
        //Rounding the value
        finalDouble = Math.floor(finalDouble);
        //Printing the value
        System.out.println("Expected value:288.0\nOur value:" + finalDouble);

    }
}