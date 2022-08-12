package List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int sizeOfList = numList.size();

        for (int i = 0; i < sizeOfList / 2 ; i++) {
            int firstNum = numList.get(i);
            int secondNum = numList.get(numList.size() - 1);

            numList.set(i , firstNum + secondNum);
            numList.remove(numList.size() - 1);
        }
        for (int elements: numList) {
            System.out.print(elements + " ");
        }


    }
}
