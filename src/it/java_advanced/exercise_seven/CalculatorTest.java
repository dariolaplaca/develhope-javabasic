package it.java_advanced.exercise_seven;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    /**
     * 1:
     *
     *
     * Create JUnit test for the add() and subtract() methods in the Calculator class.
     *
     * Test the methods with multiple test cases, including positive and negative numbers, and zero.
     *
     * Verify that the methods return the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise1() {
        System.out.println("\nExercise 1: ");
        Calculator c = new Calculator();
        Assertions.assertEquals(5, c.add(3, 2));
        Assertions.assertEquals(-5, c.add(-3, -2));
        Assertions.assertEquals(7, c.add(-10, 17));
        Assertions.assertEquals(0, c.add(0, 0));

        Assertions.assertEquals(1, c.subtract(3, 2));
        Assertions.assertEquals(-1, c.subtract(-3, -2));
        Assertions.assertEquals(-27, c.subtract(-10, 17));
        Assertions.assertEquals(0, c.subtract(0, 0));
        // Your code here
    }

    /**
     * 2:
     *
     *
     * Create JUnit test for the multiply() and divide() methods in the Calculator class.
     *
     * Test the same kind of inputs as before as exercise 1
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     */
    @Test
    void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here

        Calculator c = new Calculator();
        Assertions.assertThrows(ArithmeticException.class, () -> c.divide(10, 0));
        Assertions.assertEquals(6, c.multiply(3, 2));
        Assertions.assertEquals(6, c.multiply(-3, -2));
        Assertions.assertEquals(-170, c.multiply(-10, 17));
        Assertions.assertEquals(0, c.multiply(0, 0));
        Assertions.assertEquals(0, c.multiply(100, 0));

        Assertions.assertEquals(3, c.divide(6, 2));
        Assertions.assertEquals(3, c.divide(-6, -2));
        Assertions.assertEquals(-17, c.divide(-170, 10));
        Assertions.assertEquals(0, c.divide(0, 100));
    }

    /**
     * 3:
     *
     * Create a JUnit test for the power() method in the Calculator class that raises a number to a power.
     * Test the method with test cases where the base is zero, positive, and negative - the exponent is zero, one and negative
     * Test with decimals too!
     * Verify that the method returns the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     * Don't just write tests that use the result of the program as the expected!!
     */
    @Test
    void exercise3() {
        System.out.println("\nExercise 3: ");
        Calculator c = new Calculator();
        Assertions.assertEquals(1, c.power(10, 0));
        Assertions.assertEquals(10, c.power(10, 1));
        Assertions.assertEquals(100, c.power(10, 2));
        Assertions.assertEquals(0.01, c.power(10, -2));

        Assertions.assertEquals(0, c.power(0, 2));
        Assertions.assertEquals(1, c.power(0, 0));
        Assertions.assertEquals(100, c.power(-10, 2));
        Assertions.assertEquals(-1000, c.power(-10, 3));
        // Your code here
    }
}