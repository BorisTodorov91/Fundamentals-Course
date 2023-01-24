package LAMBDA;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // прочитане на входните данни инт н
        int numOfCommand = Integer.parseInt(scanner.nextLine());

        // декларираме МАП в който да пазиме името и регисрациония номер LinkedHashMap(String, String);
        Map<String,String> register = new LinkedHashMap<>();

        for (int i = 0; i < numOfCommand; i++) {

            // разделяме първия ред от конзолата и ги пазиме в масив
            String[] command = scanner.nextLine().split("\\s+");
            String typeRegister = command[0];
            String name = command[1];

            // спрямо данните от масива на индекс 0 ще имаме 2 опции
            switch (command.length){
                case 3:
                    // "register" register John CS1234JS
                    //  1 човек може да има само една регистрация
                    if (register.containsKey(name)){
                        System.out.printf("ERROR: already registered with plate number %s%n", register.get(name));
                    }else {
                        String registerCar = command[2];

                        register.put(name,registerCar);
                        System.out.printf("%s registered %s successfully%n", name, register.get(name));
                    }
                    break;
                case 2:
                    // "unregister" unregister Andy
                    String registerCar = command[1];
                    if (!register.containsKey(name)){
                        System.out.printf("ERROR: user %s not found%n", name);
                    }
                    else {
                        register.remove(name);
                        System.out.printf("%s unregistered successfully%n", name);
                    }
                    break;
            }

        }
        //обхождаме целия МАП и принтираме стойностите
        for (Map.Entry<String, String> stringStringEntry : register.entrySet()) {
            System.out.printf("%s => %s%n", stringStringEntry.getKey(),stringStringEntry.getValue());
        }
    }
}
