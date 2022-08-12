package List;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //вход
        //3 3 6 1  6 6 1  12 1
        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).equals(numbers.get(i +1))){
                numbers.set(i , numbers.get(i) + numbers.get(i+1));
                numbers.remove(i + 1);
                i = -1;
            }
        }
        String output = joinElementsByDeliminator ( numbers, " ");
        System.out.println(output);
    }

    private static String joinElementsByDeliminator(List<Double> items, String delimiter) {
        String output = "";
        for (Double num : items) {
            output += (new DecimalFormat("0.#").format(num) + delimiter);
        }
        return output;
    }
}
