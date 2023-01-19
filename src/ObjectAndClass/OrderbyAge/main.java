package ObjectAndClass.OrderbyAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String comand = scanner.nextLine();

        List<Person> personList = new ArrayList<>();
        while (!comand.equals("End")){
            String[] data = comand.split("\\s+");

            String name = data[0];
            int id = Integer.parseInt(data[1]);
            int age = Integer.parseInt(data[2]);

            Person person = new Person(name, id,age);

            personList.add(person);

            comand = scanner.nextLine();
        }

        //personList.stream().sorted((first, second) -> Integer.compare(first.getAge(), second.getAge()) ).forEach(System.out::println);
       personList.stream().sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);

       // personList.stream().sorted(Comparator.comparing(Person::getName)).filter(person -> person.getAge() > 10).sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);
    }
}
