package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            List<String> comandLine = Arrays.stream(input.split(" ")).collect(Collectors.toList());

            String comand = comandLine.get(0);
            int item = 0;
            int index = 0;
            switch (comand){
                case "Add":
                    item = Integer.parseInt(comandLine.get(1));
                    numList.add(item);
                    break;
                case "Remove":
                    item = Integer.parseInt(comandLine.get(1));
                    numList.remove(Integer.valueOf(item));
                    break;
                case "RemoveAt":
                    index = Integer.parseInt(comandLine.get(1));
                    numList.remove(index);
                    break;
                case "Insert":
                    item = Integer.parseInt(comandLine.get(1));
                    index = Integer.parseInt(comandLine.get(2));
                    numList.add(index, item);
                    break;
            }

            input = scanner.nextLine();
        }

        for (int element : numList) {
            System.out.print(element + " ");
        }
    }


}
