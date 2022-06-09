package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class P03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String inputLine = scanner.nextLine();

        int [] arrNum = Arrays.stream(inputLine.split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;

        for (int i = 0; i <arrNum.length ; i++) {
            int currentNum = arrNum[i];

            if (currentNum % 2 == 0){
                sum += currentNum;
            }
        }
        System.out.println(sum);
    }
}
