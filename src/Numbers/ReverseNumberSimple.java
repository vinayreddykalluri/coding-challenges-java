package Numbers;

import java.util.Scanner;

public class ReverseNumberSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10; // Extract last digit
            reversed = reversed * 10 + digit; // Build reversed number
            number /= 10; // Remove last digit
        }

        System.out.println(reversed);
    }
}