package it.tutor_exercises.exercise_three_checkpointSimulation;

import java.util.HashSet;

public class Team {

    //ATTRIBUTES
    private int id;
    private static int idCounter;
    private String name;
    private HashSet<FootballPlayer> teamRoster;

    //CONSTRUCTORS
    public Team(String name) {
        this.name = name;
        teamRoster = new HashSet<>();
    }

    public Team(String name, HashSet<FootballPlayer> players) {
        this.name = name;
        teamRoster = players;
    }

    //GETTERS


    public String getName() {
        return this.name;
    }

    public HashSet<FootballPlayer> getTeamRoster() {
        return this.teamRoster;
    }

    public void printTeam(){
        for (FootballPlayer p : teamRoster){
            System.out.println(p.getName() + " " + p.getSurname());
        }
    }

    public void addPlayer(FootballPlayer p){
        teamRoster.add(p);
    }

}
