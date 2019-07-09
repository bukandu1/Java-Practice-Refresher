package bev.learning.java;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		//nextint returns num w/in arg range + 2
		Random randomGen = new Random();
		int first = randomGen.nextInt(8) + 2;
		int second = randomGen.nextInt(8) + 2;

		var subtraction = randomGen.nextInt(8) + 2;
		//have to specify type
		//var answer;
		String prompt = " Press ENTER.";

		System.out.println("think of a num. press enter when ready "+ prompt);
		scanner.nextLine();

		System.out.println("Multiply num by " + first + " enter to continue" + prompt);
		scanner.nextLine();

		System.out.println("Multiply num by " + second + " enter to continue" + prompt);
		scanner.nextLine();

		System.out.println("Divide num by " + prompt);
		scanner.nextLine();

		System.out.println("Subtract " + subtraction + prompt);

		int answer = first * second - subtraction;
		System.out.println(answer);
		scanner.nextLine();
		scanner.close();

    }
}
