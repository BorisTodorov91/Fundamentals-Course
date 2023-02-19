package Exercice.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> newIntigerList = new ArrayList<>();
        String command = scanner.nextLine();

        while (!command.equals("End")){

            String[] inputCommand = command.split("\\s+");
            String token = inputCommand[0];

            switch (inputCommand.length){
                case 2:
                    if(token.equals("Add")){
                        //•	Add {number} - add number at the end
                        int number = Integer.parseInt(inputCommand[1]);
                        integerList.add(number);
                    }else {
                        //•	Remove {index} - remove that index
                        int index = Integer.parseInt(inputCommand[1]);
                        if(isValidIndex(index, integerList.size())){
                            integerList.remove(index);
                        }
                        else {
                            System.out.println("Invalid index");
                        }
                    }
                    break;

                case 3:
                    //•	Insert {number} {index} - insert number at given index
                        if(token.equals("Insert")){

                            int numberToInsert = Integer.parseInt(inputCommand[1]);
                            int index = Integer.parseInt(inputCommand[2]);

                            if(isValidIndex(index,integerList.size())){
                                integerList.add(index,numberToInsert);
                            }
                            else {
                                System.out.println("Invalid index");
                            }
                        }
                    //•	Shift left {count} - first number becomes last 'count' times
                        if (command.contains("left")){
                           int countLeft  = Integer.parseInt(inputCommand[2]);

                            for (int i = 1; i <= countLeft; i++) {

                                int firstNum = integerList.get(0);
                                integerList.add(firstNum);
                                integerList.remove(0);
                            }
                            //•	Shift right {count} - last number becomes first 'count' times
                        }else if (command.contains("right")){
                            int countRight = Integer.parseInt(inputCommand[2]);

                            for (int i = 1; i <= countRight; i++) {
                                int lastNum = integerList.get( integerList.size() -1);
                                integerList.add(0, lastNum);
                                integerList.remove(integerList.size() - 1);
                            }
                        }

                    break;

            }
            command = scanner.nextLine();
        }
        // print
        for (Integer integer : integerList) {
            System.out.printf("%d ", integer);
        }
    }
    private static boolean isValidIndex(int index, int size) {

        return index >= 0 && index <= size - 1 ;

    }


}
