package OOP.Students;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


       Map<Town,  List<Person> > personMap = new LinkedHashMap<>();
        Town town1 = null;
        while (!input.equals("end")){
            String firstname = input.split("\\s+")[0];
            String lastName = input.split("\\s+")[1];
            String age = input.split("\\s+")[2];
            String town = input.split("\\s+")[3];

            Person person = new Person(firstname,lastName,age);
            town1 = new Town(town, person);
            personMap.putIfAbsent(town1, new ArrayList<>());
            personMap.get(town1).add(person);

            input = scanner.nextLine();
        }
        String city = scanner.nextLine();

       personMap.entrySet().stream().filter(e-> e.getKey().getName().equals(city)).forEach(System.out::println);

    }
}
