package com.shahadat.game;

public class PlaySnakeEye {
    static int numSnakeEyes(int sides1, int sides2, int numThrows){
        Dice dice1 = new Dice(sides1);
        Dice dice2 = new Dice(sides2);
        int count = 0;

        for(int i=0; i<numThrows; i++){
            if(dice1.roll()==1 && dice2.roll()==1){
                count++;
            }
        }
        return count;
    }

}
