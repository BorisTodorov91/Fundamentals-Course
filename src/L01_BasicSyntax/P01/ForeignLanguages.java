package L01_BasicSyntax.P01;

import java.util.Scanner;

public class ForeignLanguages {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String coutry = scanner.nextLine();

        switch (coutry){

            case "England":
            case "USA":
                System.out.println("English");
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish ");
                break;
            default:
                System.out.println("unknown");
                break;



        }



    }
}
