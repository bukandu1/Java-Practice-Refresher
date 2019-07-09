package bev.learning.java;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final int ROCK = 0; //static methods
    private static final int PAPER = 1;
    private static final int SCISSORS = 2;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();

        String playerChoice;
        String compChoice;
        Boolean playAgain = true;

        while (playAgain) {


            int playerValue = -1;
            int computerValue = randomGenerator.nextInt(3);


            System.out.println("Please enter rock, paper or scissors: ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (playerChoice.equals("rock")) {
                playerValue = ROCK;
            } else if (playerChoice.equals("paper")) {
                playerValue = PAPER;
            } else if (playerChoice.equals("scissors")) {
                playerValue = SCISSORS;
            } else {
                System.out.println("Not a valid choice");
            }

            //COMPUTER ASSIGNMENT
            if (computerValue == ROCK) {
                compChoice = "rock";
            } else if (computerValue == PAPER) {
                compChoice = "paper";
            } else {
                compChoice = "scissors";
            }

            if (playerValue == computerValue) {
                System.out.println("DRAW");
            } else if ((playerValue - 1 == computerValue) || (playerValue == ROCK && computerValue == SCISSORS)) {
                System.out.println("You win!");
            } else {
                System.out.println("Comp wins");
            }

            System.out.printf("Player chose %s. Comp chose %s. Would you like to play again?: ", playerChoice, compChoice);
            playerChoice = scanner.nextLine().toLowerCase();
            if (playerChoice.equals("no")){
                playAgain = false;
            }
        }
        scanner.close();
    }
}
