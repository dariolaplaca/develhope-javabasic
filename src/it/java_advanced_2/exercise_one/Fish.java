package it.java_advanced_2.exercise_one;

public class Fish extends Animal{
    private String species;

    public Fish(double height, double weight, String species) {
        super(height, weight);
        this.species = species;
        setName(species);
        setSpeed(swimSpeedMetersPerSecond());
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double swimSpeedMetersPerSecond(){
        return getWeight() * 2;
    }
}
