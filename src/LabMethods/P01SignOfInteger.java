package LabMethods;

import DataTypesAndVariablesExercise.P02SumDigits;

import java.util.Scanner;

public class P01SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        isPositive(n);

    }

    public static void isPositive(int n) {
        if (n > 0) {
            System.out.printf("The number %d is positive.", n);
        } else if (n < 0) {
            System.out.printf("The number %d is negative.", n);
        } else if (n == 0) {
            System.out.printf("The number %d is zero.", n);
        }
    }


}
