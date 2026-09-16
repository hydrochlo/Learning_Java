package com.shahadat.game;

public class Main {
    public static void main(String[] args) {
//        Dice d = new Dice(8);
//        // d.roll();
//        System.out.println(d.getFaceValue());
//        System.out.println(d.getNumFaces());

        int totalSnakeEyes = PlaySnakeEye.numSnakeEyes(6, 13, 100);
        System.out.println("Total snake eyes rolled: " + totalSnakeEyes);

    }
}
