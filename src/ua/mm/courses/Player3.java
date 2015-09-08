package ua.mm.courses;

public class Player3 extends Thread{

    public void run(){
        for(int n=0; n<5; n++) {
            try {
                sleep(1000);
                int rollDice = Dice.roll();
                Main.pl3 = rollDice;
                System.out.println("Player 3: " + Dice.result(rollDice) + " (" + rollDice + ")");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}