package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P06TriplesofLatinLetters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num = Integer.parseInt(scanner.nextLine());

        for (char letter1 ='a'; letter1 < 'a' +num ; letter1++) {
            for (int leter2 = 'a'; leter2 <'a'+num ; leter2++) {
                for (int letter3 = 'a'; letter3 <'a'+num ; letter3++) {
                    System.out.printf("%c%c%c%n",letter1,leter2,letter3);
                }
            }
        }
    }
}
