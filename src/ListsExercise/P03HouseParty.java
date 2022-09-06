package ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HouseParty {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfComand = Integer.parseInt(scanner.nextLine());
        List<String> questNames = new ArrayList<>();

        for (int count = 1; count <= numOfComand; count++) {
            String comand = scanner.nextLine();
            //•	"{name} is going!"
            //•	"{name} is not going!"
            List<String> comandParts = Arrays.stream(comand.split(" ")).collect(Collectors.toList());
            String name = comandParts.get(0);

            // is going
            if (comandParts.size() == 3) {
                if (questNames.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    questNames.add(name);
                }
            }
            // is not going
            else if (comandParts.size() == 4) {
                if (questNames.contains(name)) {
                    questNames.remove(name);
                } else {
                    System.out.printf("%s is not in the list! %n", name);
                }

            }
        }

        for (String name :
                questNames) {
            System.out.println(name);
        }

    }
}
