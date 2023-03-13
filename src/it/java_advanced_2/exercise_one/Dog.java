package it.java_advanced_2.exercise_one;

public class Dog extends Animal{
    private String breed;
    public Dog(double weight, double height, String breed){
        super(weight, height);
        this.breed = breed;
        setName(breed);
        setSpeed(runSpeedMetersPerSecond());
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double runSpeedMetersPerSecond(){
        return getHeight() * 2;
    }
}
