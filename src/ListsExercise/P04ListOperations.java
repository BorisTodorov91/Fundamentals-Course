package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String comands = scanner.nextLine();

        while (!comands.equals("End")) {

            if (comands.contains("Add")){
                //Add {number} - add number at the end
                int numberToAdd = Integer.parseInt(comands.split(" ")[1]);
                numbers.add(numberToAdd);
            }else if (comands.contains("Insert")){
                //Insert {number} {index} - insert number at given index
                int numberToInsert = Integer.parseInt(comands.split(" ")[1]);
                int numberOfIndex = Integer.parseInt(comands.split(" ")[2]);
               if (isIndexValid(numberOfIndex,numbers.size())){
                   numbers.add(numberOfIndex,numberToInsert);
               }else {
                   System.out.println("Invalid index");
               }
            }else if (comands.contains("Remove")){
                //Remove {index} - remove that index
                int indexOfNumber = Integer.parseInt(comands.split(" ")[1]);

                if (isIndexValid(indexOfNumber,numbers.size())){
                    numbers.remove(indexOfNumber);
                }else {
                    System.out.println("Invalid index");
                }
            }else if (comands.contains("Shift left")){
                //Shift left {count} - first number becomes last 'count' times

                int countLeft = Integer.parseInt(comands.split(" ")[2]);
                for (int time = 1; time <=countLeft ; time++) {

                    int firstNum = numbers.get(0);
                    numbers.add(firstNum);
                    numbers.remove(0);
                }

            }else if (comands.contains("Shift right")){
                //Shift right {count} - last number becomes first 'count' times
                int countRight = Integer.parseInt(comands.split(" ")[2]);

                for (int time = 1; time <= countRight ; time++) {

                    int lastNum = numbers.get(numbers.size()-1);

                    numbers.add( 0 , lastNum);
                    numbers.remove(numbers.size() -1 );
                }
            }
            comands = scanner.nextLine();
        }

        for (int num: numbers) {
            System.out.print(num + " ");
        }

    }
    public  static boolean isIndexValid ( int index , int sizeOfList){
        return  index >= 0 && index <= sizeOfList -1;
    }
}
