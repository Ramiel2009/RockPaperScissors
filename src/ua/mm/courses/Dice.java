package ua.mm.courses;

import java.util.Random;

public class Dice extends Thread {
    public static int roll(){
        Random dice = new Random();
        int i = dice.nextInt(3);
        return i;
    }
    public static String result (int s){
        String result="";
        switch (s){
            case 0:
                result = "Scissors";
                break;
            case 1:
                result = "Rock";
                break;
            case 2:
                result = "Paper";
            break;
            default:;
        }
        return result;
    }
}
