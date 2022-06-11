package BasicSyntaxExercise;

import java.util.Scanner;

public class P6StrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. вход от конзолата

        int num = Integer.parseInt(scanner.nextLine());

        int startNum = num;
        //2. трябва да разбием числото алгоритам
        int sumOfFac= 0;
        while ( num > 0){

            int lastDigit = num % 10;
            //3. намиране на факториелите на всяко число
            int fact =1;
            for (int i = 1; i <= lastDigit ; i++) {
                fact = fact * i;
            }
            //4. сума на вслиячки отелни факториели
            sumOfFac += fact;
            num = num / 10;
        }

        //5. проверка за стронг число ако числото е == сумата на факториелите

        if(startNum == sumOfFac){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }


    }
}
