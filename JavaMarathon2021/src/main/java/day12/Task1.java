package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Audi");
        list.add("BMW");
        list.add("Lada");
        list.add("Tesla");
        list.add("Mercedes");

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println();

        list.add(list.size()/2 + 1, "Ferrari");
        list.remove(0);
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
