import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();


        /*
         *  your code goes here
         */
        int hoursToSec1 = hours1 * 3600;
        int mintoSec1 = minutes1 * 60;
        int sum1 = hoursToSec1 + mintoSec1 + seconds1;

        int hoursToSec2 = hours2 * 3600;
        int mintoSec2 = minutes2 * 60;
        int sum2 = hoursToSec2 + mintoSec2 + seconds2;

        int total = sum2 - sum1;

        System.out.print(total);
        // closing the scanner object
        scanner.close();
    }
}