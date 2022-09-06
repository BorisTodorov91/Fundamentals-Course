package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine()
                .split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("course start")){
            String [] tokens  = input.split( ":");
            String comand = tokens[0];
            String lesseonTitle = tokens[1];
            switch (comand){
                case "Add":
                    break;
                case "Insert":
                    break;
                case "Remove":
                    break;
                case "Swap":
                    break;
                case "Exercise":
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
