package Mid_Exam;

import java.util.Scanner;

public class P01TheHuntingGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayOfAdvanture = Integer.parseInt(scanner.nextLine());
        int players = Integer.parseInt(scanner.nextLine());
        double groupsEnergy = Double.parseDouble(scanner.nextLine());
        double personWater = Double.parseDouble(scanner.nextLine());
        double personFood = Double.parseDouble(scanner.nextLine());

        double totalWater = (dayOfAdvanture * players * personWater);
        double totalFood = (dayOfAdvanture * players * personFood);



        for (int i = 1; i <= dayOfAdvanture; i++) {
            double wastedEnergy = Double.parseDouble(scanner.nextLine());
            groupsEnergy -= wastedEnergy;


            if (groupsEnergy <= 0) {
                System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", totalFood, totalWater);
                return;
            } if ( i % 2 == 0) {

                groupsEnergy *= 1.05;
                totalWater *= 0.70;
            } if (i % 3 == 0) {
                groupsEnergy *= 1.10;
                totalFood -= totalFood / players;

            }
        }


            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", groupsEnergy);


    }
}
