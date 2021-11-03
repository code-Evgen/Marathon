package Final;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FinalTask {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();

        Scanner sc = new Scanner(System.in);
        String ship;

        System.out.println("Расставляет корабли игрок 1");
        String format;
        for (int i = 4; i > 0; i--) {
            for (int k = i; k<=4; k++) {
                boolean correct = false;
                while (!correct) {
                    format = "";
                    for (int j = 1; j <= i; j++) {
                        format = format + "x" + j + ",y" + j + ";";
                    }
                    format = format.substring(0, format.length() - 1);
                    System.out.println("Введите координаты " + i + " палубного корабля. Формат: " + format);
                    ship = sc.nextLine();
                    correct = player1.addShip(ship, i);
                }
            }
        }

        System.out.println("Расставляет корабли игрок 2");
        for (int i = 4; i > 0; i--) {
            for (int k = i; k<=4; k++) {
                boolean correct = false;
                while (!correct) {
                    format = "";
                    for (int j = 1; j <= i; j++) {
                        format = format + "x" + j + ",y" + j + ";";
                    }
                    format = format.substring(0, format.length() - 1);
                    System.out.println("Введите координаты " + i + " палубного корабля. Формат: " + format);
                    ship = sc.nextLine();
                    correct = player2.addShip(ship, i);
                }
            }
        }
        player1.showField();
        System.out.println("---------------");
        System.out.println("Игра начинается");
        System.out.println("---------------");
        Random rand = new Random();
        int state = rand.nextInt(2);
        boolean result;
        String cell;
        String[] coordinates = new String[2];
        boolean correct;
        while (state != 2){
            switch (state){
                case 0:
                    System.out.println("Ходит игрок 1");
                    correct = false;
                    while (!correct) {
                        cell = sc.nextLine();
                        coordinates = cell.split(",");
                        correct = player2.checkFormat(coordinates, 1);
                    }
                    result = player2.attack(coordinates);
                    if (result == true)
                        state = 0;
                    else
                        state = 1;
                    if (player2.getShipCount() == 0){
                        System.out.println("Выиграл игрок 1");
                        state = 2;
                    }
                    //System.out.println(player2.getShipCount());
                    break;
                case 1:
                    System.out.println("Ходит игрок 2");
                    correct = false;
                    while (!correct) {
                        cell = sc.nextLine();
                        coordinates = cell.split(",");
                        correct = player1.checkFormat(coordinates, 1);
                    }
                    result = player1.attack(coordinates);
                    if (result == true)
                        state = 1;
                    else
                        state = 0;
                    if (player1.getShipCount() == 0){
                        System.out.println("Выиграл игрок 1");
                        state = 2;
                    }
                    //System.out.println(player1.getShipCount());
                    break;
            }
        }
    }
}
