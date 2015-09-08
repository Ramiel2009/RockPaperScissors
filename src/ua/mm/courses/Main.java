package ua.mm.courses;

public class Main {
    static Player1 player1;
    static Player2 player2;
    static Player3 player3;

    static int pl1;
    static int pl2;
    static int pl3;

    public static void main (String[] args){


        player1 = new Player1();
        player2 = new Player2();
        player3 = new Player3();
        System.out.println("Let's the game begin!\n______________________\n");
        player1.start();
        player2.start();
        player3.start();


        for (int i = 0; i<5;i++) {
            try {
                Thread.sleep(1080);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (pl1 == pl2 && pl1 == pl3) {
                System.out.println("DRAW\n");
                System.out.println("Player 3 LOSE\n");
            } else if ((pl1 == 0 && pl2 != 1 || pl3 == 1) || (pl1 == 1 && pl2 != 2 || pl3 == 2)
                    || (pl1 == 2 && pl2 != 0 || pl3 == 0)) {
                System.out.println("Player 1 WIN!\n");
            } else if ((pl2 == 0 && pl1 != 1 || pl3 == 1) || (pl2 == 1 && pl1 != 2 || pl3 == 2)
                    || (pl2 == 2 && pl1 != 0 || pl3 == 0)) {
                System.out.println("Player 1 WIN!\n");
            } else if ((pl3 == 0 && pl2 != 1 || pl1 == 1) || (pl3 == 1 && pl2 != 2 || pl1 == 2)
                || (pl3 == 2 && pl2 != 0 || pl1 == 0)) {
                System.out.println("Player 1 WIN!\n");
            }
        }
    }
}