package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P011Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double maxValue = Double.MIN_VALUE;
        int maxSnowballSnow = 0;
        int maxSnowballQuality = 0;
        int maxSnowballTime = 0;

        for (int i = 1; i <=n ; i++) {
            //•	On the first line, you will get the snowballSnow – an integer.
            //•	On the second line, you will get the snowballTime – an integer.
            //•	On the third line, you will get the snowballQuality – an integer.
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            //формула (snowballSnow / snowballTime) ^ snowballQuality
            double snowballValue = Math.pow((snowballSnow/snowballTime), snowballQuality);

            if (snowballValue > maxValue){
                maxValue = snowballValue;
                maxSnowballSnow = snowballSnow;
                maxSnowballQuality = snowballQuality;
                maxSnowballTime = snowballTime;
            }


        }
        System.out.printf("%d : %d = %.0f (%d)", maxSnowballSnow,maxSnowballTime,maxValue,maxSnowballQuality);
    }
}
