package it.checkpoint_one;

import java.util.ArrayList;

public class CarShop {
    private String name;
    private String address;
    private ArrayList<Car> carList;

    public CarShop(String name, String address, ArrayList<Car> carList) {
        this.name = name;
        this.address = address;
        this.carList = carList;
    }
    public CarShop(String name, String address) {
        this.name = name;
        this.address = address;
        this.carList = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public ArrayList<Car> getCarList() {
        return this.carList;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addCar(Car c){
        getCarList().add(c);
    }

    public double getCarsMeanPrice(){
        double meanPrice = 0;
        for(Car c : carList){
            meanPrice += c.getPrice();
        }
        meanPrice /= carList.size();
        return meanPrice;
    }

}
