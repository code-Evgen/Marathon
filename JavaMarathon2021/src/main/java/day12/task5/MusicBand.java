package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
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
//        for (MusicArtist member: bandFrom.members){
//            bandTo.members.add(member);
//        }
        bandTo.members.addAll(bandFrom.members);
//        for (int i = bandFrom.members.size() - 1; i >= 0; i--)
//            bandFrom.members.remove(i);
        bandFrom.members.clear();
    }

    public void printMembers(){
        for (MusicArtist member: members) {
            System.out.println("Имя артивста - " + member.getName() + ", возраст - " + member.getAge());
        }
    }

    public List<MusicArtist> getMembers(){
        return members;
    }
}
