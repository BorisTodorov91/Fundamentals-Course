package ExercisesMethods;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        //1. факториел на първото число
        long fact1 = calculateFactorial(number1);
        //2. факториел на второто число
        long fact2 = calculateFactorial(number2);
        //3. факториел на първото число / факториел на второто число -> %.2f
        double result = fact1 * 1.0 / fact2;
        System.out.printf("%.2f", result);
    }

    //метод, който изчислява и връща стойността на факториел
    private static long calculateFactorial(int number) {
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

