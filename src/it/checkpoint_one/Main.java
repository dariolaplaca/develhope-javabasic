package it.checkpoint_one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Punto", "Fiat", "AA000AA", 5000, 10, false);
        Car car2 = new Car("Panda", "Fiat", "BB000BB", 7000, 30, false);
        Car car3 = new Car("A1", "Tesla", "CC101CC", 50000, 20, true);
        Car car4= new Car("C3", "Citroen", "DD000DD", 6500, 30, false);

        ArrayList<Car> carList1 = new ArrayList<>(Arrays.asList(car1, car2));

        CarShop concA = new CarShop("concA", "Via Casa Mia 1", carList1);
        CarShop concB = new CarShop("concB", "Via Casa Mia 3");

        concB.addCar(car3);
        concB.addCar(car4);

        for(Car c : concA.getCarList()){
            if(c.isGreen()){
                System.out.println(c.getModel() + " is green!");
            }
        }

        if(concA.getCarsMeanPrice() > concB.getCarsMeanPrice()){
            System.out.println(concA.getName() + " has a bigger mean price than " + concB.getName());
        } else {
            System.out.println(concB.getName() + " has a bigger mean price than " + concA.getName());
        }

        HashSet<Car> carList2 = new HashSet<>();
        carList2.addAll(concA.getCarList());
        carList2.addAll(concB.getCarList());

        double priceSum = 0;

        for(Car c : carList2){
            priceSum += c.getPrice();
        }
        System.out.println("The total price of all the cars is " + priceSum);
    }

}
