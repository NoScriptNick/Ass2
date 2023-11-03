import java.lang.Math;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        boolean done = false;
        int roll1;
        int roll2;
        int sum = 0;
        int point = 0;
        boolean needPoint = false;
        boolean playAgain = false;
        String continueYN;

        //game
        while (!playAgain) {
            while (!done) {
                roll1 = (int) (Math.random() * 6) + 1;
                roll2 = (int) (Math.random() * 6) + 1;
                sum = roll1 + roll2;
                System.out.printf("\n%-6s %2d", "Roll 1:", roll1);
                System.out.printf("\n%-6s %2d", "Roll 2:", roll2);
                System.out.printf("\n%-6s %3d", "Sum:", sum);
                if (needPoint) {
                    if (sum == point) {
                        System.out.println("\nYOU WIN YAYYYYYYYY");
                        done = true;
                    } else if (sum == 7) {
                        System.out.println("\nYOU LOSEEEE HAHAHAHAHAH");
                        done = true;
                    }

                } else {
                    if (sum == 2 || sum == 3 || sum == 12) {
                        System.out.println("\nYOU LOSE GAME OVER");
                        done = true;
                    } else if (sum == 7 || sum == 11) {
                        System.out.println("\nYOU WIN YAAAAAAAAAAY");
                        done = true;
                    } else {
                        point = sum;
                        needPoint = true;
                    }
                }
            }
            System.out.println("Would you like to play again? [Y/N]");
            continueYN = scan.nextLine();
            if (continueYN.equalsIgnoreCase("N")) {
                playAgain = true;
            } else {
                done = false;
                needPoint = false;
            }
        }
    }
}