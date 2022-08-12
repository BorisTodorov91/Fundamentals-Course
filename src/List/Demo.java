package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> nameList = new ArrayList<>();

        nameList.add("Boris");
        nameList.add("asd");
        nameList.add("asdddd");

        for ( String name: nameList) {
            System.out.println(name);
        }
        //System.out.println(nameList);


        // четене на лист от н елемента
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> numberInputList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int currrentNum = Integer.parseInt(scanner.nextLine());
            numberInputList.add(currrentNum);
        }
        //принтиране
        System.out.println(numberInputList);
        for (int h:
                numberInputList) {
            System.out.println(h);

        }



        //четене на лист от зададени стрингове разделени с space  и парсване от стринг към инт
        String input = scanner.nextLine();
        List<String> listElement = Arrays.stream(input.split(" ")).collect(Collectors.toList());

        List<Integer> intElement = new ArrayList<>();

        for (int i = 0; i < listElement.size(); i++) {
            intElement.add(Integer.parseInt(listElement.get(i)));
        }

        //най-бързия начин на четене без прехвъряне в друг лист
        List<Integer> newList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

    }
}
