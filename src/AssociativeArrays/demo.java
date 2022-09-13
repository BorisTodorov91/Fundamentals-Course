package AssociativeArrays;

import java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String ,Integer> map = new LinkedHashMap<>();

        map.put("Boris",3255655);
        map.put("Peso",23333);
        map.put("Atanas",35655);

        map.remove("Peso");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }


    }
}
