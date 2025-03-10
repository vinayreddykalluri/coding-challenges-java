import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Check if number is zero
        if (number == 0) {
            System.out.println("0");
            return;
        }

        // Count trailing zeros
        int trailingZeros = 0;
        while (number % 10 == 0) {
            trailingZeros++;
            number /= 10; // Remove trailing zeros temporarily
        }

        // Reverse the number manually without using any library
        int reversedNumber = 0;
        while (number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }

        // Print reversed number manually without converting to String
        while (reversedNumber > 0) {
            System.out.print(reversedNumber % 10);
            reversedNumber /= 10;
        }

        // Print trailing zeros manually
        for (int i = 0; i < trailingZeros; i++) {
            System.out.print("0");
        }

        System.out.println(); // Move to next line
    }
}