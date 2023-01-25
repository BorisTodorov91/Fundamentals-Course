package LAMBDA;

import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // структура от данни Map<String, List<String> = LinkedHashMap
        Map<String, List<String>> register = new LinkedHashMap<>();
        //прочитане на даани докато не получиме комантада wile("end")
        String command = scanner.nextLine();
        while (!command.equals("End")){
            // разделяме входните данни с " -> "
            String[] input = command.split(" -> ");
            String company = input[0];
            String employee = input[1];
            // проверяваме мапа ако нямаме такъв го саздаваме
            register.putIfAbsent(company, new ArrayList<>());
            if (!register.get(company).contains(employee)){
                register.get(company).add(employee);
            }
            command = scanner.nextLine();
        }

        // обхождане и печатане на мапа
        for (Map.Entry<String, List<String>> stringListEntry : register.entrySet()) {
            System.out.printf("%s%n", stringListEntry.getKey());
            stringListEntry.getValue().forEach(f-> System.out.printf("-- %s%n", f));
        }

    }
}
