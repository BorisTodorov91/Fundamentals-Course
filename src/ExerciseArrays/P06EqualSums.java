package ExerciseArrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        // първия идекс и елемента на първия индекс
        int  firstIndex = 0;
        int firstElement = numbers[0];
        //последния индекс и елемента на последния индекс
        int lastIndex = numbers.length  - 1;
        int lastElements = numbers[lastIndex];
        boolean isFound = false;

        //1. обхождаме всички елементи от 0 до последния индекс
        for (int index = 0; index <= lastIndex; index++) {
            int currentElement = numbers[index];
            int leftSum = 0;
            int rightSum = 0;

            //2. лява сума -> сумата на всички емеленти от 0 до текущия индекс на фор цикала
            for (int leftindex = 0; leftindex < index; leftindex++) {
                leftSum += numbers[leftindex];
            }
            //3. дясна сума -> сумата на всички елементи от текущия индекс + 1 до последния вкючително
            for (int rightindex = index + 1 ; rightindex <= lastIndex ; rightindex++) {
                rightSum += numbers[rightindex];
            }
            //4. проверка дали двете суми са еднакви
            if (leftSum == rightSum){
                System.out.println(index);
                isFound = true;
                break;
            }


        }

        if(!isFound){

            System.out.println("no");
        }

    }
}
