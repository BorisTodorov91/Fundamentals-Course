package LAMBDA;

import java.util.*;

public class P09ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // структура от данни Map<String, List<String>>
        Map<String, List<String>> register = new LinkedHashMap<>();

        String command = scanner.nextLine();
        //прочитане на данни докато не получим "Lumpawaroo"
        while (!command.equals("Lumpawaroo")) {

            //ако първия ред от конзолата ни садъжа" | "
            if (command.contains("|")) {
                String[] iputData = command.split(" | ");
                String force_side = iputData[0];
                String force_user = iputData[2];

                //ако нямаме такъв force_side || force_user създаваме мапа с force_side i new ArrayList
                register.putIfAbsent(force_side, new ArrayList<>());

                //ако имаме вече такъв force_user skip
                if(!register.get(force_side).contains(force_user)){

                    // ако нямаме такъв force_user го добавяме в листа
                    register.get(force_side).add(force_user);

                }

            } else if (command.contains("->")) {
                // ако първия ред от конзолата садъжа " -> "
                String[] inputData = command.split(" -> ");
                String force_user = inputData[0];
                String force_side = inputData[1];

                register.entrySet().forEach(stringListEntry -> stringListEntry.getValue().remove(force_user));
                register.putIfAbsent(force_side, new ArrayList<>());
                register.get(force_side).add(force_user);
                System.out.printf("%s joins the %s side!%n", force_user, force_side);

            }

            command = scanner.nextLine();
        }
        // обхождане и отпечатване на мапа
        for (Map.Entry<String, List<String>> stringListEntry : register.entrySet()) {
            if(!stringListEntry.getValue().isEmpty()){
                System.out.printf("Side: %s, Members: %d%n", stringListEntry.getKey(), stringListEntry.getValue().size());
                for (String s : stringListEntry.getValue()) {
                    System.out.printf("! %s%n", s);
                }
            }
        }

    }
}
