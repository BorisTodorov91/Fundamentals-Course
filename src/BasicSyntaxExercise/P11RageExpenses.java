package BasicSyntaxExercise;

import java.util.Scanner;

public class P11RageExpenses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. вход •	On the first input line - lost games count – integer in the range [0, 1000].
        //•	On the second line – headset price - the floating-point number in the range [0, 1000].
        //•	On the third line – mouse price - the floating-point number in the range [0, 1000].
        //•	On the fourth line – keyboard price - the floating-point number in the range [0, 1000].
        //•	On the fifth line – display price - the floating-point number in the range [0, 1000].

        int lostGame = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetCount = lostGame / 2;
        int mouseCount = lostGame / 3;
        int keyboardCount = lostGame / 6;
        int displayCount = lostGame / 12;

        double totalSum = (headsetCount * headsetPrice) + (mouseCount * mousePrice)+
                (keyboardCount * keyboardPrice) + (displayCount * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", totalSum);
    }
}
