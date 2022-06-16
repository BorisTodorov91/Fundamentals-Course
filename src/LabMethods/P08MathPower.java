package LabMethods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        double secondNum = Double.parseDouble(scanner.nextLine());

       double result = getPow(firstNum,secondNum);

        DecimalFormat df = new DecimalFormat("0.####");

        System.out.println(df.format(result));
    }

    private static double getPow(double firstNum, double secondNum) {

       double result = 1;
        for (int i = 1; i <=secondNum ; i++) {
            result = result * firstNum;
        }

        return result;
    }


}
