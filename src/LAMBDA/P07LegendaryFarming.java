package LAMBDA;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class P07LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> items = new LinkedHashMap<>();
        String shards = "shards";
        String fragments = "fragments";
        String motes = "motes";

        items.put(shards,0);
        items.put(fragments, 0);
        items.put(motes,0);

        Map<String,Integer> jungItems = new LinkedHashMap<>();

        boolean isWin = false;
        while (!isWin){
            String command = scanner.nextLine();
            String[] itemCommand = command.split(" ");
            for (int i = 0; i < itemCommand.length; i += 2) {
                int quantity = Integer.parseInt(itemCommand[i]);
                String name = itemCommand[i +1].toLowerCase();

                // валиден итем
                if(name.equals(shards) || name.equals(fragments)|| name.equals(motes)){
                    int currentItemValue = items.get(name);
                    items.put(name, currentItemValue + quantity);
                } else {
                    // боклук
                    if(!jungItems.containsKey(name)){
                        jungItems.put(name,quantity);
                    }else {
                        int currentJungValue = jungItems.get(name);
                        jungItems.put(name, quantity + currentJungValue);
                    }
                }
                if(items.get(shards) >= 250){
                    System.out.printf("Shadowmourne obtained!%n");
                    items.put(shards, items.get(shards)- 250);
                    isWin = true;
                    break;
                }else if (items.get(fragments) >= 250){
                    System.out.printf("Valanyr obtained!%n");
                    items.put(fragments, items.get(fragments)-250);
                    isWin = true;
                    break;
                }else if (items.get(motes)>= 250){
                    System.out.printf("Dragonwrath obtained!%n");
                    items.put(motes, items.get(motes) - 250);
                    isWin = true;
                    break;
                }
            }
            if (isWin){
                break;
            }
        }
        items.entrySet().forEach(stringIntegerEntry -> System.out.printf("%s: %d%n", stringIntegerEntry.getKey(),stringIntegerEntry.getValue()));
        jungItems.entrySet().forEach(stringIntegerEntry -> System.out.printf("%s: %d%n", stringIntegerEntry.getKey(),stringIntegerEntry.getValue()));
    }
}
