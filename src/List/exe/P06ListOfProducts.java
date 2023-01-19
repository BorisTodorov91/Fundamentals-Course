package List.exe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P06ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int n = Integer.parseInt(scanner.nextLine());
        List<String> data = new ArrayList<>();
        while (n-- < 0){
            String input = scanner.nextLine();

            data.add(input);

        }
        Collections.sort(data);
        for (int i = 1; i < data.size() ; i++) {
            System.out.println(i + "."+ data.get(i));
        }
    }
}
