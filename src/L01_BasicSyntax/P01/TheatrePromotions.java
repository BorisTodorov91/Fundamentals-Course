package L01_BasicSyntax.P01;

import java.util.Scanner;

public class TheatrePromotions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int ticket = 0;
        boolean isValid = false;

        if (age >= 0 && age <= 18 ) {
            if (day.equals("Weekday")) {
                ticket = 12;
            } else if (day.equals("Weekend")) {
                ticket = 15;
            } else if (day.equals("Holiday")) {
                ticket = 5;
            }

        }else if ( age > 18 && age <= 64 ){
            if (day.equals("Weekday")) {
                ticket = 18;
            } else if (day.equals("Weekend")) {
                ticket = 20;
            } else if (day.equals("Holiday")) {
                ticket = 12;
            }
        }else  if (age > 64 && age <= 122){
            if (day.equals("Weekday")) {
                ticket = 12;
            } else if (day.equals("Weekend")) {
                ticket = 15;
            } else if (day.equals("Holiday")) {
                ticket = 10;
            }
        }else  {
            isValid = true;
        }

        if (isValid){
            System.out.println("Error!");
        }else {
            System.out.println(ticket +"$" );
        }


    }
}
