package L01_Basic_Syntax.BasicSyntaxExercise;

import java.util.Scanner;

public class P4PrintAndSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = start; i <=end ; i++) {

            System.out.printf(i+" ");
            sum = sum + i;
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
