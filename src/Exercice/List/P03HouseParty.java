package Exercice.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // List<String
        List<String> person = new ArrayList<>();
        // input n
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] command = scanner.nextLine().split("\\s+");
            String name = command[0];

            switch (command.length){
                case 3:
                    // "{name} is going!"
                    if (!person.contains(name)){
                        // If you receive the first type of input,
                        // you have to add the person
                        // if he/she is not on the list.
                        person.add(name);
                    }else {
                        // If he/she is in the list,
                        // print on the console: "{name} is already in the list!".
                        System.out.printf("%s is already in the list!%n", name);
                    }
                    break;
                case 4:
                    //"{name} is not going!"
                        if (person.contains(name)){
                            //If you receive the second type of input,
                            // you must remove the person if he/she is on the list.
                            person.remove(name);
                        }else {
                            // If not, print: "{name} is not in the list!".
                            System.out.printf("%s is not in the list!%n", name);
                        }
                    break;
            }
        }
        //print all data from list
        for (String s : person) {
            System.out.printf("%s%n", s);
        }
    }
}
