package com.shahadat.game;

public class Dice {
    private final int numFaces;
    private int faceValue;

    // Default to a standard 6-sided die
    public Dice() {
        this(6);
    }

    public Dice(int numFaces) {
        if (numFaces < 1) {
            System.out.println("Enter a valid face value.");
        }
        this.numFaces = numFaces;
        roll();
    }

    /**
     * Rolls the dice and returns the new value.
     */
    public int roll() {
        faceValue = (int)(Math.random() * this.numFaces + 1);
        return faceValue;
    }

    public int getFaceValue() {
        return this.faceValue;
    }

    public int getNumFaces() {
        return this.numFaces;
    }

    @Override
    public String toString() {
        return "Dice [Faces: " + numFaces + ", Current Value: " + faceValue + "]";
    }
}
