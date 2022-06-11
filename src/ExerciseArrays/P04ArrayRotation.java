package ExerciseArrays;

import java.util.Scanner;

public class P04ArrayRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        /*51 47 32 61 21
          2
             51 47 32 61 21
          1. 47 32 61 21 51
          2. 32 61 21 51 47
        */


        String [] arrOfNum = scanner.nextLine().split(" ");
        int numOfRotation = Integer.parseInt(scanner.nextLine());
        String lastIndex = arrOfNum[arrOfNum.length - 1];
        for (int i = 1; i <=numOfRotation ; i++) {
            //1. ротация
            //2. взимаме първия елемент на масива
            String firstElement = arrOfNum[0];

            //3. местиме всички елементи наляво
            for (int index = 0; index < arrOfNum.length -1; index++) {
                arrOfNum[index] = arrOfNum[index +1];
            }
            //4. слагаме последния елемент на масива на индекс 0
            arrOfNum[arrOfNum.length - 1] = firstElement;

        }


        for (String num: arrOfNum) {
            System.out.print(num + " ");
        }

    }
}
