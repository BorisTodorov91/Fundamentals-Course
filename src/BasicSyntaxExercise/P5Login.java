package BasicSyntaxExercise;

import java.util.Scanner;

public class P5Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String pass = "";

        for (int position = username.length() -1; position >= 0 ; position--) {
            char currentSymbol = username.charAt(position);
            pass += currentSymbol;
        }


        int counterForIncorrentPass = 0;
        String enteredPass = scanner.nextLine();
        while (!enteredPass.equals(pass)){
            counterForIncorrentPass++;
            if (counterForIncorrentPass == 4){
                System.out.printf("User %s blocked!", username);
                break;
            }

            System.out.println("Incorrect password. Try again.");
            enteredPass = scanner.nextLine();
        }

        if(enteredPass.equals(pass)){
            System.out.printf("User %s logged in.", username);
        }

    }
}
