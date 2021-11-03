package Final;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Player {
    private int[][] field = new int[10][10];
    private Map<Integer, Integer> shipMap;
    private int shipCount;

    public Player() {
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                field[i][j] = 0;
            }
        }
        this.shipMap = new HashMap<>();
        this.shipCount = 0;
    }

    public int getShipCount() {
        return shipCount;
    }

    public boolean addShip(String ship, int type){
        String[] coordinates = ship.split("[,;]");
        boolean correct = true;
        correct = checkFormat(coordinates, type);
        if (correct){
            return setShip(coordinates);
        }
        else
            return false;
    }

    public boolean checkFormat (String[] coordinates, int type){
        boolean correct = false;
        if (coordinates.length == type * 2) {
            try {
                for (int i = 0; i < coordinates.length; i++) {
                    if ((Integer.parseInt(coordinates[i]) >= 0) & (Integer.parseInt(coordinates[i]) <= 9)) {
                        correct = true;
                    } else
                        correct = false;
                }
            }
            catch (NumberFormatException e){
                correct = false;
                System.out.println("Введены неверные координаторы корабля. Введите ещё раз");
            }
        }
        else
        {
            correct = false;
            System.out.println("Введен неверный размер корабля. Введите ещё раз");
        }

        if (correct){
            if (coordinates.length > 2){
                int differenceX = Integer.parseInt(coordinates[2]) - Integer.parseInt(coordinates[0]);
                int differenceY = Integer.parseInt(coordinates[3]) - Integer.parseInt(coordinates[1]);
                if (((differenceX * differenceY) == 0) & (Math.abs(differenceX + differenceY) == 1)){
                    List<String> difference = new ArrayList<>();
                    for (int i = 0; i < (coordinates.length - 2); i = i + 2) {
                        differenceX = Integer.parseInt(coordinates[i + 2]) - Integer.parseInt(coordinates[i]);
                        differenceY = Integer.parseInt(coordinates[i + 3]) - Integer.parseInt(coordinates[i + 1]);
                        difference.add(differenceX + "-" + differenceY);
                    }
                    for (int i = 0; i < (difference.size() - 1); i++){
                        if (!difference.get(i).equals(difference.get(i+1))){
                            correct = false;
                        }
                    }
                }
                else
                    correct = false;
            }
            if (!correct)
                System.out.println("Введен невалидный корабль");
        }
        return correct;
    }

    private boolean setShip(String[] coordinates){
        if (checkSetShipPosition(coordinates)){
            this.shipCount++;
            for (int i = 0; i < (coordinates.length - 1); i = i + 2) {
                int x = Integer.parseInt(coordinates[i]);
                int y = Integer.parseInt(coordinates[i+1]);
                this.field[x][y] = shipCount;
            }
            shipMap.put(shipCount, coordinates.length/2);
            return true;
        }
        else{
            return false;
        }


    }

    private boolean checkSetShipPosition(String[] coordinates){
        boolean correct = true;
        for (int i = 0; i < coordinates.length; i = i + 2) {
            int x = Integer.parseInt(coordinates[i]);
            int y = Integer.parseInt(coordinates[i + 1]);
            if (field[x][y] != 0) {
                System.out.println("Поле уже занято");
                correct = false;
            }
        }
        if (correct) {
            for (int i = 0; i < coordinates.length; i = i + 2) {
                int x = Integer.parseInt(coordinates[i]);
                int y = Integer.parseInt(coordinates[i + 1]);
                int xStart;
                int xEnd;
                int yStart;
                int yEnd;
                xStart = x - 1;
                xEnd = x + 1;
                yStart = y - 1;
                yEnd = y + 1;
                if (x == 0)
                    xStart = x;
                if (x == 9)
                    xEnd = x;
                if (y == 0)
                    yStart = y;
                if (y == 9)
                    yEnd = y;

                int sum = 0;
                for (int k = xStart; k <= xEnd; k++)
                    for (int n = yStart; n <= yEnd; n++) {
                        sum = sum + field[k][n];
                    }
                if (sum != 0) {
                    correct = false;
                    System.out.println("Вокруг корабля должна быть область шириной в одну клетку, в которой не может быть других кораблей");
                }
            }
        }
    return correct;
    }

    public boolean attack(String[] coordinates){
        int value = field[Integer.parseInt(coordinates[0])][Integer.parseInt(coordinates[1])];
        if ( value > 0){
            int shipHealth = shipMap.get(value);
            shipHealth--;
            if (shipHealth != 0) {
                System.out.println("Попадание!");
                shipMap.put(value, shipHealth);
            }
            else {
                System.out.println("Утопил!");
                field[Integer.parseInt(coordinates[0])][Integer.parseInt(coordinates[1])] = -1;
                shipCount--;
            }
            return true;
        }
        else{
            System.out.println("Мимо!");
            return false;
        }
    }

    public void showField(){
        for (int x = 0; x < 10; x++){
            for (int y = 0; y < 10; y++){
                int xStart;
                int xEnd;
                int yStart;
                int yEnd;
                xStart = x - 1;
                xEnd = x + 1;
                yStart = y - 1;
                yEnd = y + 1;
                if (x == 0)
                    xStart = x;
                if (x == 9)
                    xEnd = x;
                if (y == 0)
                    yStart = y;
                if (y == 9)
                    yEnd = y;
                boolean near = false;
                for (int k = xStart; k <= xEnd; k++)
                    for (int n = yStart; n <= yEnd; n++) {
                        if (field[k][n] != 0)
                            near = true;
                    }

                if (near)
                    System.out.print("\uD83D\uDFE6");
                if (field[x][y] == 0)
                    System.out.print("\u2B1C");
                if (field[x][y] == -1)
                    System.out.print("\uD83D\uDFE5");
                if (field[x][y] > 0)
                    System.out.print("\uD83D\uDEE5");
            }
            System.out.println();

        }

    }
}
