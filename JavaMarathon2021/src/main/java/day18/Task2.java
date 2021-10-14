package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(717771237));
    }

    public static int count7(int number){
        int count = 0;
        if (number % 10 == 7)
            count++;
        if (number > 9)
            count += count7((int)(number / 10));
        return count;
    }
}
