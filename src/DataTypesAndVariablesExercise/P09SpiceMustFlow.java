package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int source = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int count = 0;
        while (source >=100){
            int spice = source - 26;
            sum = sum + spice;
            count++;

            source = source - 10;
        }

        System.out.println(count);
        if(sum >= 26){
            sum -= 26;
        }
        System.out.println(sum);

    }
}
