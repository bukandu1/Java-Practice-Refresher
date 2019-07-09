package bev.learning.java;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Get the line from the console & save to variable
        String userChoice = "";

        while (userChoice.toLowerCase() != "q") {
            System.out.println("Please choose an option:");
            System.out.println("1 - Cappicinno");
            System.out.println("2 - Mocha");
            System.out.println("3 - Macchiato");
            System.out.println("q - quit");

            userChoice = scanner.nextLine();

            //Print variable
            System.out.println("You chose: " + userChoice);

            switch(userChoice){
                case "1"://Testing for the first string
                    System.out.println("Making a cap");
                    System.out.println("Milk");
                    System.out.println("Make expresso");
                    System.out.println("Milk to expresso");
                    break; //jumps out of the switch and stops code (can also use with for-loops)
                case "2":
                    System.out.println("Making a latte");
                    System.out.println("Milk. Done");
                    break;
                case "3":
                case "4":
                    System.out.println("Making a cap");
                    System.out.println("Milk");
                    break;
                default:
                    System.out.println("Returning coins.");
                    continue; //continues out of loop
        }

        System.out.println("Dispensed coffee. Have a nice day!");

        }
        scanner.close();
    }
}
