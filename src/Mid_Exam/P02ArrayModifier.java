package Mid_Exam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P02ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")){

            String input = command.split("\\s+")[0];
            switch (input){
                case "swap":
                    int firstIndex = Integer.parseInt(command.split("\\s+")[1]);
                    int secondIndex = Integer.parseInt(command.split("\\s+")[2]);
                    Collections.swap(numbers, firstIndex,secondIndex);
                    break;
                case "multiply":
                    int firstIndexM = Integer.parseInt(command.split(" ")[1]);
                    int secondIndexM = Integer.parseInt(command.split(" ")[2]);

                    numbers.set(firstIndexM, numbers.get(firstIndexM) * numbers.get(secondIndexM));
                    break;
                case "decrease":
                    IntStream.range(0,numbers.size()).forEach(i-> numbers.set(i, numbers.get(i)-1));
                   /* for (int i = 0; i < numbers.size(); i++) {
                        int i1 = numbers.get(i) - 1;
                        numbers.set(i, i1);
                    }*/
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.print(Arrays.toString(new List[]{numbers}).replaceAll("[\\[\\]]", ""));
    }
}
