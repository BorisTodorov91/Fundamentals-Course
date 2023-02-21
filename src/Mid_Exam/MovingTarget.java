package Mid_Exam;

import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> integerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("End")){
            String inputType = command.split("\\s+")[0];
            int index = Integer.parseInt(command.split("\\s+")[1]);

            switch (inputType) {
                case "Shoot" -> {
                    int power = Integer.parseInt(command.split("\\s+")[2]);
                    if (isIndexValid(index, integerList.size())) {
                        int temp = integerList.get(index);
                        if (power >= temp) {
                            integerList.remove(index);
                        } else {
                            integerList.set(index, temp - power);
                        }
                    }
                }
                case "Add" -> {
                    int value = Integer.parseInt(command.split("\\s+")[2]);
                    if (isIndexValid(index, integerList.size())) {
                        integerList.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                }
                case "Strike" -> {
                    int values = Integer.parseInt(command.split("\\s+")[2]);
                    int radius = 1 + (values * 2);
                    int radiusStart = index - values;
                    int radiusEnd = index + values;
                    if (radiusStart >= 0 && radiusEnd <= integerList.size()) {
                        integerList.subList(radiusStart, radius + 1).clear();
                    } else {
                        System.out.println("Strike missed!");
                    }
                }
            }

            command = scanner.nextLine();
        }


        StringBuilder stringBuilder = new StringBuilder();
        for (Integer integer : integerList) {
            stringBuilder.append(integer+"|");
        }
        int i = stringBuilder.lastIndexOf("|");
        stringBuilder.deleteCharAt(i);
        System.out.println(stringBuilder);
    }

    private static boolean isIndexValid(int index, int size) {
        return index >= 0 && index <= size - 1;
    }
}
