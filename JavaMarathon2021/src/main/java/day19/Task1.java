package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        File file = new File("JavaMarathon2021\\src\\main\\resources\\dushi.txt");
        try {
            Scanner sc = new Scanner(file);
            sc.useDelimiter("[.,:;()?!\"\\s–]+");
            Map<String, Integer> map = new HashMap<>();
            String word;
            while (sc.hasNext()) {
                word = sc.next();
                if (map.containsKey(word))
                    map.put(word, map.get(word) + 1);
                else
                    map.put(word, 1);
            }

//            List<Word> list = new ArrayList<>();
//            for (Map.Entry<String, Integer> entry: map.entrySet()){
//                list.add(new Word(entry.getValue(), entry.getKey()));
//            }
//
//            Collections.sort(list);
//
//            for (int i = 0; i < 100; i++){
//                System.out.println(list.get(i).getWord() + " - " + list.get(i).getCount());
//            }

            List<String> list = new ArrayList<>();

            for (Map.Entry<String, Integer> entry: map.entrySet()){
                list.add(entry.getKey() + " " + entry.getValue());
            }

            list.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    String[] str1 = o1.split(" ");
                    String[] str2 = o2.split(" ");
                    if (Integer.parseInt(str1[1]) < Integer.parseInt(str2[1]))
                        return 1;
                    else
                        if (Integer.parseInt(str1[1]) > Integer.parseInt(str2[1]))
                            return -1;
                        else
                            return 0;
                }
            });

            for (int i = 0; i < 100; i++){
                System.out.println(list.get(i));
            }

            System.out.println("---------------");
            System.out.println(map.get("Чичиков"));
            // Чичиков - 601

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
