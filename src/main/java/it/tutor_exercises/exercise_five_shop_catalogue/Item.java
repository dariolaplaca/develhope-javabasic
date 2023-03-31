package it.tutor_exercises.exercise_five_shop_catalogue;

public class Item extends Product implements Discountable{
    private double discount;
    ProductType type;
    private final int id;
    private static int idCounter = 0;

    public Item(String name, double price, ProductType type) {
        super(name, price);
        this.discount = 0;
        this.type = type;
        id = ++idCounter;
    }

    public ProductType getType() {
        return this.type;
    }

    public double getDiscount() {
        return this.discount;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public void applyDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double calculateDiscountedPrice() {
        return getPrice() - (getPrice() * discount / 100);
    }

    @Override
    public String toString() {
        return this.getName() + "," + this.getPrice() + "," + getType() + "," + discount;
    }
}
