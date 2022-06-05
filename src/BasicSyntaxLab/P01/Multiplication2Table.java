package BasicSyntaxLab.P01;

import java.util.Scanner;

public class Multiplication2Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        if (secondNum > 10 ){
            System.out.printf("%d X %d = %d%n", num,secondNum, num * secondNum);
        }
        for (int i = secondNum; i <=10 ; i++) {

            System.out.printf("%d X %d = %d%n", num,i, num *i);

        }
    }
}
