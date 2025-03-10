import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Handle special case: If input is 0
        if (number == 0) {
            System.out.println("0");
            return;
        }

        // Track and remove trailing zeros
        while (number % 10 == 0) {
            System.out.print("0");  // Print trailing zeros first
            number /= 10;
        }

        // Reverse and print manually, digit by digit
        while (number > 0) {
            System.out.print(number % 10); // Print last digit first
            number /= 10;
        }

        System.out.println(); // Move to next line
    }
}