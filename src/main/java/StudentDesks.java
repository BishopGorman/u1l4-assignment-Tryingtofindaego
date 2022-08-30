import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        /*
         *  your code goes here
         */
        int totalStud = a + b + c;
        int deskMod = totalStud % 2;
        int deskDiv = totalStud / 2;
        int totalDesk = deskDiv + deskMod;

        System.out.print(totalDesk);

        // closing the scanner object
        scanner.close();
    }
}