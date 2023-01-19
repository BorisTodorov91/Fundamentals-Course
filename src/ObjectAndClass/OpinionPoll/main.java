package ObjectAndClass.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfCommands = Integer.parseInt(scanner.nextLine());
        List<Person> listOfPerson = new ArrayList<>();
        for (int i = 0; i < numOfCommands; i++) {

            String[] command = scanner.nextLine().split("\\s+");
            String name = command[0];
            int age = Integer.parseInt(command[1]);

            Person person = new Person(name,age);
            listOfPerson.add(person);
        }

        listOfPerson.stream().filter(person -> person.getAge() > 30).forEach(System.out::println);
    }
}
