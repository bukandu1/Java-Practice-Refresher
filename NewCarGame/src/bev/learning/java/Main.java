package bev.learning.java;

import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;
import org.jline.utils.NonBlockingReader;

public class Main {

    private static final String ROAD = "|                             |";
    private static final String CAR_SYMBOL = "V";

    // Control keys
    private static final char LEFT = 'a';
    private static final char STRAIGHT = 's';
    private static final char RIGHT = 'd';
    private static final char ACCELERATE = 'w';
    private static final char BRAKE = 'x';
    private static final char INFO = 'i';
    private static final char QUIT = 'q';

    private static int carPosition = 15;

    public static void main(String[] args) throws Exception {

        Car bats = new Car("The Batmobile");

        Terminal terminal = TerminalBuilder.builder() //Jline library
                .system(true)
                .build();

        terminal.enterRawMode(); //press keys w/o pressing enter

        NonBlockingReader reader = terminal.reader(); //read key w/o pressing enter

        int control;
        boolean playing = true;
        int accelerationFactor = 1;

        // Instructions
        System.out.println("=> without timeout <=");

        System.out.println("Welcome to the Console Grand Prix");
        System.out.println("=================================");
        System.out.println();
        System.out.printf("Control your car by pressing '%s' to go left, and '%s' to go right.%n", LEFT, RIGHT);
        System.out.printf("'%s' will go straight.%n", STRAIGHT);
        System.out.println();
        System.out.println("The faster your car's going, the further down the track it");
        System.out.println("will travel in the chosen direction.  Watch out for the bends!");
        System.out.println();
        System.out.println("Choose the acceleration/deceleration factor by pressing a number key.");
        System.out.printf("You can press a number key anytime before using '%s' or '%s'.%n", ACCELERATE, BRAKE);
        System.out.printf("Pressing '%s' will accelerate by that amount,%n", ACCELERATE);
        System.out.printf("'%s' will brake by that amount.%n", BRAKE);
        System.out.println();
        System.out.println("Your car starts off stationary, so you'll need to accelerate before you can move.");
        System.out.println();
        System.out.printf("Press '%s' to find out your current speed.%n", INFO);
        System.out.println();
        System.out.printf("'%s' will quit.%n", QUIT);

        do {
            control = reader.read();

            if (Character.isDigit(control)) {
                accelerationFactor = control - '0';
            } else { // not a digit
                switch (control) {
                    case LEFT:
                        playing = drive(bats.getSpeed(), -1);
                        break;
                    case STRAIGHT:
                        playing = drive(bats.getSpeed(), 0);
                        break;
                    case RIGHT:
                        playing = drive(bats.getSpeed(), 1);
                        break;
                    case ACCELERATE:
                        bats.accelerate(accelerationFactor);
                        break;
                    case BRAKE:
                        bats.brake(accelerationFactor);
                        break;
                    case INFO:
                        bats.showSpeed();
                        break;
                    case QUIT:
                        playing = false;
                        break;
                } //end switch
            }
        } while (playing);

        reader.close();
        terminal.close();
    }
    private static boolean drive(int speed, int direction) {
        for (int i = 0; i < speed; i++) {
            carPosition = carPosition + direction;
            if (stillOnTrack(carPosition, ROAD)) { //returns true if on track
                drawRoad(carPosition);
            } else {
                System.out.println("YOU FELL OFF!!xxxxx!");
                return false;
            }
        }
        return true;
    }

    private static boolean stillOnTrack(int position, String road){
        return (position < road.length() && road.charAt(position) == ' ') ? true : false;
    }
    private static void drawRoad(int carPosition) {
        // insert car symbol in the "road"
        String roadLine = ROAD.substring(0, carPosition) + CAR_SYMBOL + ROAD.substring(carPosition);
        System.out.println(roadLine);
    }
}//end of Main class

class Car {

    private int speed;
    private String name;

    public Car(String carName) {
        name = carName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void accelerate(int amount) {
        speed += amount;  // Speed = Speed + amount;
        showSpeed();
    }

    public void brake(int speedReduction) {
        speed = (speed < speedReduction) ? 0 : speed - speedReduction;
        showSpeed();
    }

    public void showSpeed() {
        System.out.printf("%s is going %s miles per hour.%n", name, speed * 10);
    }
}
