package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P010PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor  = Integer.parseInt(scanner.nextLine());

        int count = 0;//брой на покване
        int startPower = power; // слагаме първоначалната сила

        while (power >= distance){
            power -= distance;
            count++;

            if (power == startPower * 0.5){
                if (exhaustionFactor > 0){
                    power /=exhaustionFactor;
                }
            }

        }
        System.out.println(power);
        System.out.println(count);
    }
}
