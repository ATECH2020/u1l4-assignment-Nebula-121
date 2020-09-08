import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        System.out.println("Number of students in classroom 1: ");
        int userInt1 = scanner.nextInt();

        System.out.println("Number of students in classroom 2: ");
        int userInt2 = scanner.nextInt();

        System.out.println("Number of students in  classroom 3: ");
        int userInt3 = scanner.nextInt();


        /*
         *  your code goes here
         */
         System.out.println("Total desks needed for all classrooms: " + ((userInt1/2 + userInt1 % 2) + (userInt2/2 + userInt2 % 2) + (userInt3/2 + userInt3 % 2)));


        // closing the scanner object
        scanner.close();
    }
}