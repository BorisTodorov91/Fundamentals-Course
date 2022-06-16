package LabMethods;

import java.util.Scanner;

public class P06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double area = getRectangelArea( weight,  height);
        System.out.println((int)area);

    }

    private static double getRectangelArea(double weight, double height) {
        return weight  * height;
    }
}
