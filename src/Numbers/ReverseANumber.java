package Numbers;

import java.util.Scanner;
public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 0) {
            System.out.println("0");
            return;
        }
        // Directly print trailing zeros first
        int trailingZeros = 0;
        while (number % 10 == 0) {
            trailingZeros++;
            number /= 10;
        }
        while (trailingZeros -- > 0) System.out.print("0");
        // Reverse number and print digits directly (avoiding extra calculations)
        while (number > 0) {
            System.out.print(number % 10);
            number /= 10;
        }
        System.out.println(); // Move to the next line
    }
}