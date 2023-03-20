package it.java_advanced_3.exercise_one;

public record Person(String name, int age, String address) {
    @Override
    public String toString() {
        return this.name + " is " + this.age + " years old and lives in " + this.address ;
    }
}
