package it.tutor_exercises.exercise_one_dragonball;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Fight {
    public static int fighting(Character character1, Character character2){
        System.out.println(character1.getName() + " VS " + character2.getName());
        boolean isFirstCharacterTurn = Math.random() < 0.5;
        int character1OriginalLifePoints = character1.getLifePoints();
        int character2OriginalLifePoints = character2.getLifePoints();
        while(character1.getLifePoints() > 0 && character2.getLifePoints() > 0){
          if(isFirstCharacterTurn){
              character1.attack(character2);
          } else {
              character2.attack(character1);
          }
          isFirstCharacterTurn = !isFirstCharacterTurn;
       }
       if(character1.getLifePoints() <= 0){
          System.out.println("\nThe Winner is " + character2.getName());
          character1.setLifePoints(character1OriginalLifePoints);
          character2.setLifePoints(character2OriginalLifePoints);
          return 0;
       } else {
          System.out.println("\nThe Winner is " + character1.getName());
          character1.setLifePoints(character1OriginalLifePoints);
          character2.setLifePoints(character2OriginalLifePoints);
          return 1;
       }
    }

    public static void eightPlayersTournament(ArrayList<Character> allCharacters){
        System.out.println("TOURNAMENT STARTED");
        Collections.shuffle(allCharacters);
        Scanner input = new Scanner(System.in);
        while(allCharacters.size() > 1){
            for(int i = 0; i < allCharacters.size(); i++){
                if(i % 2 != 0){
                    System.out.print("VS\t");
                } else {
                    System.out.println(" ");
                }
                System.out.print(allCharacters.get(i).getName() + "\t");

            }
            input.nextLine();
            int loserIndex = fighting(allCharacters.get(0), allCharacters.get(1));
            System.out.println("\n" + allCharacters.get(loserIndex).getName() + " is out!");
            allCharacters.remove(loserIndex);
            Character winner = allCharacters.get(0);
            allCharacters.remove(0);
            allCharacters.add(winner);
            input.nextLine();
        }
        System.out.println("The winner of the tournament is...");
        input.nextLine();
        System.out.println(allCharacters.get(0).getName().toUpperCase() + "!!!");
        input.nextLine();
    }
}