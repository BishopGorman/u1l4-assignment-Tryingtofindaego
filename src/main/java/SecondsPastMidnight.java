import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        int sec = scanner.nextInt();

        //Your code goes here
        int min = sec/60;
        int hour = min/60;
        System.out.print(hour + " " + min);

        // closing the scanner object
        scanner.close();
    }
}