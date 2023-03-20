package it.tutor_exercises.exercise_two_arcade;

import java.util.*;
import java.util.stream.Collectors;

public class Arcade {
    private HashMap<User, Integer> globalScoreBoard = new HashMap<>();
    private HashSet<Videogame> gameSet = new HashSet<>();

    public void addUser(User user) {
        this.globalScoreBoard.put(user, 0);
    }

    public void addVideogame(Videogame videogame) {
        this.gameSet.add(videogame);
    }

    public void printGlobalScoreBoard() {
        System.out.println("\n\tGLOBAL SCOREBOARD");
        LinkedHashMap<User, Integer> sortedScoreboard = sortGlobalScoreboard(true);
        int index = 0;
        for (Map.Entry<User, Integer> entry : sortedScoreboard.entrySet()) {
            System.out.println("\t\t" + entry.getKey() + ":" + entry.getValue());
            index++;
            if (index == 3) {
                break;
            }
        }
    }

    public User retrieveUserByName(String username) {
        User retrievedUser = new User("");
        for (Map.Entry<User, Integer> entry : globalScoreBoard.entrySet()) {
            if (Objects.equals(username, entry.getKey().getUsername())) {
                retrievedUser = entry.getKey();
            }
        }
        return retrievedUser;
    }

    public User retrieveUserById(int id) {
        User retrievedUser = null;
        for (Map.Entry<User, Integer> entry : globalScoreBoard.entrySet()) {
            if (id == entry.getKey().getId()) {
                retrievedUser = entry.getKey();
            }
        }
        return retrievedUser;
    }

    public Videogame retrieveVideogameByName(String name) {
        Videogame retrievedVideogame = null;
        for (Videogame videogame : gameSet) {
            if (Objects.equals(name, videogame.getName())) {
                retrievedVideogame = videogame;
            }
        }
        return retrievedVideogame;
    }

    public Videogame retrieveVideogameById(int id) {
        Videogame retrievedVideogame = null;
        for (Videogame videogame : gameSet) {
            if (id == videogame.getId()) {
                retrievedVideogame = videogame;
            }
        }
        return retrievedVideogame;
    }

    public void addPlayedGame(Videogame videogame, User user, int score) {
        int oldRecord;
        try {
            oldRecord = videogame.getLocalScoreboard().get(user);
        } catch (NullPointerException e) {
            oldRecord = 0;
        }
        if (score > oldRecord) {
            videogame.addScore(user, score);
        }
        score *= videogame.getDifficulty().difficultyMultiplier();
        if (globalScoreBoard.size() == 0) {
            globalScoreBoard.put(user, score);
        } else if (globalScoreBoard.containsKey(user) && globalScoreBoard.get(user) < score) {
            globalScoreBoard.put(user, score);
        } else if (globalScoreBoard.containsKey(user) && globalScoreBoard.get(user) > score) {
            System.out.println("You have already an higher score!");
        } else {
            LinkedHashMap<User, Integer> sortedGS = sortGlobalScoreboard(false);
            System.out.println(sortedGS);
            boolean isFound = false;
            for (Map.Entry<User, Integer> entry : sortedGS.entrySet()) {
                if (score > entry.getValue() && !isFound) {
                    globalScoreBoard.put(user, score);
                    isFound = true;
                }
            }
        }
    }

    public LinkedHashMap<User, Integer> sortGlobalScoreboard(boolean descending) {
        if (descending) {
            return globalScoreBoard.entrySet().stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                            (oldValue, newValue) -> newValue, LinkedHashMap::new));
        }
        return globalScoreBoard.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> newValue, LinkedHashMap::new));
    }

    public LinkedList<User> getTopThree() {
        TreeMap<Integer, HashSet<User>> treeMap = new TreeMap<>(Collections.reverseOrder());
        for (Map.Entry<User, Integer> entry : globalScoreBoard.entrySet()) {
            HashSet<User> oldSet;
            if (treeMap.containsKey(entry.getValue())) {
                oldSet = treeMap.get(entry.getKey());
            } else {
                oldSet = new HashSet<>();
            }
            oldSet.add(entry.getKey());
            treeMap.put(entry.getValue(), oldSet);
        }
        LinkedList<User> finalOutput = new LinkedList<>();
        int i = 0;
        for (Map.Entry<Integer, HashSet<User>> entry : treeMap.entrySet()) {
            HashSet<User> currentSet = entry.getValue();
            for (User u : currentSet) {
                finalOutput.add(u);
                i++;
                if (i == 3) {
                    break;
                }
            }
            if (i == 3) {
                break;
            }
        }
        return finalOutput;
    }


}
