package jackpot;

import java.util.Scanner;

public class Jackpot {

    public static void main(String[] args) {

        int randomNum = (int)(Math.random() * 11);  // 1 to 10
        int numOfTries = 1;

        System.out.println("----------JACKPOT: GUESS THE WINNING NUMBER----------");
        System.out.println(" ");

        System.out.println("Try to guess the winning number in 5 tries! ");
        System.out.println("Enter a number:  ");
        Scanner scanner = new Scanner(System.in);
        int userInt = scanner.nextInt();

        while (userInt != randomNum && numOfTries < 6){
            ++numOfTries;
            if (userInt > randomNum){
                System.out.println("TOO HIGH");
            }

            else if(userInt < randomNum){
                System.out.println("TOO LOW");
            }
            System.out.println("Try again: ");
            scanner = new Scanner(System.in);
            userInt = scanner.nextInt();
        }

        if (userInt == randomNum) {
            System.out.println("JACKPOT!");

            if (numOfTries == 1) {
                System.out.println("It took you 1 try!");
            } else {
                System.out.println("It took you " + numOfTries + " tries!");
            }
        }

        else{
            System.out.println("You Lose!");
        }

    }
}
