package ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String comands = scanner.nextLine();

        while (!comands.equals("end")) {

            List<String> inputComand = Arrays.stream(comands.split(" ")).collect(Collectors.toList());

            String firstLineComand = inputComand.get(0);
            int item = 0;
            int index = 0;

            switch (firstLineComand) {
                case "Delete":
                    item = Integer.parseInt(inputComand.get(1));
                    numbers.removeAll(Arrays.asList(item));
                    break;

                case "Insert":
                    item = Integer.parseInt(inputComand.get(1));
                    index = Integer.parseInt(inputComand.get(2));

                    numbers.add(index, item);
                    break;

            }
            comands = scanner.nextLine();
        }

        for (int e :
                numbers) {
            System.out.print(e + " ");

        }
    }
}
