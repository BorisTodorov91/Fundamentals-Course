package TextProcessing;

import java.util.Scanner;

public class P4TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word : banWords) {

            if (text.contains(word)){
                text = text.replace(word, repeateStr("*", word.length()));
            }
        }

        System.out.println(text);
    }

    public  static String repeateStr (String s ,int count ){
        String result = "";

        for (int i = 0; i < count; i++) {
            result += s;
        }
        return  result;
    }
}
