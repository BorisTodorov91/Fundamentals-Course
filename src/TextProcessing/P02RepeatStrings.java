package TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strArr = scanner.nextLine().split(" ");
        List<String> repeateList = new ArrayList<>();

        for (int i = 0; i < strArr.length; i++) {
            String currentWord = strArr[i];
            int len = currentWord.length();
            String repeateWord = repeateStr(currentWord , len);

            repeateList.add(repeateWord);
        }

        System.out.println(String.join("", repeateList));
    }

    public static String repeateStr (String s , int count){
        String result = "";

        for (int i = 0; i < count; i++) {
            result += s;
        }
        return  result;
    }
}
