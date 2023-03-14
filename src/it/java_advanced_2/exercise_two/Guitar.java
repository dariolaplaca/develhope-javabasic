package it.java_advanced_2.exercise_two;

public class Guitar extends Instrument{
    public Guitar(String name, String brand){
        super(name, brand);
    }
    @Override
    public void play() {
        System.out.println("Guitar is playing!\nIt's a " + this.name + " " + this.brand);
    }
}
