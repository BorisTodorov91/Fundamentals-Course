package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double maxVolume = Double.MIN_VALUE;//променлива в която ще държиме най-голямата стойност
        String maxModel = "";//най-големия модел

        for (int keg = 1; keg <= n; keg++) {

            String model = scanner.nextLine();
            double radius= Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            // обем на кега π * r^2 * h
            double volume = Math.PI * Math.pow(radius,2) * height;

            //проверка за най-голям обем
            if (volume > maxVolume){
                maxVolume = volume;
                maxModel = model;
            }
        }

        System.out.println(maxModel);
    }
}
