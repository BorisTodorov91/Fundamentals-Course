package AssociativeArrays;

import java.util.*;
import java.util.stream.Collectors;

public class P01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numList = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        Map<Double, Integer> countNumberMap = new TreeMap<>();
        for (double currentNum : numList) {
            Integer currentValue = countNumberMap.get(currentNum);

            if(countNumberMap.containsKey(currentNum)){
                countNumberMap.put(currentNum, currentValue + 1);
            }
            else {
                countNumberMap.put(currentNum, 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : countNumberMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }


    }
}
