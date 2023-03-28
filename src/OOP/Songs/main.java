package OOP.Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSong = Integer.parseInt(scanner.nextLine());

        List<Song> songList = new ArrayList<>();

        for (int i = 0; i < numberOfSong; i++) {

            String[] input = scanner.nextLine().split("_");
            String type = input[0];
            String name = input[1];
            String time = input[2];

            Song song = new Song(type,name,time);
            songList.add(song);

        }
        String printType = scanner.nextLine();

        if (printType.equals("all")){
            for (Song song : songList) {
                System.out.println(song.getName());
            }
        }
        List<Song> filterSong = songList.stream().filter(e -> e.getTypeList().equals(printType)).collect(Collectors.toList());

        for (Song song : filterSong) {
            System.out.println(song.getName());
        }

    }

}
