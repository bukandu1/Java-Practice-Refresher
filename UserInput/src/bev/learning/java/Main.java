package bev.learning.java;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*System.out.println("Please enter your name: ");
	    //Instantiate new scanner instance object
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine(); //Nextline always returns a string
        System.out.println("Hello " + name + ". What is your age? ");

        //var age = scanner.nextLine(); //var used since if int used, will return error
        //can also use nextInt, or int age = Integer.parseInt(scanner.nextLine());
        int age = scanner.nextInt();
        System.out.println(name + "is " + age + " years old");

        System.out.printf("%s is %d years old%n", name, age); //converter d - integers
        //s - string converter, n - new line character

____
*/
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        currencyFormat.setMinimumFractionDigits(3);

        String apples = "apples";
        int appleQuan = 8;
        double applePrice = 1.00;

        String oranges = "oranges";
        int orangeQuan = 12;
        double orangePrice = .80;

        String column1Heading = "Fruit";
        String column2Heading = "Quan";
        String column3Heading = "Price";

        //Align to the left with negative sign
        System.out.printf("%-12s %8s %6s%n", column1Heading, column2Heading, column3Heading);
        System.out.printf("%-12s %8d %6s cents", apples, appleQuan,
                currencyFormat.format(applePrice));


    //--------------------------------------

        System.out.printf("Pi is %f %n", Math.PI);
        System.out.printf("Pi is %.3f %n", Math.PI); //3 places decimals after
        System.out.printf("Pi is %.0f %n", Math.PI);
        System.out.printf("Pi is %.12f %n", Math.PI);
        System.out.printf("Pi is %3f %n", Math.PI);
        System.out.printf("Pi is %.99f %n%n------------%n", Math.PI); //doesnt make more precise, just more zeros
//--------------------------------------
//Built-In Types
        //byte will be used with jpeg, bit map, and pics
        System.out.printf("byte min: %s, max = %s%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        //short can save memory!
        System.out.printf("Short miL %s, max = %s%n", Short.MIN_VALUE, Short.MAX_VALUE);
        //long if dealing with very large values

        BigDecimal z = new BigDecimal("123.456789012345544023832920932093");
        System.out.printf("z is %.99f %n", z);

        //--------------------------------------
//Built-In Types
        BigDecimal b = BigDecimal.valueOf(0.1); //valueof is an in-built method that translates a long value to a
        //bigdec value; valueOf(long value)
        BigDecimal w = BigDecimal.valueOf(7);
        BigDecimal y = b.multiply(w); //bigdec x big dec






    }






}



