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
        int classA = ((a % 2) + a) / 2;
        int classB = ((b % 2) + b) / 2;
        int classC = ((c % 2) + c) / 2;

        int total = classA + classB + classC;

        System.out.print(total);

        // closing the scanner object
        scanner.close();
    }
}