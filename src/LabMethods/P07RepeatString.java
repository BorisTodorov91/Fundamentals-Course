package LabMethods;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String text = scanner.nextLine();

        int n = Integer.parseInt(scanner.nextLine());


        System.out.println(repeatString(text,n));
    }

    public static String repeatString(String toRepeat, int n ){
        String newString = "";

        for (int i = 1; i <=n ; i++) {
            newString += toRepeat;
        }

        return newString;
    }
}
