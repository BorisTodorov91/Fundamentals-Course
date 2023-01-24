package LAMBDA;

import java.util.*;

public class P05Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String , List<String>> register = new LinkedHashMap<>();
        while (!command.equals("end")){
            String course = command.split(" : ")[0];
            String student = command.split(" : ")[1];

            if(!register.containsKey(course)){
                register.put(course, new ArrayList<>());
                register.get(course).add(student);
            }else {
                register.get(course).add(student);
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> stringListEntry : register.entrySet()) {
            System.out.printf("%s: %d%n", stringListEntry.getKey(), stringListEntry.getValue().size());
            for (String s : stringListEntry.getValue()) {
                System.out.printf("-- %s%n", s);
            }
        }

    }
}
