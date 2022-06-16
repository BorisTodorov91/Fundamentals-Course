package LabMethods;

import java.util.Arrays;
import java.util.Scanner;

public class P010MultiplyEvensbyOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(getMultiply(n));
    }

    public static int getMultiply (int n){
        int evenNum = multiplyEvenNum(n);
        int oddNum = multiplyOdd(n);

        return evenNum * oddNum;
    }

    private static int multiplyOdd(int n) {
        String intToString = Integer.toString(n);

        int[] arr = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] % 2 == 0){
                sum += arr[i];
            }
        }

        return sum;
    }

    private static int multiplyEvenNum(int n) {

        String intToString = Integer.toString(n);

        int[] arr = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] % 2 != 0){
                sum += arr[i];
            }
        }

        return sum;
    }
}
