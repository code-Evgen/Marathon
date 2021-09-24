package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i <= 20000; i++){
            str.append(i).append(" ");
        }
        System.out.println(str.toString());
        long stopTime1 = System.currentTimeMillis();
        //--------------------------
        long startTime2 = System.currentTimeMillis();
        String str2 = "0 ";
        for (int i = 1; i <= 20000; i++){
            str2 = str2 + i + " ";
        }
        System.out.println(str2);
        long stopTime2 = System.currentTimeMillis();
        System.out.println(stopTime1 - startTime1);
        System.out.println(stopTime2 - startTime2);
    }
}
