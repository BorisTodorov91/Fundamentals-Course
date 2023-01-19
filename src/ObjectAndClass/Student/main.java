package ObjectAndClass.Student;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numOfStudent = Integer.parseInt(scanner.nextLine());
       List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < numOfStudent; i++) {

            String[] commnad = scanner.nextLine().split("\\s+");
            String name = commnad[0];
            String lastName = commnad[1];
            double grade = Double.parseDouble(commnad[2]);

            Student student = new Student(name,lastName,grade);

           studentList.add(student);
        }
        studentList.stream().sorted((first, second) -> Double.compare(second.getGrade(), first.getGrade()))
                .forEach(System.out::println);

    }
}
