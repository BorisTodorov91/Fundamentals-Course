package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;
public class P05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] num = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int oddSum = 0;
        int evenSum = 0;

        for (int number:  num) {
            if ( number % 2 == 0){
                oddSum += number;
            }else {
                evenSum += number;
            }
        }

        int diff = oddSum - evenSum;

        System.out.println(diff);

    }
}
