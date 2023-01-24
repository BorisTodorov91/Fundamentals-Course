package LAMBDA;

import java.util.*;

public class P03Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String data = scanner.nextLine();

        Map<String , List<Double>> integerMap = new LinkedHashMap<>();

        while (!data.equals("buy")) {
            String[] dataInput = data.split("\\s+");
            String name = dataInput[0];
            double price= Double.parseDouble(dataInput[1]);
            double quantity = Double.parseDouble(dataInput[2]);

            if (!integerMap.containsKey(name)){
                integerMap.put(name, new ArrayList<>());
                integerMap.get(name).add(price);
                integerMap.get(name).add(quantity);

            }else {

                integerMap.get(name).set(0, price);
                double currentValue = integerMap.get(name).get(1);
                integerMap.get(name).set(1, currentValue + quantity);
            }

            data = scanner.nextLine();
        }

        for (Map.Entry<String, List<Double>> stringListEntry : integerMap.entrySet()) {
            System.out.printf("%s -> %.2f%n", stringListEntry.getKey(), stringListEntry.getValue().get(0) * stringListEntry.getValue().get(1));
        }
    }
}
