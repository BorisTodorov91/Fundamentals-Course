package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int maxPassinger = Integer.parseInt(scanner.nextLine());

        String comands = scanner.nextLine();

        while (!comands.equals("end")) {
            String[] comantData = comands.split(" ");
            if (comantData[0].equals("Add")) {
                int numberOfPassinger = Integer.parseInt(comantData[1]);
                wagons.add(numberOfPassinger);
            } else {
                int passingerToAdd = Integer.parseInt(comantData[0]);

                for (int i = 0; i < wagons.size(); i++) {
                    int currentWagon = wagons.get(i);

                    if (currentWagon + passingerToAdd <= maxPassinger) {
                        wagons.set(i, currentWagon + passingerToAdd);
                        break;
                    }
                }
            }

            comands = scanner.nextLine();
        }

        for (int e :
                wagons) {
            System.out.print(e + " ");

        }

    }
}
