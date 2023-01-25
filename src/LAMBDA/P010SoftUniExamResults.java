package LAMBDA;

import java.util.*;

public class P010SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Map<String, List<Integer>>> register = new LinkedHashMap<>();
        Map<String,List<String>> count = new LinkedHashMap<>();
        String command = scanner.nextLine();
        // докато не получим командата "exam finished" прочитаме входните данни
        while (!command.equals("exam finished")){
            // разделяме входните данни с "-"
            String[] input = command.split("-");
            String name = input[0];
            String lanquage = input[1];

            switch (input.length){
                case 3:
                    // запазваме данните в мапа
                    int grade = Integer.parseInt(input[2]);
                    register.putIfAbsent(name, new LinkedHashMap<>());
                    register.get(name).putIfAbsent(lanquage, new ArrayList<>());
                    register.get(name).get(lanquage).add(grade);
                    count.putIfAbsent(lanquage, new ArrayList<>());
                    count.get(lanquage).add(name);
                    int currentGrade = register.get(name).get(lanquage).get(0);

                    if ( grade < currentGrade){
                        register.get(name).get(lanquage).remove((Object)grade);
                    }
                    break;
                case 2:
                    // ако попаднем на студент с "banned" го премахваме от мапа
                    if(register.containsKey(name)){
                        register.remove(name);
                    }
                    break;
            }

        command = scanner.nextLine();
        }
        // обхождаме и отпечатваме мапа

        System.out.println("Results:");
        for (Map.Entry<String, Map<String, List<Integer>>> stringMapEntry : register.entrySet()) {
            for (Map.Entry<String, List<Integer>> stringListEntry : stringMapEntry.getValue().entrySet()) {
                System.out.print(stringMapEntry.getKey()+" | ");
                stringListEntry.getValue().stream().map(Integer::intValue).forEach(System.out::println);
            }
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, List<String>> stringListEntry : count.entrySet()) {
            System.out.printf("%s - %d%n", stringListEntry.getKey(), stringListEntry.getValue().size());
        }

    }
}
