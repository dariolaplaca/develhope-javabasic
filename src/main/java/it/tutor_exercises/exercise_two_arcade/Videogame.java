package it.tutor_exercises.exercise_two_arcade;

import java.util.HashMap;
import java.util.Map;

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

    public void setName(String name) {
        this.name = name;
    }

    public Difficulty getDifficulty() {
        return this.difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public HashMap<User, Integer> getLocalScoreboard() {
        return this.localScoreboard;
    }

    // Questo metodo aggiunge un utente ed un punteggio alla classifica locale
    public void addScore(User user, int score) {
        this.localScoreboard.put(user, score);
    }

    public void printLocalScoreboard() {
        int index = 0;
        final int POSITIONS_TO_ITERATE = 3;
        System.out.println("\n\t\t" + this.name);
        for (Map.Entry<User, Integer> entry : localScoreboard.entrySet()) {
            System.out.println("\t" + entry.getKey() + ":" + entry.getValue());
            index++;
            if (index == POSITIONS_TO_ITERATE) {
                break;
            }
        }
    }


}
