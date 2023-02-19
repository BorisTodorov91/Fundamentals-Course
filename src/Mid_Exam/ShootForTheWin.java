package Mid_Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> integerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int count = 0;
        boolean flag = true;
        String command = scanner.nextLine();
        while (!command.equals("End")){
            int index = Integer.parseInt(command.split(" ")[0]);
            if(isValidIndex(index, integerList.size())){
                int item = integerList.get(index);
                count++;
                integerList.set(index, -1);

                for (int i = 0; i < integerList.size(); i++) {

                    int currentIndex = integerList.get(i);
                    int currentValue = integerList.get(i);
                    if (currentIndex == -1){
                        continue;
                    }
                    if ( currentValue <= item){
                        int indexOf = integerList.indexOf(currentValue);
                        integerList.set(indexOf, currentValue + item);
                    }else {
                        int indexOf = integerList.indexOf(currentValue);
                        integerList.set(indexOf, currentValue - item);
                    }
                }
            }


            command = scanner.nextLine();
        }

        System.out.printf("Shot targets: %d -> ", count);
        for (Integer integer : integerList) {
            System.out.print(integer+" ");
        }
     }

    private static boolean isValidIndex(int index, int size) {
        return index >= 0 && index <= size -1;
    }
}
