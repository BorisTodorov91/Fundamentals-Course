package Mid_Exam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P03SchoolLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> books = Arrays.stream((scanner.nextLine().split("&+"))).collect(Collectors.toList());
        IntStream.range(0, books.size()).forEach(i -> books.set(i, books.get(i).trim()));
        String input;

        while (!"Done".equals(input = scanner.nextLine())) {
            String[] textComand = input.split("\\|");
            switch (textComand[0].trim()) {
                case "Add Book":
                    if (!books.contains(textComand[1].trim())) {
                        books.add(0, textComand[1].trim());
                    }
                    break;
                case "Take Book":
                    books.remove(textComand[1].trim());
                    break;
                case "Swap Books":
                    if (books.contains(textComand[1].trim()) && books.contains(textComand[2].trim())) {
                        Collections.swap(books, books.indexOf(textComand[1].trim()), books.indexOf(textComand[2].trim()));
                    }
                    break;
                case "Insert Book":
                    books.add(textComand[1].trim());
                    break;
                case "Check Book":
                    if (Integer.parseInt(textComand[1].trim()) >= 0 && Integer.parseInt(textComand[1].trim()) < books.size()) {
                        System.out.println(books.get(Integer.parseInt(textComand[1].trim())));
                    }
                    break;
            }
        }
        System.out.println(books.toString().replaceAll("[\\[\\]]", ""));
    }

}
