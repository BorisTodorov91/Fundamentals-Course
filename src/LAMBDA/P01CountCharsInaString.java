package LAMBDA;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01CountCharsInaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] commad = scanner.nextLine().split("\\s+");
        Map<String, Integer> characterIntegerMap = new LinkedHashMap<>();

        for (int i = 0; i < commad.length; i++) {

            String currentData = commad[i];
            String[] data = currentData.split("");

            for (int j = 0; j < data.length; j++) {
                String current = data[j];

                if(!characterIntegerMap.containsKey(current)){
                    characterIntegerMap.put(current,1);
                }else {
                    int currentValue = characterIntegerMap.get(current);
                    characterIntegerMap.put(current,currentValue  + 1);
                }

            }
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : characterIntegerMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() +" -> "+ stringIntegerEntry.getValue() );
        }
    }
}
