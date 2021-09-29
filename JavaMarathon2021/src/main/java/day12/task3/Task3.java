package day12.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        String groupName = "a";
        List<MusicBand> bands = new ArrayList<>();
        List<MusicBand> bandsAfter2020;
        for (int i = 0; i < 10; i++) {
            MusicBand band = new MusicBand(groupName, (rand.nextInt(41) + 1980));
            groupName += "a";
            bands.add(band);
        }

        for (int i = 0; i < bands.size(); i++)
            System.out.println(bands.get(i).getName() + " - " + bands.get(i).getYear());
        System.out.println();
        bandsAfter2020 = groupsAfter2000(bands);

        for (int i = 0; i < bandsAfter2020.size(); i++)
            System.out.println(bandsAfter2020.get(i).getName() + " - " + bandsAfter2020.get(i).getYear());

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> groupsSelected = new ArrayList<>();
        for (MusicBand band: bands){
            if (band.getYear() > 2000){
                groupsSelected.add(band);
            }
        }
        return groupsSelected;
    }
}
