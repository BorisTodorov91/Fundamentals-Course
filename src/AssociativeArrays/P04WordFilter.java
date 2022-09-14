package AssociativeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P04WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] words = Arrays.stream(scanner.nextLine().split(" "))
                .filter( e -> e.length() % 2 == 0)
                .toArray(String[]::new);
        for (String item:
             words) {
            System.out.println(item);
        }
    }
}
