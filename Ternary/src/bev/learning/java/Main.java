package bev.learning.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String howToSpendTime;

        System.out.println("What day is it?");
        String day = scanner.nextLine();

        /*if (day.toLowerCase().equals("saturday")){
            howToSpendTime = "Relax";
        }else{
            howToSpendTime = "Work";
        }
    */
        //condition ? [value if true] : [value if false]
        howToSpendTime = day.toLowerCase().equals("saturday") ? "Relax" : "Work";
        System.out.printf("%s today %n", howToSpendTime);
        scanner.close();
    }

}
