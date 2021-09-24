package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Player.countPlayers = 0;
        Random rand = new Random();
//        for (int i = 0; i < 6; i++){
//            Player player = new Player(rand.nextInt(10) + 90);
//        }
        Player player1 = new Player(rand.nextInt(10) + 90);
        Player player2 = new Player(rand.nextInt(10) + 90);
        Player player3 = new Player(rand.nextInt(10) + 90);
        Player player4 = new Player(rand.nextInt(10) + 90);
        Player player5 = new Player(rand.nextInt(10) + 90);
        Player player6 = new Player(rand.nextInt(10) + 90);
        Player.info();
    }
}
