package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList()); // пълниме листа с данни


        String comands = scanner.nextLine(); // тук държиме  командите

        while (!comands.equals("3:1"))// докато нашата команда е различна от 3:1 изпълняваме следния код {
        {

            if (comands.contains("merge")) {
                //•	merge {startIndex} {endIndex}
                //взимаме стартовия и крайния индекс
                int startIndex = Integer.parseInt(comands.split(" ")[1]); // comands = "merge 1 3".split(" ") -> ["merge", "1","3"]
                int endIndex = Integer.parseInt(comands.split(" ")[2]);

                // проверка за стартовия индекс
                if (startIndex < 0) {
                    startIndex = 0; // стартовия индекс не може да бъде по-малак от 0
                }
                // проверка за крайния индекс
                if (endIndex > names.size() - 1) {
                    endIndex = names.size() - 1;// крайният индекс не може да бъде по-голям от последният индекс в листа
                }
                //правиме валидация на стартовия и крайния индекс
                boolean isValidIndexes = startIndex <= names.size() - 1 && endIndex >= 0 && startIndex < endIndex;

                //проверяваме дали имаме валидни индекси
                if (isValidIndexes) {

                    //взимаме елементите от текущите индекси и ги запазваме в променливата String resultMerge = ""
                    String resultMerge = "";
                    for (int index = startIndex; index <= endIndex; index++) {
                        String currentText = names.get(index);
                        resultMerge += currentText;
                    }
                    // премахваме елементите от стартовия до крайния индекс
                    for (int index = startIndex; index <= endIndex; index++) {
                        names.remove(startIndex);
                    }
                    // поставяме резултата от променливата String resultMerge = "" на стартовия индекс в нашия лист
                    names.add(startIndex, resultMerge);
                }


            } else if (comands.contains("divide")) {
                //•	divide {index} {partitions}
                // взимаме индекса и номера на който трябва да делиме елемента от нашия лист
                int index = Integer.parseInt(comands.split(" ")[1]);
                int partsForDevide = Integer.parseInt(comands.split(" ")[2]);

                // взимаме елемента от нашия лист на индекса  който трябва да делиме
                String elementForDevide = names.get(index);
                names.remove(index);

                // колко емлемента ще има всяка една част
                int partSize = elementForDevide.length() / partsForDevide;
                int beginIndexOfText = 0;
                for (int part = 1; part < partsForDevide; part++) {
                    names.add(index, elementForDevide.substring(beginIndexOfText, beginIndexOfText + partSize));

                    index++;

                    beginIndexOfText += partSize;

                }
                //добавяме останалите символи къмпоследата част
                names.add(index, elementForDevide.substring(beginIndexOfText)); // не задаваме краен индекс самият медот  взима до последния
            }

            comands = scanner.nextLine(); // взимаме нова команда
        }

        for (String text :
                names) {
            System.out.print(text + " ");
        }
    }
}
