package it.tutor_exercises.exercise_two_arcade;

import java.util.HashMap;

public class Videogame {

    private static int idCounter = 0;
    private int id;
    private String name;
    private Difficulty difficulty;
    private HashMap<User, Integer> localScoreboard;

    public Videogame(String name, Difficulty difficulty) {
        this.id = ++idCounter;
        this.name = name;
        this.difficulty = difficulty;
        this.localScoreboard = new HashMap<>();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Difficulty getDifficulty() {
        return this.difficulty;
    }

    public HashMap<User, Integer> getLocalScoreboard() {
        return this.localScoreboard;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }


    // Questo metodo aggiunge un utente ed un punteggio alla classifica locale
    public void addScore(User user, int score){
        this.localScoreboard.put(user, score);
    }


}
