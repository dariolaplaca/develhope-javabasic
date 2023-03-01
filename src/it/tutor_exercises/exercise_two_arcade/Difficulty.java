package it.tutor_exercises.exercise_two_arcade;

public enum Difficulty {

    VERY_EASY(1),
    EASY(2),
    MEDIUM(3),
    HARD(4),
    IMPOSSIBLE(5);

    private int scoreModifier;

    Difficulty(int scoreModifier) {
        this.scoreModifier = scoreModifier;
    }

    public int getDifficulty(){
        return this.scoreModifier;
    }
}
