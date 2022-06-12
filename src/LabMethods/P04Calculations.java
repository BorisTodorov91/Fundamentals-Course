package LabMethods;

import java.util.Scanner;

public class P04Calculations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        switch (text) {
            case "add":
                addNumber(firstNum, secondNum);
                break;
            case "multiply":
                multiplyNumber(firstNum, secondNum);
                break;
            case "subtract":
                subtractNumber(firstNum, secondNum);
                break;
            case "divide":
                divideNumber(firstNum, secondNum);
                break;
        }

    }

    private static void divideNumber(int firstNum, int secondNum) {
        System.out.println(firstNum / secondNum);
    }

    private static void subtractNumber(int firstNum, int secondNum) {
        System.out.println(firstNum - secondNum);
    }

    private static void multiplyNumber(int firstNum, int secondNum) {
        System.out.println(firstNum * secondNum);
    }

    public static void addNumber(int firstNum, int secondNum) {
        System.out.println(firstNum + secondNum);
    }
}
