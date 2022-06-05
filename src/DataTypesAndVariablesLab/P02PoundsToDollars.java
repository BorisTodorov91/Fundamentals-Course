package DataTypesAndVariablesLab;

import java.util.Scanner;

public class P02PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float dollars = Float.parseFloat(scanner.nextLine());

        float pounds = (float) (dollars * 1.36);

        System.out.printf("%.3f",pounds);

    }
}
