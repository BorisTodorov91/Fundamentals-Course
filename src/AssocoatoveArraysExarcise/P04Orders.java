package AssocoatoveArraysExarcise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Double> product  = new LinkedHashMap<>();
        Map<String,Integer> mapProductPrice = new LinkedHashMap<>();
        while ( !input.equals("buy") ) {

            String nameProduct = input.split("\\s+")[0];
            double productPrice = Double.parseDouble(input.split("\\s+")[1]);
            int quantity = Integer.parseInt(input.split("\\s+")[2]);

            product.put(nameProduct, productPrice);

            if (!mapProductPrice.containsKey(nameProduct)){
                mapProductPrice.put(nameProduct, quantity );
            }
            else {
                mapProductPrice.put(nameProduct, mapProductPrice.get(nameProduct) + quantity);
            }

            input = scanner.nextLine();
        }






    }
}
