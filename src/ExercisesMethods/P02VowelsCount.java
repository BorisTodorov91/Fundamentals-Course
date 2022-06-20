package ExercisesMethods;

import java.util.Locale;
import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();

        // 1. метод който отпечатва гласните букви в текста (A E I O U , a e i o u )

        printVowelCout(text);


    }

    private static void printVowelCout(String text) {
        int count = 0; // броят на гласни букви

        for (char symbol : text.toCharArray()) {

            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                count++;
            }
        }
        System.out.println(count);


    }


}
