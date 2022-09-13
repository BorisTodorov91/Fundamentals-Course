package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scanner.nextLine()
                .split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("course start")){
            String [] tokens  = input.split( ":");
            String comand = tokens[0];
            String lesseonTitle = tokens[1];
            switch (comand){
                case "Add":
                    if (!schedule.contains(lesseonTitle)){
                        schedule.add(lesseonTitle);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(tokens[2]);
                    if (!schedule.contains(lesseonTitle)){
                        schedule.add(index,lesseonTitle);
                    }
                    break;
                case "Remove":
                    if (schedule.contains(lesseonTitle)){
                        schedule.remove(lesseonTitle);
                    }
                    break;
                case "Swap":
                    String lessonTitle2 = tokens[2];
                    if(schedule.contains(lesseonTitle) && schedule.contains(lessonTitle2)){
                        int index1 = schedule.indexOf(lesseonTitle);
                        int index2 = schedule.indexOf(lessonTitle2);
                    }
                    break;
                case "Exercise":

                    String exercise = lesseonTitle + "-Exercise";
                    int indexLesson = schedule.indexOf(lesseonTitle);
                    if (schedule.contains(lesseonTitle)){
                        // ма ли упражнение
                        if(indexLesson == schedule.size() -1 ){
                            schedule.add(indexLesson +1 , exercise);

                        }  else if (!schedule.get(indexLesson +1 ).equals(exercise)){
                            schedule.add(indexLesson + 1 , exercise);
                        }
                    }else {
                        schedule.add(lesseonTitle);
                        schedule.add(exercise);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        printList(schedule);
    }

    private static void printList(List<String> schedule) {
        int count= 1;

        for (String element:
             schedule) {
            System.out.println(count + "." + element);
            count++;
        }

    }
}
