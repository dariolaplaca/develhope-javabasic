package it.java_advanced_2.exercise_two;

public class Piano extends Instrument {

    Piano(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println("Piano is playing!\nIt's a " + this.name + " " + this.brand);
    }
}
