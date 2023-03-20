package it.develhope2.exercise_seventeen;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise3();
    }

    /**
     * 1: Write code and fix the program below, you want to accept the questionableFunds
     * into the account!
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        long myBankBalanceEuro = 500L;

        String suspiciousEmailMessage =
                """
                                    Hello Sir/Madam,
                                    
                                    I'm a prince here in [redacted] and I need help transferring my billions into 
                                    Italy, please provide your bank account details and I will pay you generously.
                                    
                                    Thanks
                        """;

        long questionableFundsEuro = 5_000_000_000L;

        myBankBalanceEuro += questionableFundsEuro;
        System.out.println(myBankBalanceEuro);
        //Add the questionable funds to your bank balance and print it out!
    }

    /**
     * 2: Given the following information, think about the MOST EFFICIENT (which uses least space)
     *    type to use to store such data. Why is this the most efficient?
     *
     *    long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     *    double = 16 decimal places
     *    float = 7 decimal places
     *    int = -2,147,483,648 to 2,147,483,647
     *    short = -32,768 to 32,768
     *    byte = -127 to 127
     *
     *    2a: Someone's age --> Short (It should be Byte but apparently Greg wanna live more than 127 years)
     *    2b: The age of a baby in months --> Byte
     *    2c: Money in a hedgefund in euros --> Long
     *    2d: Price of a good in euros on amazon.com --> Float
     *    2e: The exact weight of an apple measured by scientific equipment --> Double
     *    2f: The number of kilometers from any 2 places in the world --> Short
     */

    /**
     * 3: Use the LOCALDATE type (LocalDate.now()) to print out the current date
     * <p>
     * Play around with local date! What can you get it to do?
     * Use at least the following methods on myDate().
     * * getDayOfMonth()
     * * getDayOfWeek()
     * * getDayOfYear()
     * * getMonth()
     * * getMonthValue()
     * * use isBefore() and isAfter() to compare with other dates, use LocalDate.of(year, month, day) to
     * create other days
     */
    public static void exercise3() {
        System.out.println("Exercise 3:");
        LocalDate myDate = LocalDate.now();
        System.out.println(myDate);
        LocalDate christmasDate = LocalDate.of(2023, Month.DECEMBER, 25);
        LocalDate develhopeCourseStartingDay = LocalDate.of(2023, Month.JANUARY, 9);
        if (myDate.isBefore(christmasDate)) {
            int daysLeft = christmasDate.getDayOfMonth() - myDate.getDayOfMonth();
            int monthsLeft = christmasDate.getMonthValue() - myDate.getMonthValue();
            int yearsLeft = christmasDate.getYear() - myDate.getYear();
            System.out.println("There are " + daysLeft + " days " + monthsLeft + " months " + yearsLeft + " years left to Christmas!");
        }


        if (myDate.isAfter(develhopeCourseStartingDay)) {
            int daysPassed = myDate.getDayOfYear() - develhopeCourseStartingDay.getDayOfYear();
            int monthPassed = myDate.getMonthValue() - develhopeCourseStartingDay.getMonthValue();
            System.out.println("This is my " + daysPassed + "th day in develhope!");
            System.out.println("Develhope course started in " + develhopeCourseStartingDay.getMonth() + " and we are in " + myDate.getMonth());
            if (monthPassed > 0) {
                System.out.println("It's been more than " + monthPassed + " months!");
            }
        }
        switch (myDate.getDayOfWeek()) {
            case MONDAY -> System.out.println("Sorry to remind you, but today is Monday \uD83E\uDD72");
            case TUESDAY, WEDNESDAY, THURSDAY, FRIDAY ->
                    System.out.println("We are in the middle of the week, time to do some good work!");
            case SATURDAY, SUNDAY ->
                    System.out.println("WHAT ARE YOU DOING? WHY ARE YOU CORRECTING THE EXERCISES TODAY? IT'S WEEKEND! GRAB SOMETHING TO DRINK AND GO PARTY NOW!");
        }

    }
}
