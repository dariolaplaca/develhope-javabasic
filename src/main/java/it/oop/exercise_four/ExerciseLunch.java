package it.oop.exercise_four;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ExerciseLunch {
    private static final double MAX_PRICE = 5;
    private static final double MINIMUM_WEIGHT = 0;
    LocalDate myDate;
    private Double price = null;
    private String nameOfDayEaten = null;
    private int lunchWeightInGrams;
    private int numberOfTimesWeHaveGotPrice = 0;

    public ExerciseLunch(Double price, String nameOfDayEaten) {
        this.price = price;
        this.nameOfDayEaten = nameOfDayEaten;
    }

    public static void printMaxPrice() {
        System.out.println(MAX_PRICE);
    }

    private void printLunch() {
        System.out.println("Lunch{" +
                "price=" + price +
                ", nameOfDayEaten='" + nameOfDayEaten + '\'' +
                ", lunchWeightInGrams='" + lunchWeightInGrams + '\'' +
                '}');
    }

    public Double getPrice() {
        numberOfTimesWeHaveGotPrice = numberOfTimesWeHaveGotPrice + 1;
        return this.price;
    }

    public void setPrice(double price) {
        if (price > MAX_PRICE) {
            System.out.println("Cannot set greater than max price");
        } else {
            this.price = price;
        }
    }

    public int getNumberOfTimesWeHaveGotPrice() {
        return this.numberOfTimesWeHaveGotPrice;
    }

    private void setNumberOfTimesWeHaveGotPrice(int numberOfTimesWeHaveGotPrice) {
        this.numberOfTimesWeHaveGotPrice = numberOfTimesWeHaveGotPrice;
    }

    public String getNameOfDayEaten() {
        return nameOfDayEaten;
    }

    public void setNameOfDayEaten(String nameOfDayEaten) {
        String isADay = "";
        try {
            isADay = DayOfWeek.valueOf(nameOfDayEaten.toUpperCase()).toString();
        } catch (Exception IllegalArgumentException) {
            isADay = "Not a day";
        }
        if (nameOfDayEaten.toUpperCase().equals(isADay)) {
            this.nameOfDayEaten = nameOfDayEaten;
        } else {
            System.out.println("Not a day!");
        }
    }

    public int getLunchWeightInGrams() {
        return lunchWeightInGrams;
    }

    public void setLunchWeightInGrams(int lunchWeightInGrams) {
        if (lunchWeightInGrams > MINIMUM_WEIGHT) {
            this.lunchWeightInGrams = lunchWeightInGrams;
        } else {
            System.out.println("Weight can't be a negative value!");
        }
    }
}
