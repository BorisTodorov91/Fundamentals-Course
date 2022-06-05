package BasicSyntaxExercise;

import java.util.Scanner;

public class P1Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //•	0-2 – baby;
        //•	3-13 – child;
        //•	14-19 – teenager;
        //•	20-65 – adult;
        //•	>=66 – elder;

        int num = Integer.parseInt(scanner.nextLine());


        if ( num >= 0 && num <= 2){
            System.out.println("baby");
        }else if ( num >= 3 && num <= 13 ){
            System.out.println("child");
        } else  if (num >= 14 && num <= 19){
            System.out.println("teenager");
        }else if ( num >= 20 && num <= 65 ){
            System.out.println("adult");
        }else if (num>= 66 ){
            System.out.println("elder");
        }
    }
}
