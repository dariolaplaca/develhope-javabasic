package it.tutor_exercises.exercise_two_arcade;

public class User {
    private static int idCounter = 0;
    private int id;
    private String username;

    public User(String username) {
        this.username = username;
        this.id = ++idCounter;
    }

    public int getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
