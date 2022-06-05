package BasicSyntaxLab.P01;

import java.util.Scanner;

public class EvenNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        while (true) {
            if (num % 2  == 0) {
                System.out.printf("The number is: %d", Math.abs(num));
                break;

            }else {
                System.out.println("Please write an even number.");
                num = Integer.parseInt(scanner.nextLine());
            }
        }
    }


}
