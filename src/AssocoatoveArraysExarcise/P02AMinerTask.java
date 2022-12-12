package AssocoatoveArraysExarcise;

import java.util.*;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> map = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!"stop".equals(input)) {

            int currentNum = Integer.parseInt(scanner.nextLine());

            map.putIfAbsent(input, 0);
            int currentValue = map.get(input);
            map.put(input, currentValue + currentNum);

            input = scanner.nextLine();
        }

        map.forEach((kay, value) -> System.out.println(kay + " -> " + value));

    }
}
