package Mid_Exam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> list = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Yohoho!")) {

            String[] inputData = input.split("\\s+");
            switch (inputData[0]) {

                case "Loot":
                    String[] lootData = Arrays.copyOfRange(inputData, 1, inputData.length);

                    for (String lootDatum : lootData) {
                        if (!list.contains(lootDatum)) {
                            list.add(0, lootDatum);

                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(inputData[1]);
                    if(index >= 0 && index <= list.size()){
                        String remove = list.remove(index);
                        //list.remove(index);
                        list.add(remove);
                    }
                    break;
                case "Steal":
                    int numOfIteration = Integer.parseInt(inputData[1]);

                    int numFrom = list.size() - numOfIteration  ;
                    StringBuilder sb = new StringBuilder();
                    for (int i = numFrom; i <= list.size() - 1; i = numFrom) {
                        String remove = list.remove(i);
                        sb.append(remove+", ");
                    }
                    int i = sb.lastIndexOf(", ");
                    sb.deleteCharAt(i);
                    System.out.println(sb);
                    break;
            }
            input = scanner.nextLine();
        }
        double result = 0;
        for (String s : list) {
            result += s.length();
        }

        if(list.isEmpty()){
            System.out.println("Failed treasure hunt.");
        }else {
            System.out.printf("Average treasure gain: %.2f pirate credits.",result/list.size());

        }
    }
}

