package LabMethods;

import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int numOfProduct = Integer.parseInt(scanner.nextLine());

        order(product, numOfProduct);

    }

    //•	coffee – 1.50
//•	water – 1.00
//•	coke – 1.40
//•	snacks – 2.00
    public static void order(String product, int numOfProduct) {
        double moeny = 0;
        switch (product) {
            case "coffee":
                moeny = 1.5;
                break;
            case "water":
                moeny = 1.00;
                break;
            case "coke":
                moeny = 1.4;
                break;
            case "snacks":
                moeny=2.00;
                break;

        }
        System.out.printf("%.2f", moeny * numOfProduct);
    }


}
