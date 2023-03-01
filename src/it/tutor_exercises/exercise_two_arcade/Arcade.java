package it.tutor_exercises.exercise_two_arcade;

import java.util.HashMap;
import java.util.HashSet;

public class Arcade {
    private HashMap<User, Integer> globalScoreBoard = new HashMap<>();
    private HashSet<Videogame> gameSet = new HashSet<>();

    public void addUser(User user){
        this.globalScoreBoard.put(user, 0);
    }

    public void addVideogame(Videogame videogame){
        this.gameSet.add(videogame);
    }

    public void addPlayedGame(Videogame videogame, User user, int score){
        int oldRecord = videogame.getLocalScoreboard().get(user);
        if(score > oldRecord){
            videogame.addScore(user, score);
        }
    }

}
