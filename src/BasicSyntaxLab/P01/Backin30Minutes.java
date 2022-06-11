package BasicSyntaxLab.P01;

import java.util.Scanner;

public class Backin30Minutes {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initHours = Integer.parseInt(scanner.nextLine());
        int initMinutes = Integer.parseInt(scanner.nextLine());

        int allMinutes = (initHours * 60) + initMinutes + 30;



        int hours = allMinutes / 60;
        int min = allMinutes % 60;

        if (hours == 24 ){
            hours = 0;
        }

        System.out.printf("%d:%02d", hours , min);


    }
}
