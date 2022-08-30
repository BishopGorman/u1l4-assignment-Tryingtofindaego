import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int inputDegree = scanner.nextInt();
        int inputMod = inputDegree % 30;
        int answer = inputMod * 12;
        System.out.print(answer);
        /*
         *  your code goes here
         */

        // closing the scanner object
        scanner.close();
    }
}