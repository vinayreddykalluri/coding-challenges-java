import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reversedNumber = 0;
        boolean isTrailingZero = (number % 10 == 0); // Check if number has trailing zeros

        // Reverse number manually
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Print manually to retain trailing zeros
        if (isTrailingZero) {
            System.out.print(reversedNumber);
            System.out.print("0"); // Manually add a trailing zero
        } else {
            System.out.println(reversedNumber);
        }
    }
}