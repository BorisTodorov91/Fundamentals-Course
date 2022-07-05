package Mid_Exam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02CoffeeLover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> coffee = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        int numberOfComands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfComands; i++) {
            String inputCom = scanner.nextLine();
            String[] nameOfComands = inputCom.split(" ");
            switch (nameOfComands[0]) {
                case "Include":
                    coffee.add(nameOfComands[1]);
                    break;
                case "Remove":
                    int numberOfCoffee = Integer.parseInt(nameOfComands[2]);

                    if (numberOfCoffee < coffee.size()) {
                        switch (nameOfComands[1]) {
                            case "first":
                                for (int j = 0; j < numberOfCoffee; j++) {
                                    int indexOfCoffee = 0;
                                    coffee.remove(indexOfCoffee);

                                }
                                break;
                            case "last":
                                for (int j = 0; j < numberOfCoffee; j++) {
                                    int indexOfRemove = coffee.size() - 1;
                                    coffee.remove(indexOfRemove);
                                }
                                break;
                        }
                    }
                    break;
                case "Prefer":
                    int firstNumOfCoffee = Integer.parseInt(nameOfComands[1]);
                    int secondNumOfCoffee = Integer.parseInt(nameOfComands[2]);
                    if (firstNumOfCoffee < coffee.size() && secondNumOfCoffee < coffee.size()) {
                        String first = coffee.get(firstNumOfCoffee);
                        String second = coffee.get(secondNumOfCoffee);
                        coffee.set(firstNumOfCoffee, second);
                        coffee.set(secondNumOfCoffee, first);
                    }

                    break;
                case "Reverse":
                    Collections.reverse(coffee);
                    break;
            }

        }
        System.out.println("Coffees: ");
        System.out.println(coffee.toString().replaceAll("[\\[\\],]", ""));
    }
}
