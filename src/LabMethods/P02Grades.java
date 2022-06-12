package LabMethods;

import java.util.Scanner;

public class P02Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        gradeBorder(grade);

    }

    public static void gradeBorder (double num){

        if(num >= 2.00 && num <= 2.99){
            System.out.println("Fail");
        } else if (num >= 3.00 && num <= 3.49) {
            System.out.println("Poor");
        }else if (num >= 3.50 && num <= 4.49) {
            System.out.println("Good");
        }else if (num >= 4.50 && num <= 5.49) {
            System.out.println("Very good");
        }else if (num >= 5.50 && num <= 6.00) {
            System.out.println("Excellent");
        }
    }
}
