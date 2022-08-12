package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //vhod
        List<Integer> numberOfList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();


        while (!input.equals("end")) {
            List<String> comand = Arrays.stream(input.split(" ")).collect(Collectors.toList());

            String typoOfComand = comand.get(0);
            switch (typoOfComand) {
                case "Contains":
                    int item = Integer.parseInt(comand.get(1));
                    if (numberOfList.contains(item)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String secondComand = comand.get(1);

                    if (secondComand.equals("even")) {
                        List<Integer> evenNumList = getEvenNumbers(numberOfList);
                        System.out.println(evenNumList.toString().replaceAll("[\\[\\],]", ""));
                    } else {
                        List<Integer> oddNumList = getOddNumber(numberOfList);
                        System.out.println(oddNumList.toString().replaceAll("[\\[\\],]", ""));
                    }
                    break;
                case "Get":
                    int sum = 0;

                    for (int i = 0; i < numberOfList.size(); i++) {
                        sum = sum + numberOfList.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = comand.get(1);
                    int number = Integer.parseInt(comand.get(2));

                    List<Integer> conditionalNumList = getConditionNum (numberOfList, condition,number);
                    System.out.println(conditionalNumList.toString().replaceAll("[\\[\\],]", ""));
                    break;
            }
            input = scanner.nextLine();
        }


    }

    private static List<Integer> getConditionNum(List<Integer> numberOfList, String condition, int number) {

        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i <numberOfList.size(); i++) {
            int currentNum = numberOfList.get(i);

            if (condition.equals("<")) {
                if (currentNum < number) {
                    resultList.add(currentNum);
                }
            } else if (condition.equals(">")) {
                if (currentNum > number) {
                    resultList.add(currentNum);
                }
            } else if (condition.equals("<=")) {
                if (currentNum <= number) {
                    resultList.add(currentNum);
                }
            } else if (condition.equals(">=")) {
                if (currentNum >= number) {
                    resultList.add(currentNum);
                }
            }
        }
        return resultList;
    }

    private static List<Integer> getOddNumber(List<Integer> numberOfList) {
        List<Integer> oddNumberList = new ArrayList<>();
        for (int i = 0; i < numberOfList.size(); i++) {
            int currentItem = numberOfList.get(i);
            if (currentItem % 2 != 0) {
                oddNumberList.add(currentItem);
            }
        }
        return oddNumberList;
    }

    private static List<Integer> getEvenNumbers(List<Integer> numberOfList) {
        List<Integer> evenNumbersList = new ArrayList<>();

        for (int i = 0; i < numberOfList.size(); i++) {
            int currentItem = numberOfList.get(i);
            if (currentItem % 2 == 0) {
                evenNumbersList.add(currentItem);
            }
        }
        return evenNumbersList;
    }
}
