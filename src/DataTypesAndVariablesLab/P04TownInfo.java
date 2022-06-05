package DataTypesAndVariablesLab;

import java.util.Scanner;

public class P04TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //"Town {town name} has population of {population} and area {area} square km.".
        String nameOfCity = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        int area = Integer.parseInt(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", nameOfCity,population,area);

    }
}
