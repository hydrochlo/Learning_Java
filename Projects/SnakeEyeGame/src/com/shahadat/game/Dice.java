package com.shahadat.game;

public class Dice {
    private final int numFaces;
    private int faceValue;

    public Dice(int numFaces) {
        this.numFaces = numFaces;
    }

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
