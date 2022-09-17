package AssocoatoveArraysExarcise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsinString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<Character , Integer> symbolCount = new LinkedHashMap<>();
        for (char symbol: text.toCharArray()) {
            if(symbol == ' '){
                continue;
            }
            //ако несме срещали до сега символа
            if (!symbolCount.containsKey(symbol)){
                symbolCount.put(symbol , 1);

            }else {
                // ако сме срещали до сега символа
                int currentCount = symbolCount.get(symbol);
                symbolCount.put(symbol, currentCount +1);
            }
        }
        // печатане
        symbolCount.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> "+ entry.getValue()));
    }
}
