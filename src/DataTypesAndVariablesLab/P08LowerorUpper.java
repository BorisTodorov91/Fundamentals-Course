package DataTypesAndVariablesLab;

import java.util.Calendar;
import java.util.Scanner;

public class P08LowerorUpper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        char character = scanner.nextLine().charAt(0);

        if (Character.isLowerCase(character)){
            System.out.printf("lower-case");
        }else if (Character.isUpperCase(character)){
            System.out.printf("upper-case");
        }
    }
}
