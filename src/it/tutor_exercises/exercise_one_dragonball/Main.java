package it.tutor_exercises.exercise_one_dragonball;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static ArrayList<Skill> skills;
    static ArrayList<Character> roster;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        boolean isRunning = true;
        boolean secretMode = false;
        roster = loadList("src\\it\\tutor_exercises\\exercise_one_dragonball\\roster.data");
        skills = loadList("src\\it\\tutor_exercises\\exercise_one_dragonball\\skills.data");
        /*
        Skill kamehameha = new Skill("Kamehameha", 50);
        Skill spiritBomb = new Skill("Spirit Bomb", 80);
        Skill destructoDisc  = new Skill("Destructo Disk", 45);
        Skill kiai  = new Skill("Kiai", 35);

        Skill galickGun  = new Skill("Galick Gun", 45);
        Skill galaxyBreaker  = new Skill("Galaxy Breaker", 65);
        Skill bigBangAttack  = new Skill("Big Bang Attack", 50);
        Skill finalFlash  = new Skill("Final Flash", 25);

        skills.add(kamehameha);
        skills.add(spiritBomb);
        skills.add(destructoDisc);
        skills.add(kiai);
        skills.add(galickGun);
        skills.add(galaxyBreaker);
        skills.add(bigBangAttack);
        skills.add(finalFlash);

        Character goku = new Character("Goku",
                100,
                20,
                CharacterType.SAIYAN,
                new ArrayList<>(Arrays.asList(kamehameha, spiritBomb, destructoDisc, kiai)));
        Character vegeta = new Character("Vegeta",
                80,
                15,
                CharacterType.SAIYAN,
                new ArrayList<>(Arrays.asList(galickGun, galaxyBreaker, bigBangAttack, finalFlash)));
        roster.add(goku);
        roster.add(vegeta);
        */
        refreshHitChances();

        while (isRunning){
            System.out.println("\nDRAGONBALL FIGHTING SIMULATOR\n1. Fight\n2. Add a new Character\n3. Add a new Skill\n4. Character List\n5. Skill List\n6. Modify a Character\n7. Modify a Skill\n8. Save & Exit");
            if(secretMode){
                System.out.println("9. Eight players tournament");
            }
            switch (input.nextInt()){
                case 1 -> {
                    System.out.println("Choose the fighters!");
                    for (int i = 0; i < roster.size(); i++) {
                        System.out.println(i + ". " + roster.get(i).getName());
                    }
                    try{
                        System.out.println("Choose the first fighter");
                        Character firstFighter = roster.get(input.nextInt());
                        System.out.println("Choose the second fighter");
                        Character secondFighter = roster.get(input.nextInt());
                        Fight.fighting(firstFighter, secondFighter);}
                    catch (IndexOutOfBoundsException e){
                        System.out.println("Choose a proper value");
                    }

                }
                case 2 -> {
                    System.out.println("Create a new Character!");
                    System.out.println("Choose a name: ");
                    input.nextLine();
                    String name = input.nextLine();
                    System.out.println("Set life points for the character: ");
                    int lp = input.nextInt();
                    System.out.println("Set the strength for the character: ");
                    int strength = input.nextInt();
                    System.out.println("Select the character type");
                    int index = 0;
                    for(CharacterType ct : CharacterType.values()){
                        System.out.println(index + ". " + ct);
                        index++;
                    }
                    CharacterType ct;
                    switch(input.nextInt()){
                        case 1 -> ct = CharacterType.SAIYAN;
                        case 2 -> ct = CharacterType.NAMECCIANO;
                        case 3 -> ct = CharacterType.ALIEN;
                        case 4 -> ct = CharacterType.CYBORG;
                        case 5 -> ct = CharacterType.DEMON;
                        default -> ct = CharacterType.HUMAN;
                    }
                    System.out.println("Select 4 skills for your character");
                    ArrayList<Skill> skillList = new ArrayList<>();
                    index = 0;
                    for(Skill skill : skills){
                        System.out.println(index + ". " + skill.getName());
                        index++;
                    }
                    for(int i = 0; i < 4; i++){
                        skillList.add(skills.get(input.nextInt()));
                        System.out.println(skillList.get(i).getName() + " added!");
                    }

                    roster.add(new Character(name, lp, strength, ct, skillList));
                }

                case 3 -> {
                    System.out.println("Add a new Skill");
                    System.out.println("Choose the skill name");
                    input.nextLine(); //DA CHIEDERE PERCHè SENZA QUESTA LINEA SALTA LO STRING INPUT
                    String name = input.nextLine();
                    System.out.println("Choose the skill damage");
                    int damage = input.nextInt();
                    Skill newSkill = new Skill(name, damage);
                    skills.add(newSkill);
                }
                case 4 -> {
                    for(Character character : roster){
                        System.out.println(character.getName());
                    }
                }
                case 5 -> {
                    for(Skill skill : skills){
                        System.out.println(skill.getName());
                    }
                }

                case 6 -> modifyCharacter();


                case 7 -> modifySkill();


                case 8 -> {
                    saveList(roster, "src\\it\\tutor_exercises\\exercise_one_dragonball\\roster.data");
                    saveList(skills, "src\\it\\tutor_exercises\\exercise_one_dragonball\\skills.data");
                    isRunning = false;
                }

                case 9 -> {
                    if(!secretMode){
                        secretMode = true;
                        System.out.println("Secret Mode Unlocked!");
                    }
                    ArrayList<Character> tournamentFighters = new ArrayList<>();
                    System.out.println("8 PLAYERS TOURNAMENT\nSelect 8 fighters!");
                    for(int i = 0; i < roster.size(); i++){
                        System.out.println(i + ". " + roster.get(i).getName());
                    }
                    for(int i = 0; i < 8; i++){
                        tournamentFighters.add(roster.get(input.nextInt()));
                        System.out.println(tournamentFighters.get(i).getName() + " added!");
                    }
                    Fight.eightPlayersTournament(tournamentFighters);
                }
                default -> System.out.println("Select a proper command");
            }
        }
    }

    private static <T> void saveList(ArrayList<T> arrayList, String file){
        try{
            FileOutputStream writeData = new FileOutputStream(file);
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(arrayList);
            writeStream.flush();
            writeStream.close();

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static <T> ArrayList<T> loadList(String file){
        try{
            FileInputStream readData = new FileInputStream(file);
            ObjectInputStream readStream = new ObjectInputStream(readData);
            ArrayList<T> savedList = (ArrayList<T>) readStream.readObject();
            readStream.close();
            return savedList;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    private static void modifyCharacter(){
        System.out.println("Which character do you want to modify?");
        for(int i = 0; i < roster.size(); i++){
            System.out.println(i + ". " + roster.get(i).getName());
        }
        int characterIndex = input.nextInt();
        Character currentCharacter = roster.get(characterIndex);
        System.out.println("You choose " + currentCharacter.getName());
        System.out.println("What do you want to modify?\n1. Name\n2. Life Points\n3. Strength\n4. Character type\n5. Skills\n6. See info\n9. Delete Character");
        switch(input.nextInt()){
            case 1 -> {
                System.out.println("The current name is " + currentCharacter.getName() + "\nChoose a new name:");
                input.nextLine();
                currentCharacter.setName(input.nextLine());
                System.out.println("Name changed!");
            }
            case 2 -> {
                System.out.println("The current life points are " + currentCharacter.getLifePoints() + "\nHow many life points should the character have?");
                currentCharacter.setLifePoints(input.nextInt());
                System.out.println("Life points changed!");
            }
            case 3 -> {
                System.out.println("The current strength is " + currentCharacter.getStrength() + "\nHow much strength should the character have?");
                currentCharacter.setStrength(input.nextInt());
                System.out.println("Strength changed!");
            }
            case 4 -> {
                System.out.println("The current character type is " + currentCharacter.getCharacterType() + "\nWhich of the following types should the character be?");
                int index = 0;
                for(CharacterType ct : CharacterType.values()){
                    System.out.println(index + ". " + ct);
                    index++;
                }
                CharacterType ct;
                switch(input.nextInt()){
                    case 1 -> ct = CharacterType.SAIYAN;
                    case 2 -> ct = CharacterType.NAMECCIANO;
                    case 3 -> ct = CharacterType.ALIEN;
                    case 4 -> ct = CharacterType.CYBORG;
                    case 5 -> ct = CharacterType.DEMON;
                    default -> ct = CharacterType.HUMAN;
                }
                currentCharacter.setCharacterType(ct);
            }
            case 5 -> {
                System.out.println("What do you wanna do with the skill list?\n1. Add\n2. Remove");
                switch(input.nextInt()){
                    case 1 -> {
                        if(currentCharacter.getSkills().size() == 5){
                            System.out.println("Your character can have maximum 4 skills and the basic attack, if you wanna add a new skill remove another one first");
                        } else {
                            System.out.println("Choose a skill to add");
                            for(int i = 0; i < skills.size(); i++){
                                System.out.println(i + ". " + skills.get(i).getName());
                            }
                            currentCharacter.addSkill(skills.get(input.nextInt()));
                            System.out.println("New skill added!");
                        }
                    }
                    case 2 -> {
                        if(!currentCharacter.getSkills().isEmpty()){
                            System.out.println("Which skill do you wanna remove?");
                            for(int i = 0; i < currentCharacter.getSkills().size(); i++){
                                System.out.println(i + ". " + currentCharacter.getSkills().get(i).getName());
                            }
                            Skill removedSkill = currentCharacter.getSkills().get(input.nextInt());
                            if(removedSkill.getName().equals("Basic Attack")){
                                System.out.println("You cannot remove the Basic Attack");
                            } else {
                                currentCharacter.removeSkill(removedSkill);
                                System.out.println("Skill removed!");
                            }
                        } else {
                            System.out.println("The skill list is empty!");
                        }
                    }
                }

            }
            case 6 -> {
                System.out.println("Name: " + currentCharacter.getName());
                System.out.println("Type: " + currentCharacter.getCharacterType());
                System.out.println("Life Points: " + currentCharacter.getLifePoints());
                System.out.println("Strength: " + currentCharacter.getStrength());
                System.out.println("Skills: " + currentCharacter.getSkills());
            }

            case 9 -> {
                System.out.println("Are you sure you want to remove " + currentCharacter.getName() + "?\n1. Yes\n2. No");
                if(input.nextInt() == 1){
                    roster.remove(currentCharacter);
                    System.out.println("Character removed");
                } else {
                    System.out.println("Character deletion aborted...");
                }
            }

            default -> System.out.println("Select a proper command");
        }

    }

    private static void modifySkill(){
        System.out.println("Which skill do you want to modify?");
        for(int i = 0; i < skills.size(); i++){
            System.out.println(i + ". " + skills.get(i).getName());
        }
        Skill currentSkill = skills.get(input.nextInt());
        System.out.println("What do you want to change?\n1. Name\n2. Damage\n9. Delete Skill");
        switch (input.nextInt()){
            case 1 -> {
                System.out.println("The current skill name is " + currentSkill.getName() + "\nWhat name do you want the skill to have?");
                input.nextLine();
                currentSkill.setName(input.nextLine());
                System.out.println("Name changed!");
            }
            case 2 -> {
                System.out.println("The current skill damage is " + currentSkill.getDamage() +"\nHow much damage do you want the skill to deal?");
                currentSkill.setDamage(input.nextInt());
                System.out.println("Damage changed!");
            }
            case 9 -> {
                System.out.println("Do you really want to delete " + currentSkill.getName() + "\n1. Yes\n2. No");
                if(input.nextInt() == 1){
                    skills.remove(currentSkill);
                    System.out.println("Skill removed");
                } else {
                    System.out.println("Skill deletion aborted...");
                }
            }

            default -> System.out.println("Select a proper command");
        }
    }

    private static void refreshHitChances(){
        for(Skill skill : skills){
            skill.setHitChance(Math.random());
        }
        for(Character character : roster){
            character.setArmor(Math.random());
            character.setDodgeChance(Math.random());
            character.getSkills().forEach(skill -> skill.setHitChance(Math.random()));
        }
    }
}

