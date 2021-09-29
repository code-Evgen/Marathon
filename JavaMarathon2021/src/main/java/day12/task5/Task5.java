package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Aa", 18));
        members1.add(new MusicArtist("Ab", 15));
        members1.add(new MusicArtist("Ac",39));
        MusicBand band1 = new MusicBand("A", 2020, members1);
//        MusicBand band2 = new MusicBand("B", 1999, Arrays.asList("Ba", "Bb", "Bc", "Bd"));
        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Ba", 50));
        members2.add(new MusicArtist("Bb",67));
        members2.add(new MusicArtist("Bc", 100));
        members2.add(new MusicArtist("Bd", 77));
        MusicBand band2 = new MusicBand("B", 1999, members2);
        band1.printMembers();
        System.out.println("----------");
        band2.printMembers();
        System.out.println("----------");

        MusicBand.transferMembers(band2, band1);
        band1.printMembers();
        System.out.println("----------");
        band2.printMembers();
    }
}
