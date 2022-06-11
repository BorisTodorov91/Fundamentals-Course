package L01_Basic_Syntax.BasicSyntaxExercise;

import java.util.Scanner;

public class P8TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <=num ; row++) {
            for (int count = 1; count <= row; count++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
