package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capasity = 255;
        int sum = 0;
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= num; i++) {

            int currentNum = Integer.parseInt(scanner.nextLine());
            sum = sum + currentNum;
            if ( sum > capasity){
                System.out.println("Insufficient capacity!");
                sum -= currentNum;
            }

        }
        System.out.print(sum);
    }
}
