package ObjectAndClass;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01RandomizeWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       List<String> worldsList = Arrays.stream(scanner.nextLine()
                .split(" "))
                .collect(Collectors.toList());


       while (!worldsList.isEmpty()){
           Random rnd = new Random();
           int randomIndex = rnd.nextInt(worldsList.size());

           String word = worldsList.get(randomIndex);
           System.out.println(word);
           worldsList.remove(randomIndex);


       }


    }
}
