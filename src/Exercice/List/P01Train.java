package Exercice.List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // data structure List<Initiger> add from first line
        List<Integer> wagon = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        // nextline int max capacity
        int capacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        // until nextline = "end" read first line
        while (!command.equals("end")){
            String[] input = command.split(" ");

            if(input.length == 2){
                // if command have Add - add a wagon to the end with the given number of passengers
                int numOfPassinger =Integer.parseInt( input[1]);
                wagon.add(numOfPassinger);
            }
            // find an existing wagon to fit all the passengers (starting from the first wagon)
            else {

                for (int i = 0; i < wagon.size(); i++) {
                    int numToAdd = Integer.parseInt(input[0]);
                    int currentValue = wagon.get(i);
                    if ( currentValue + numToAdd <= capacity ) {
                        wagon.set(i, currentValue + numToAdd);
                        break;
                    }
                }
            }
            command =scanner.nextLine();
        }

        //  In the end, print the final state of the train (all the wagons separated by a space)
        for (Integer integer : wagon) {
            System.out.printf("%d ", integer);
        }




    }
}
