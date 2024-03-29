package ObjectAndClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04Songs {
    static class Song {
        String typeList;
        String name;
        String time;

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public String getTypeList() {
            return this.typeList;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getTime() {
            return this.time;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> listSong = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] inputSongArr = scanner.nextLine().split("_");
            String inputType = inputSongArr[0];
            String inputName = inputSongArr[1];
            String inputTime = inputSongArr[2];

            Song currentSong = new Song();
            currentSong.setTypeList(inputType);
            currentSong.setName(inputName);
            currentSong.setTime(inputTime);

            listSong.add(currentSong);
        }
        String comand = scanner.nextLine();
        if(comand.equals("all")){
            for (Song item :
                 listSong) {
                System.out.println(item.getName());
            }
        }else {
            for (Song item :
                 listSong) {

                if (item.getTypeList().equals(comand)){
                    System.out.println(item.getName());
                }

            }
        }
    }
}
