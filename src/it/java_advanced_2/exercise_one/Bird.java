package it.java_advanced_2.exercise_one;

public class Bird extends Animal{
    private double wingSpan;
    private String species;

    public Bird(double height, double weight, double wingSpan, String species) {
        super(height, weight);
        this.wingSpan = wingSpan;
        this.species = species;
        setSpeed(flySpeedMetersPerSecond());
        setName(species);
    }

    public double getWingSpan() {
        return this.wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double flySpeedMetersPerSecond(){
        return getWingSpan() * 4;
    }
}
