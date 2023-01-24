package LAMBDA;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        while (!command.equals("stop")){
            int value = Integer.parseInt(scanner.nextLine());


            if (!linkedHashMap.containsKey(command)){
                linkedHashMap.put(command,value );
            }else {
                int currentValue = linkedHashMap.get(command);
                linkedHashMap.put(command,value + currentValue );
            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : linkedHashMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() +" -> "+ stringIntegerEntry.getValue());
        }
    }
}
