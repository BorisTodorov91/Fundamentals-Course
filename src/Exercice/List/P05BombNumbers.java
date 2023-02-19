package Exercice.List;

import java.util.*;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            List<Integer> integerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

            String commad = scanner.nextLine();
            int numForDetonation = Integer.parseInt(commad.split(" ")[0]);
            int numOfNeighbors = Integer.parseInt(commad.split(" ")[1]);

            while (integerList.contains(numForDetonation)){

                int elementIndex = integerList.indexOf(numForDetonation);

                int left = Math.max(0, elementIndex - numOfNeighbors);
                int riht = Math.min(elementIndex + numOfNeighbors, integerList.size() -1 );


                for (int i = riht; i >= left ; i--) {
                    integerList.remove(i);

                }
            }

        System.out.println(integerList.stream().mapToInt(Integer::intValue).sum());

    }
}
