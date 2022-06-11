package ExerciseArrays;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstRow = scanner.nextLine();
        String secondRow = scanner.nextLine();

        String[] firstArr = firstRow.split(" ");
        String[] secondArr = secondRow.split(" ");

        //обхождаме втория масив с фореач цикъл защото няма да работиме с индексите а искаме само елементите на масива
        for (String secondElement : secondArr) {
            for (String firstElements : firstArr) {
                if ( firstElements.equals(secondElement)){
                    System.out.print(firstElements + " ");
                }
            }
        }
    }

}
