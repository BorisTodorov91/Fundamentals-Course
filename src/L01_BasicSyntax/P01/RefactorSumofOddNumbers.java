package L01_BasicSyntax.P01;

import java.util.Scanner;

public class RefactorSumofOddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i <= num ; i++) {
           if ( num % 2 != 0){
               System.out.println(i);
           }
        }


    }
}
