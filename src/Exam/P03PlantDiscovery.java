package Exam;

import java.util.*;

public class P03PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // data structure Map <String, Intiger>
        Map<String, Integer> register = new LinkedHashMap<>();
        Map<String, List<Double>> ratingRegister = new LinkedHashMap<>();
        // input data n
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("<->");
            String plantName = input[0];
            int rarity = Integer.parseInt(input[1]);

            register.putIfAbsent(plantName, rarity);
        }

        String changeData = scanner.nextLine();
        // change data until "Exhibition"
        while (!changeData.equals("Exhibition")) {
            String[] input = changeData.split(": ");
            String command = input[0];
            String[] plantData = input[1].split(" - ");

            String plant = plantData[0];
            switch (command) {
                case "Rate":
                    double rate = Double.parseDouble(plantData[1]);
                    ratingRegister.putIfAbsent(plant, new ArrayList<>());
                    ratingRegister.get(plant).add(rate);
                    break;
                case "Update":
                    int newRarity = Integer.parseInt(plantData[1]);
                    register.put(plant, newRarity);
                    break;
                case "Reset":
                    ratingRegister.put(plant, new ArrayList<>());
                    break;
            }
            changeData = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");

        //- Arnoldii; Rarity: 4; Rating: 0.00
        for (Map.Entry<String, List<Double>> stringListEntry : ratingRegister.entrySet()) {
            double sum = stringListEntry.getValue().stream().mapToDouble(Double::doubleValue).sum();
            int size = stringListEntry.getValue().size();


        }



    }
}