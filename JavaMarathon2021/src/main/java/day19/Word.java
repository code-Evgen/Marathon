package day19;

import java.util.Comparator;

public class Word implements Comparable<Word>{
    private String word;
    private int count;

    public Word(int count, String word) {
        this.count = count;
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }


    @Override
    public int compareTo(Word o) {
        if (count < o.getCount())
            return 1;
        else
            if (count > o.getCount())
                return -1;
            else
                return 0;
    }
}
