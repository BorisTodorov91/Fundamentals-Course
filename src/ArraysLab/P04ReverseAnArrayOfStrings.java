package ArraysLab;

import java.util.Scanner;

public class P04ReverseAnArrayOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] inputArr = scanner.nextLine().split(" ");

        for (int i = 0; i < inputArr.length / 2 ; i++) {
            String oldElement = inputArr[i];
            inputArr[i] = inputArr[inputArr.length - 1 - i]; // на първия елемент слагаме стойност от последния елемент
            inputArr[inputArr.length - 1 - i] = oldElement; // на последния елемент слагаме стойност от първия елемент
        }

        System.out.printf( String.join(" ", inputArr));
    }
}
