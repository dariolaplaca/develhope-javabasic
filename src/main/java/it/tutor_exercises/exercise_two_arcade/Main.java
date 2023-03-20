package it.tutor_exercises.exercise_two_arcade;

public class Main {
    public static void main(String[] args) {
        Arcade arcadeAdmin = new Arcade();
        User wolfie = new User("wolfie");
        User goofy = new User("goofy");
        User goku = new User("goku");
        User vegeta = new User("vegeta");


        Videogame tekken = new Videogame("Tekken", Difficulty.MEDIUM);
        Videogame superMario = new Videogame("Super Mario", Difficulty.EASY);
        Videogame tetris = new Videogame("Tetris", Difficulty.IMPOSSIBLE);
        Videogame arkanoid = new Videogame("Arkanoid", Difficulty.HARD);

        arcadeAdmin.addUser(wolfie);
        arcadeAdmin.addUser(goofy);
        arcadeAdmin.addUser(goku);
        arcadeAdmin.addUser(vegeta);

        arcadeAdmin.addVideogame(tekken);
        arcadeAdmin.addVideogame(superMario);
        arcadeAdmin.addVideogame(tetris);
        arcadeAdmin.addVideogame(arkanoid);

        arcadeAdmin.addPlayedGame(arcadeAdmin.retrieveVideogameByName("Tekken"), arcadeAdmin.retrieveUserByName("wolfie"), 1000);
        arcadeAdmin.addPlayedGame(arcadeAdmin.retrieveVideogameByName("Super Mario"), arcadeAdmin.retrieveUserByName("goku"), 1000);
        arcadeAdmin.addPlayedGame(arcadeAdmin.retrieveVideogameByName("Tetris"), arcadeAdmin.retrieveUserByName("goofy"), 1000);
        arcadeAdmin.printGlobalScoreBoard();
        arcadeAdmin.addPlayedGame(arcadeAdmin.retrieveVideogameByName("Arkanoid"), arcadeAdmin.retrieveUserByName("wolfie"), 200);
        arcadeAdmin.printGlobalScoreBoard();
        arcadeAdmin.addPlayedGame(arcadeAdmin.retrieveVideogameByName("Tekken"), arcadeAdmin.retrieveUserByName("vegeta"), 10000);
        arcadeAdmin.addPlayedGame(arcadeAdmin.retrieveVideogameByName("Tekken"), arcadeAdmin.retrieveUserByName("goku"), 20000);
        arcadeAdmin.addPlayedGame(arcadeAdmin.retrieveVideogameByName("Super Mario"), arcadeAdmin.retrieveUserByName("wolfie"), 4000);
        arcadeAdmin.printGlobalScoreBoard();
        arcadeAdmin.retrieveVideogameById(1).printLocalScoreboard();
        System.out.println(arcadeAdmin.getTopThree());
    }
}
