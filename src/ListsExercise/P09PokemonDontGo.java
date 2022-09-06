package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09PokemonDontGo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> distance = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        int sumOfRemovedElement = 0;// държиме сумата от всички премахнати елементи
        while (distance.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());
            // index  < 0
            if (index < 0) {
                //взимаме първия и последният елемент от листа, премахваме първият индец и на негово място слагаме последният
                int firstElement = distance.get(0);
                sumOfRemovedElement += firstElement;
                int lastElement = distance.get(distance.size() - 1);
                distance.set(0, lastElement);
                //модификация на листа
                modifyList(distance, firstElement);
            }
            //index >  от последият
            else if (index > distance.size() - 1) {
                int firstElement = distance.get(0);
                int lastElement = distance.get(distance.size() - 1);
                sumOfRemovedElement += lastElement;
                distance.set(distance.size() - 1, firstElement);
                //модификация на листа
                modifyList(distance, lastElement);
            }
            // между 0 и последният
            else if (index >= 0 && index <= distance.size() - 1) {
                int removedElement = distance.get(index);
                sumOfRemovedElement += removedElement;
                distance.remove(index);
                //модификация на листа
                modifyList(distance, removedElement);
            }
        }

        System.out.println(sumOfRemovedElement);

    }

    public static void modifyList(List<Integer> list, int removedElement) {

        for (int index = 0; index <= list.size() - 1; index++) {
            int currentElement = list.get(index);

            if (currentElement <= removedElement) {
                currentElement += removedElement;
            } else {
                currentElement -= removedElement;
            }
            // заменяме старата стойност на елемента с променената

            list.set(index, currentElement);
        }
    }
}
