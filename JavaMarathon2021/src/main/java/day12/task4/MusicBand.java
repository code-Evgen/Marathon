package day12.task4;

import java.util.Collection;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public static void transferMembers(MusicBand bandFrom, MusicBand bandTo){
//        for (String member: bandFrom.members){
//            bandTo.members.add(member);
//        }
//        for (int i = bandFrom.members.size() - 1; i >= 0; i--)
//            bandFrom.members.remove(i);
        bandTo.members.addAll(bandFrom.members);
        bandFrom.members.clear();
    }

    public void printMembers(){
        for (String member: members) {
            System.out.println(member);
        }
    }

    public List<String> getMembers(){
        return members;
    }
}
