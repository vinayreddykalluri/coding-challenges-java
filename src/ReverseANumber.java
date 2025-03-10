import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Count trailing zeros
        int trailingZeros = 0;
        while (number % 10 == 0 && number != 0) {
            trailingZeros++;
            number /= 10; // Remove trailing zeros for now
        }

        // Reverse the number manually
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }

        // Print reversed number
        System.out.print(reversedNumber);

        // Manually append trailing zeros
        for (int i = 0; i < trailingZeros; i++) {
            System.out.print("0");
        }

        System.out.println();
    }
}