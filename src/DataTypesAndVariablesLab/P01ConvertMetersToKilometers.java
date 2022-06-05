package DataTypesAndVariablesLab;

import java.util.Scanner;

public class P01ConvertMetersToKilometers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int metars = Integer.parseInt(scanner.nextLine());
        double  kilomiters = metars / 1000.0;
        System.out.printf("%.2f",kilomiters);
    }
}
