package Exam;

import java.util.Scanner;

public class P01PasswordValidator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String comand = scanner.nextLine();
        while (!comand.equals("Complete")) {
            String[] comandArray = comand.split(" ");
            String firstComomand = comandArray[0];
            switch (firstComomand) {
                case "Make":
                    String secondComand = comandArray[1];
                    int indexToMakeUpOrLow = Integer.parseInt(comandArray[2]);
                    String firstSubstring = password.substring(0, indexToMakeUpOrLow);
                    String secondSubstring = password.substring(indexToMakeUpOrLow + 1);
                    String letter = null;
                    if (secondComand.equals("Upper")) {
                        letter = password.substring(indexToMakeUpOrLow, indexToMakeUpOrLow + 1).toUpperCase();
                    } else if (secondComand.equals("Lower")) {
                        letter = password.substring(indexToMakeUpOrLow, indexToMakeUpOrLow + 1).toLowerCase();
                    }
                    password = firstSubstring + letter + secondSubstring;
                    System.out.println(password);
                    break;
                case "Insert":
                    int indexToInsert = Integer.parseInt(comandArray[1]);
                    String symbol = comandArray[2];
                    String firstSub = password.substring(0, indexToInsert);
                    String secondSub = password.substring(indexToInsert);
                    password = firstSub + symbol + secondSub;
                    System.out.println(password);
                    break;
                case "Replace":
                    char[] charToReplace = comandArray[1].toCharArray();
                    int valueChar = charToReplace[0];
                    int value = Integer.parseInt(comandArray[2]);
                    valueChar += value;
                    char newChar = (char) valueChar;
                    if (password.contains(comandArray[1])) {
                        password = password.replace(charToReplace[0], newChar);
                        System.out.println(password);
                    }
                    break;
                case "Validation":
                    if (password.length() < 8) {
                        System.out.println("Password must be at least 8 characters long!");
                    }
                    char[] validPass = password.toCharArray();
                    int countOfDigit = 0;
                    int countOfUpper = 0;
                    int countOfLower = 0;
                    for (int i = 0; i < password.length(); i++) {
                        if (!(Character.isLetterOrDigit(validPass[i]) || validPass[i] == '_')) {
                            System.out.println("Password must consist only of letters, digits and _!");
                        }
                        if (validPass[i] >= 65 && validPass[i] <= 90) {
                            countOfUpper++;
                        }
                        if (validPass[i] >= 97 && validPass[i] <= 122) {
                            countOfLower++;
                        }
                        if (Character.isDigit(validPass[i])) {
                            countOfDigit++;
                        }
                    }
                    if (countOfUpper == 0) {
                        System.out.println("Password must consist at least one uppercase letter!");
                    }
                    if (countOfLower == 0) {
                        System.out.println("Password must consist at least one lowercase letter!");
                    }
                    if (countOfDigit == 0) {
                        System.out.println("Password must consist at least one digit!");
                    }
                    break;
            }
            comand = scanner.nextLine();
        }
    }
}
