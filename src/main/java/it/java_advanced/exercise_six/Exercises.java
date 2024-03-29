package it.java_advanced.exercise_six;

import java.time.Month;
import java.util.ArrayList;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        for (Enum<Days> day : Days.values()) {
            System.out.println(day);
        }
    }

    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        for (Seasons s : Seasons.values()) {
            System.out.println(s);
            for (Month m : s.rangeOfMonth) {
                System.out.println(m);
            }
            System.out.println();
        }
    }

    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        System.out.println(getNextState(TrafficLight.RED));
        System.out.println(getNextState(TrafficLight.GREEN));
        System.out.println(getNextState(TrafficLight.YELLOW));
        // Your code here

    }

    public static TrafficLight getNextState(TrafficLight currentLight) {
        int nextState = currentLight.getState() + 1;
        if (nextState > 2) {
            nextState = 0;
        }
        for (TrafficLight t : TrafficLight.values()) {
            if (nextState == t.getState()) {
                return t;
            }
        }
        return currentLight;
    }

    /**
     * 4:
     * <p>
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     * <p>
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        for (Days d : Days.values()) {
            if (d.isWeekend()) {
                System.out.println(d + " is weekend!");
            } else {
                System.out.println(d + " is weekday...");
            }
        }
        // Your code here
    }

    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here

        double num1 = 5;
        double num2 = 2;
        System.out.println(operationsWithEnumOperator(num1, num2, Operator.ADD));
        System.out.println(operationsWithEnumOperator(num1, num2, Operator.SUBTRACT));
        System.out.println(operationsWithEnumOperator(num1, num2, Operator.DIVIDE));
        System.out.println(operationsWithEnumOperator(num1, num2, Operator.MULTIPLY));
    }

    public static double operationsWithEnumOperator(double a, double b, Operator o) {
        switch (o) {
            case ADD -> {
                return a + b;
            }
            case SUBTRACT -> {
                return a - b;
            }
            case DIVIDE -> {
                return a / b;
            }
            case MULTIPLY -> {
                return a * b;
            }
            default -> {
                System.out.println("Operation or numbers not valid.");
                return 0;
            }
        }
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     * <p>
     * <p>
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     * <p>
     * Loop over the values with Days.values() and print them out.
     */
    private enum Days {
        MONDAY(false),
        TUESDAY(false),
        WEDNESDAY(false),
        THURSDAY(false),
        FRIDAY(true),
        SATURDAY(true),
        SUNDAY(true);

        private final boolean isWeekend;

        Days(boolean isWeekend) {
            this.isWeekend = isWeekend;
        }

        public boolean isWeekend() {
            return this.isWeekend;
        }
    }

    /**
     * 2:
     * <p>
     * <p>
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     * <p>
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     */

    private enum Seasons {
        SPRING(Month.MARCH, Month.APRIL, Month.MAY),
        SUMMER(Month.JUNE, Month.JULY, Month.AUGUST),
        FALL(Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER),
        WINTER(Month.DECEMBER, Month.JANUARY, Month.FEBRUARY);

        final ArrayList<Month> rangeOfMonth = new ArrayList<>();

        private Seasons(Month firstMonth, Month secondMonth, Month thirdMonth) {
            rangeOfMonth.add(firstMonth);
            rangeOfMonth.add(secondMonth);
            rangeOfMonth.add(thirdMonth);
        }

        public ArrayList<Month> getMonths() {
            return rangeOfMonth;
        }
    }

    /**
     * 3:
     * <p>
     * <p>
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     * <p>
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     */

    private enum TrafficLight {
        RED(2),
        YELLOW(1),
        GREEN(0);

        private final int state;

        private TrafficLight(int state) {
            this.state = state;
        }

        public int getState() {
            return this.state;
        }
    }

    /**
     * 5:
     * <p>
     * <p>
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     * <p>
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */

    private enum Operator {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE;
    }

}
