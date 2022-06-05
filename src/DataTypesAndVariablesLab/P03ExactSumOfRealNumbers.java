package DataTypesAndVariablesLab;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0);
        for (int i = 1; i <= num; i++) {
            BigDecimal newNum = new BigDecimal(scanner.nextLine());
            sum = sum.add(newNum);
        }

        System.out.println(sum);
    }
}
