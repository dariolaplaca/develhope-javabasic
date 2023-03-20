package it.tutor_exercises.exercise_three_checkpointSimulation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        FootballPlayer player1 = new FootballPlayer("Dario", "La Placa");
        FootballPlayer player2 = new FootballPlayer("Marco", "Marchini");
        FootballPlayer player3 = new FootballPlayer("Claudio", "Claudioni");
        FootballPlayer player4 = new FootballPlayer("Aldo", "Baglio");
        FootballPlayer player5 = new FootballPlayer("Francesco", "Totti");

        HashSet<FootballPlayer> firstRoster = new HashSet<>(Set.of(player1, player2, player3));

        Team teamA = new Team("Team A", firstRoster);
        Team teamB = new Team("Team B");
        teamB.addPlayer(player4);
        teamB.addPlayer(player5);

        //GIVE RANDOM VALUES TO ASSIST GOALS AND PRESENCES OF TEAM A
        for (FootballPlayer p : teamA.getTeamRoster()) {
            p.setAssists((int) (Math.random() * 11));
            p.setScoredGoals((int) (Math.random() * 11));
            p.setNumberOfParticipation((int) (Math.random() * 50));
        }


        System.out.println("Scored at least 5 goals or 7 assists and take presence in more than 20 matches");
        for (FootballPlayer p : teamA.getTeamRoster()) {
            if ((p.getScoredGoals() >= 5 || p.getAssists() >= 7) && p.getNumberOfParticipation() >= 20) {
                System.out.println(p.getName() + " " + p.getSurname() + " GOALS: " + p.getScoredGoals() + " ASSITS: " + p.getAssists() + " PRESENCES: " + p.getNumberOfParticipation());
            }
        }

        System.out.println("---------------------------------------------------------------");

        HashSet<FootballPlayer> teamCRoster = new HashSet<>();
        teamCRoster.addAll(teamA.getTeamRoster());
        teamCRoster.addAll(teamB.getTeamRoster());
        Team teamC = new Team("Team C", teamCRoster);

        //GIVE RANDOM VALUES TO ASSIST GOALS AND PRESENCES OF TEAM C

        for (FootballPlayer p : teamC.getTeamRoster()) {
            p.setAssists((int) (Math.random() * 17));
            p.setScoredGoals((int) (Math.random() * 17));
            p.setNumberOfParticipation((int) (Math.random() * 35));
        }

        HashMap<FootballPlayer, Double> playersMap = new HashMap<>();
        for (FootballPlayer p : teamC.getTeamRoster()) {
            playersMap.put(p, p.score());
        }

        for (Map.Entry<FootballPlayer, Double> entry : playersMap.entrySet()) {
            if (entry.getValue() > 0.6) {
                System.out.println(entry.getKey().getName() + " " + entry.getKey().getSurname() + " Score: " + entry.getValue());
            }
        }

    }
}
