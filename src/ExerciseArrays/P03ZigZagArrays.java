package ExerciseArrays;

import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int [] firstArr = new int[n];
        int [] secondArr = new int[n];

        for (int i = 1; i <= n ; i++) {
            String numbers = scanner.nextLine();
            int firstNum = Integer.parseInt(numbers.split(" ")[0]);
            int secondNum = Integer.parseInt(numbers.split(" ")[1]);

            if ( i% 2 == 0){
                 //  когато е четен реда
                 // първото число отива в втория масив
                secondArr [ i - 1] = firstNum;
                // второто число отива в първия масив
                firstArr [ i - 1 ] = secondNum;

            }else {
                // когато е  не четен реда
                // първото число отива в първия масив
                firstArr [ i - 1] = firstNum;
                // второто число отива в втория масив
                secondArr [ i - 1] = secondNum;

            }
        }

        for (int elementOfFirstArr: firstArr) {
            System.out.print(elementOfFirstArr + " ");
        }
        System.out.println();
        for (int  elementOfSecondArr: secondArr) {
            System.out.print( elementOfSecondArr + " ");
        }

    }
}
