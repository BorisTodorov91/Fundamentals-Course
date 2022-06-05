package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        //алгоритам за разбиване на числа
        while ( num > 0){
            //1.взимаме последното число всяко едно число когато се дели % с 10 получаваме последното число
            int lastDigit = num % 10;
            //2.добавяме числото в променливата сум
            sum = sum +lastDigit;
            //3.махаме последната цифра с целочислено деление
            num = num /10;
        }


        System.out.println(sum);
    }
}
