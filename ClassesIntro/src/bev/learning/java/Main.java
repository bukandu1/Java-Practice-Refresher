package bev.learning.java;

public class Main {

    public static void main(String[] args) {

        //declare new variable of Car class
        Car myCar = new Car("bqt"); //need to tell Java a new instance
        Car blueCar = new Car("blue"); //or objects

        myCar.accelerate(20);
        myCar.accelerate(30);
        myCar.accelerate(31);
        myCar.accelerate(20);
        myCar.accelerate(10);
        myCar.accelerate(10);
        blueCar.accelerate(10);
        blueCar.brake(100);

        //for (declare and initialize variable; condition; counter)
        for (int i = 0; i < 14; i += 2){
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.printf("%n");
        }
    }
}

class Car {

    private int speed = 0;
    //cannot use var for a class instance
    //declared "field" to zero
    private String carName;

    //constructor can also declare class instance variables
    public Car(String name){
        carName = name;
    }

    public void accelerate(int newSpeed) //public - used in code that isnt a part of class
    { //private - not available outside of the class
        speed += newSpeed;
        showSpeed();
    }

    public void brake(int newSpeed)
    {
        speed -= newSpeed;
        if (speed < 0){
            speed = 0;
        showSpeed();
        }
    }

    private void showSpeed(){ //cannot show speed outside Car class
        System.out.printf("%s is going %d mph %n", carName,speed);

    }
}

