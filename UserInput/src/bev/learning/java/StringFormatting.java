package bev.learning.java;

public class StringFormatting {

    public static void main(String[] arg){
        String apples = "apples";
        int appleQuan = 8;
        int applePrice = 100;

        String oranges = "oranges";
        int orangeQuan = 12;
        int orangePrice = 80;

        String column1Heading = "Fruit";
        String column2Heading = "Quan";
        String column3Heading = "Price";

        System.out.printf("%s %s %s%n", column1Heading, column2Heading, column3Heading);
        System.out.printf("%s %d %d cents");




    }

}
