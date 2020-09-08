import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hHand = scanner.nextInt();

        /*
         *  your code goes here
         */
        int hours = hHand / 30;
        int degPast = hours * 30;
        int mPast = hHand - degPast;
        int minHandDeg = (30 - mPast) * 6;
        System.out.print(minHandDeg);
        // closing the scanner object
        scanner.close();
    }
}