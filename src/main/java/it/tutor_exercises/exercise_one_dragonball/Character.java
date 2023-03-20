package it.tutor_exercises.exercise_one_dragonball;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Character implements Serializable {
    @Serial
    private static final long serialVersionUID = 6529685098267757690L;
    private String name;
    private int lifePoints;
    private double dodgeChance;
    private double armor;
    private int strength;
    private CharacterType characterType;

    private ArrayList<Skill> skills;


    public Character(String name, int lifePoints, int strength, CharacterType characterType, ArrayList<Skill> skills) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.dodgeChance = Math.random();
        this.armor = Math.random();
        this.strength = strength;
        this.characterType = characterType;
        this.skills = skills;
        Skill basicAttack = new Skill("Basic Attack", this.strength);
        basicAttack.setHitChance(1 - this.dodgeChance); // DA CHIEDERE
        skills.add(basicAttack);
    }

    public Character() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public double getDodgeChance() {
        return dodgeChance;
    }

    public void setDodgeChance(double dodgeChance) {
        this.dodgeChance = dodgeChance;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public CharacterType getCharacterType() {
        return characterType;
    }

    public void setCharacterType(CharacterType characterType) {
        this.characterType = characterType;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }

    public void attack(Character target) {
        Random r = new Random();
        Skill chosenSkill = skills.get(r.nextInt(skills.size()));
        double probability = chosenSkill.getHitChance() * target.getDodgeChance();
        double randomChoice = Math.random();
        if (probability >= randomChoice) {
            int damage = (int) (chosenSkill.getDamage() * target.getArmor());
            System.out.println(this.getName() + " uses " + chosenSkill.getName() + " and deals " + damage + " damages!");
            target.setLifePoints(target.getLifePoints() - damage);
        } else {
            System.out.println(this.getName() + " missed!");
        }

    }

    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    public void removeSkill(Skill skill) {
        skills.remove(skill);
    }
}
