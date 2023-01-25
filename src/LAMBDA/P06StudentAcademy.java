package LAMBDA;

import java.rmi.MarshalledObject;
import java.util.*;

public class P06StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfStudent = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentRegister = new LinkedHashMap<>();

        for (int i = 0; i < numOfStudent; i++) {
            String student = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            studentRegister.putIfAbsent(student,new ArrayList<>());
            studentRegister.get(student).add(grade);
        }
        for (Map.Entry<String, List<Double>> stringListEntry : studentRegister.entrySet()) {
            
            double middleGrade = 0;
            for (int i = 0; i < stringListEntry.getValue().size(); i++) {
                middleGrade += stringListEntry.getValue().get(i);
            }
            middleGrade = middleGrade / stringListEntry.getValue().size();

            if(middleGrade >= 4.5){
                System.out.printf("%s -> %.2f%n", stringListEntry.getKey(), middleGrade);
            }
        }
    }
}
