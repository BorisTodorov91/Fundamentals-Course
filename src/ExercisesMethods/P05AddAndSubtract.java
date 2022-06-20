package ExercisesMethods;

import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

       int sum =  sumFirstTwoNUm(num1 , num2);
        System.out.println( sum - num3);
    }

    private static int sumFirstTwoNUm(int num1, int num2) {
        return num1 + num2;
    }
}
