package it.tutor_exercises.exercise_one_dragonball;

import java.io.Serial;
import java.io.Serializable;

public class Skill implements Serializable {
    @Serial
    private static final long serialVersionUID = 6529685098267757691L;
    private String name;
    private int damage;
    private double hitChance;

    public Skill(String name, int damage) {
        this.name = name;
        this.damage = damage;
        this.hitChance = Math.random();
    }

    public Skill(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public double getHitChance() {
        return hitChance;
    }

    public void setHitChance(double hitChance) {
        this.hitChance = hitChance;
    }

    @Override
    public String toString() {
        return name;
    }
}
