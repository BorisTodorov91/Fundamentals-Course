package AssociativeArrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Map<String, Integer> counts = new LinkedHashMap<>();

        for (String word:
             words) {
            String wordInLowerCase = word.toLowerCase();
            if(counts.containsKey(wordInLowerCase)){
                counts.put(wordInLowerCase, counts.get( wordInLowerCase) + 1);
            }else {
                counts.put(wordInLowerCase, 1);
            }
        }

        ArrayList<String> odds = new ArrayList<>();

        for (var enrty:
             counts.entrySet()) {
            if(enrty.getValue() % 2 == 1){
                odds.add(enrty.getKey());
            }
        }

        for (int i = 0; i < odds.size(); i++) {
            System.out.print(odds.get(i));
            if (i < odds.size() -1 ){
                System.out.print(", ");
            }
        }
    }
}
