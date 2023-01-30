package Exercice.List;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")){
            String[] input = command.split("\\s+");
            switch (input.length){
                case 2:
                    int valueToDelete = Integer.parseInt(input[1]);
                    integerList.removeAll(Arrays.asList(valueToDelete));
                    break;
                case 3:
                    int element = Integer.parseInt(input[1]);
                    int index = Integer.parseInt(input[2]);

                    integerList.add(index, element);
                    break;
            }

            command = scanner.nextLine();
        }

        /// print
        for (Integer integer : integerList) {
            System.out.printf("%d ", integer);
        }


    }
}
