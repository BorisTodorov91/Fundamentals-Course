package L01_Basic_Syntax.BasicSyntaxExercise;

import java.util.Scanner;

public class P7VendingMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String comand = scanner.nextLine();
        double sum = 0;

        //1. зареждане на машината с монети докато не получа Старт
        while (!comand.equals("Start")) {
            //1.2 запазване на парите в една променлива
               double coin= Double.parseDouble(comand);
            //1.3 0.1, 0.2, 0.5, 1, and 2 coins. стойностите на монетите
            if (coin != 0.1 && coin!=0.2 && coin != 0.5 && coin!=1 && coin!=2){
                System.out.printf("Cannot accept %.2f%n", coin);
            }else {
                sum += coin;
            }
            comand = scanner.nextLine();
        }

        String product = scanner.nextLine();

        // 2. "Nuts", "Water", "Crisps", "Soda", "Coke". The prices are: 2.0, 0.7, 1.5, 0.8, 1.0
        while(!product.equals("End")) {
            boolean hasMoney = true;
            switch(product) {
                case "Nuts":
                    if(sum < 2) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        sum -= 2;
                    }
                    break;
                case "Water":
                    if(sum < 0.7) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        sum -= 0.7;
                    }
                    break;
                case "Crisps":
                    if(sum < 1.5) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        sum -= 1.5;
                    }
                    break;
                case "Soda":
                    if(sum < 0.8) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        sum -= 0.8;
                    }

                    break;
                case "Coke":
                    if(sum < 1) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        sum -= 1;
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    hasMoney = false;
                    break;
            }
            if(!hasMoney) {
                product = scanner.nextLine();
                continue;
            }
            System.out.printf("Purchased %s%n", product);


            product = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", sum);
    }
}
