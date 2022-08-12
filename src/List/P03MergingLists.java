package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();
        int minSizeOfList = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < minSizeOfList; i++) {
            int firstItem = firstList.get(i);
            int secondItem = secondList.get(i);

            result.add(firstItem);
            result.add(secondItem);

        }

        if (firstList.size() > secondList.size()){
            result.addAll(firstList.subList(minSizeOfList, firstList.size()));
        }else {
            result.addAll(secondList.subList(minSizeOfList, secondList.size() ));
        }


        for (int element:  result) {
            System.out.print(element + " ");
        }
    }
}
