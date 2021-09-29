package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Aa");
        members1.add("Ab");
        members1.add("Ac");
        MusicBand band1 = new MusicBand("A", 2020, members1);
//        MusicBand band2 = new MusicBand("B", 1999, Arrays.asList("Ba", "Bb", "Bc", "Bd"));
        List<String> members2 = new ArrayList<>();
        members2.add("Ba");
        members2.add("Bb");
        members2.add("Bc");
        members2.add("Bd");
        MusicBand band2 = new MusicBand("B", 1999, members2);
        band1.printMembers();
        band2.printMembers();
        System.out.println();
        System.out.println(band1.getMembers());
        System.out.println(band2.getMembers());
        System.out.println();

        MusicBand.transferMembers(band2, band1);
        band1.printMembers();
        band2.printMembers();
    }
}
