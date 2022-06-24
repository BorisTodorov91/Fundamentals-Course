package ExercisesMethods;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleCharacters(text);
    }

    private static void printMiddleCharacters(String text) {

        if (text.length() % 2 == 1){
            int indexOfMiddleCharacter = text.length() / 2;
            System.out.println(text.charAt(indexOfMiddleCharacter));
        }
        //четна дължина -> 2 средни символа
        //"someText" -> ['s', 'o', 'm', 'e', 'T', 'e', 'x', 't']-> eT
        else {
            int indexFirstMiddleCharacter = text.length() / 2 - 1;
            int indexSecondMiddleCharacter = text.length() / 2;

            System.out.println("" + text.charAt(indexFirstMiddleCharacter) + text.charAt(indexSecondMiddleCharacter));
        }


    }
}
