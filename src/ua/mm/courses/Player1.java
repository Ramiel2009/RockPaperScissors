package ua.mm.courses;

/**
 * Created by Maxim on 9/6/15.
 */
public class Player1 extends Thread{
int turn;

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public void run(){
        for(int n=0; n<5; n++) {
            this.setTurn(n);
            try {
                sleep(1000);
                int rollDice = Dice.roll();
                Main.pl1 = rollDice;
                System.out.println("Player 1: " + Dice.result(rollDice) + " (" + rollDice + ")");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}