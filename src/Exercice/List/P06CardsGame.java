package Exercice.List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (firstList.size() != 0 && secondList.size() != 0){

            int firstPlayerCard = firstList.get(0);
            int secondPlayerCard = secondList.get(0);

            firstList.remove(0);
            secondList.remove(0);

            if(firstPlayerCard > secondPlayerCard){
                firstList.add(firstPlayerCard);
                firstList.add(secondPlayerCard);

            }else if (secondPlayerCard > firstPlayerCard){
                secondList.add(secondPlayerCard);
                secondList.add(firstPlayerCard);
            }
        }

        if (firstList.size() != 0){
            int sum = firstList.stream().mapToInt(Integer::intValue).sum();
            System.out.printf("First player wins! Sum: %d%n",sum);
        }else if (secondList.size() != 0){
            int sum = secondList.stream().mapToInt(Integer::intValue).sum();
            System.out.printf("Second player wins! Sum: %d%n",sum);

        }


    }
}
