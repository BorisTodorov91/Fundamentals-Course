package Mid_Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Memorygame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        int count = 0;
        while (!input.equals("end")){

            if (elements.isEmpty()){
                System.out.printf("You have won in %d turns!",count);
                ;
            }
            count++;
            int firstIndex = Integer.parseInt(input.split(" ")[0]);
            int secondIndex = Integer.parseInt(input.split(" ")[1]);

            if(isValidIndex(firstIndex, secondIndex, elements.size())){
                String firstElement = elements.get(firstIndex);
                String secondElement = elements.get(secondIndex);

                if(firstElement.equals(secondElement)){
                    elements.remove(firstElement);
                    elements.remove(secondElement);
                    System.out.printf("Congrats! You have found matching elements - %s!%n", firstElement);
                }
                else {
                    System.out.println("Try again!");
                }
            }else {
                int middleIndex = elements.size() / 2;
                String elementForAdd= "-"+ count +"a";
                elements.add(middleIndex,elementForAdd);
                elements.add(middleIndex + 1, elementForAdd);

                System.out.println("Invalid input! Adding additional elements to the board");
            }

            input = scanner.nextLine();

        }
       if (!elements.isEmpty()){
           System.out.println("Sorry you lose :(");
           for (String element : elements) {
               System.out.print(element +" ");
           }

       }
    }

    private static boolean isValidIndex(int firstIndex, int secondIndex, int size) {

    return  firstIndex >= 0 && firstIndex <= size - 1 && secondIndex >= 0 && secondIndex <= size -1;
    }


}
