package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int [] arr = new int[n];

        //пълнене на масива
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        //принтиране на масива
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

        int [] arrays = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
