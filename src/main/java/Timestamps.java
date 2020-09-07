import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        System.out.println("First hour: ");
        int hours1 = scanner.nextInt();

        System.out.println("First minute: ");
        int minutes1 = scanner.nextInt();

        System.out.println("First second: ");
        int seconds1 = scanner.nextInt();

        System.out.println("Second hour: ");
        int hours2 = scanner.nextInt();

        System.out.println("Second minute: ");
        int minutes2 = scanner.nextInt();
        
        System.out.println("Second second: ");
        int seconds2 = scanner.nextInt();


        /*
         *  your code goes here
         */
        System.out.println("Seconds in between: " + ((hours2 * 3600 + minutes2 * 60 + seconds2) - (hours1 * 3600 + minutes1 * 60 + seconds1)));

        // closing the scanner object
        scanner.close();
    }
}   