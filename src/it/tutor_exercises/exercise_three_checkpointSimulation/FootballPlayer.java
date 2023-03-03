package it.tutor_exercises.exercise_three_checkpointSimulation;

public class FootballPlayer {

    //ATTRIBUTES
    private int id;
    private static int idCounter;
    private String name;
    private String surname;
    private int numberOfParticipation;
    private int scoredGoals;
    private int assists;
    private Team ownTeam;

    //CONSTRUCTOR

    public FootballPlayer(String name, String surname) {
        id = ++idCounter;
        this.name = name;
        this.surname = surname;
    }

    //GETTERS

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getNumberOfParticipation() {
        return this.numberOfParticipation;
    }

    public int getScoredGoals() {
        return this.scoredGoals;
    }

    public int getAssists() {
        return this.assists;
    }

    public Team getOwnTeam(){
        return this.ownTeam;
    }

    //SETTERS


    public void setNumberOfParticipation(int numberOfParticipation) {
        this.numberOfParticipation = numberOfParticipation;
    }

    public void setScoredGoals(int scoredGoals) {
        this.scoredGoals = scoredGoals;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public void setOwnTeam(Team team) {
        this.ownTeam = team;
    }

    public double score(){
        return (scoredGoals + (0.75 * assists)) / numberOfParticipation;
    }
}
