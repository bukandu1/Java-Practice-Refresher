package bev.learning.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner will read user input
        //System.in -
        var scanner = new Scanner(System.in);

        //returns intro string
        System.out.println(Doctor.intro());

        //define var that holds user input
        var userInput = "";

        //run code repeatedly until user quits
        while(!userInput.equalsIgnoreCase("quit")){
            userInput = scanner.nextLine();
            String response = Doctor.response(userInput);
            System.out.println(response);
        }
        scanner.close();
        //nextline: receive input from user

    }
}
