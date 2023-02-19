package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> fistPlayerCards = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondPlayerCards = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        // 1. взимаме първата карта от раката
        // 2. премахваме картата от раката
        // 3. провертка кой печели:
        // картата на 1 > карта 2
        // картата 2 > карта 1
        // играта продължава когато и двамата имат карти
        // играта спира , когато някой остане без карти

        while (fistPlayerCards.size() != 0 && secondPlayerCards.size() != 0) {
            int firstPlayerCard = fistPlayerCards.get(0);
            int secondPlayerCard = secondPlayerCards.get(0);
            fistPlayerCards.remove(0);
            secondPlayerCards.remove(0);

            if (firstPlayerCard > secondPlayerCard){
                fistPlayerCards.add(firstPlayerCard);
                fistPlayerCards.add(secondPlayerCard);

            }else if (secondPlayerCard > firstPlayerCard ){
                secondPlayerCards.add(secondPlayerCard);
                secondPlayerCards.add(firstPlayerCard);

            }

        }

        if (fistPlayerCards.size() == 0) {
            //втория печели -> сума от картите на втория
            System.out.printf("Second player wins! Sum: %d", getCardsSum(secondPlayerCards));
        }
        //2. ако на втория му свършат картите10 20 30 40 50
        //50 40 30 30 10
        else if (secondPlayerCards.size() == 0) {
            //първия печели
            System.out.printf("First player wins! Sum: %d", getCardsSum(fistPlayerCards));
        }
    }

    private static int getCardsSum(List<Integer> listCards) {
        int sum = 0;
        for (int card : listCards) {
            sum += card;
        }

        return sum;

    }
}
