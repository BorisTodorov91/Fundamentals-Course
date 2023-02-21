package Mid_Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPassenger = Integer.parseInt(scanner.nextLine());
        List<Integer> lift = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < lift.size(); i++) {

            if( numOfPassenger < 1){
                break;
            }
            while (lift.get(i) < 4){

                if (numOfPassenger < 1){
                    break;
                }else {
                    lift.set(i, lift.get(i) +1);
                    numOfPassenger--;
                }

            }

        }
        if (numOfPassenger < 1) {
            System.out.println("The lift has empty spots!");
        } else {
            System.out.printf("There isn't enough space! %d people in a queue!%n", numOfPassenger);
        }
        System.out.println(lift.toString().replaceAll("[\\[\\],]", ""));


    }
}
