package ua.mm.courses;

/**
 * Created by Maxim on 9/6/15.
 */
public class Main {
    static Player1 player1;
    static Player2 player2;

    static int pl1;
    static int pl2;

    public static void main (String[] args){


        player1 = new Player1();
        player2 = new Player2();
        System.out.println("Let's the game begin!\n");
        player1.start();
        player2.start();


        for (int i = 0; i<5;i++){
            try {
                Thread.sleep(1080);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (pl1 == pl2) {
                System.out.println("DRAW\n");
            } else if (pl1 == 0 && pl2 == 1 || pl1 == 1 && pl2 == 2 || pl1 == 2 && pl2 == 0) {
                System.out.println("Player 2 win!\n");
            } else if (pl1 == 1 && pl2 == 0 || pl1 == 2 && pl2 == 1 || pl1 == 0 && pl2 == 2) {
                System.out.println("Player 1 win!\n");
            }
        }
    }
}