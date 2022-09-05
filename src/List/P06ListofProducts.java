package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P06ListofProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        List<String> product = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String currentProcuct = scanner.nextLine();

            product.add(currentProcuct);
        }
        Collections.sort(product);

        for (int i = 0; i < product.size(); i++) {
            System.out.printf("%d.%s%n", i +1 , product.get(i));
        }
    }
}
