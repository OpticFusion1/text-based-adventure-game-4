package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner allScanner = new Scanner(System.in);
        boolean gameLoop = true;

        do {

            System.out.println("You are walking through the woods and run into a bear, what should you do? (Enter a number to select an option)");
            System.out.println("1 - option 1");
            System.out.println("2 - option 2");
            System.out.println("3 - option 3");
            System.out.println("4 - option 4");

            int userInput = allScanner.nextInt();

            if (userInput == 1) {
                System.out.println("This is what happens for 1");
                System.out.println("Play again Y/N?");

                char playAgainChoice = allScanner.next().charAt(0);

                    if (playAgainChoice == 'n' || playAgainChoice == 'N') {
                        break;
                        }
            }

            else if (userInput == 2) {
                System.out.println("This is what happens for 2");
                System.out.println("Play again Y/N?");

                char playAgainChoice = allScanner.next().charAt(0);

                    if (playAgainChoice == 'n' || playAgainChoice == 'N') {
                        break;
                        }


            } else if (userInput == 3) {
                System.out.println("This is what happens for 3");
                System.out.println("Play again Y/N?");

                char playAgainChoice = allScanner.next().charAt(0);

                    if (playAgainChoice == 'n' || playAgainChoice == 'N') {
                        break;
                }



            } else if (userInput == 4) {
                System.out.println("This is what happens for 4");
                System.out.println("Play again Y/N?");

                char playAgainChoice = allScanner.next().charAt(0);

                if (playAgainChoice == 'n' || playAgainChoice == 'N') {
                    break;
                }



            } else {
                    System.out.println("Invalid! Please input a number 1 - 4");
                    gameLoop = false;
                }


        } while (gameLoop = true);
    }
}
