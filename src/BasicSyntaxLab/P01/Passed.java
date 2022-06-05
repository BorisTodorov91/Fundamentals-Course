package BasicSyntaxLab.P01;

import java.util.Scanner;

public class Passed {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num= Double.parseDouble(scanner.nextLine());

        if (num >= 3){

            System.out.println("Passed!");
        }

    }
}
