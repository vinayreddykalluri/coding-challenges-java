package Numbers;

import java.util.Arrays;

public class NextGreaterNumber {
    public static int nextGreater(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        int i = digits.length - 2;

        // Step 1: Find first decreasing digit from right
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        // If no smaller digit found, no greater number possible
        if (i < 0) return -1;

        // Step 2: Find just larger digit and swap
        int j = digits.length - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        // Step 3: Reverse digits after the swapped index
        Arrays.sort(digits, i + 1, digits.length);
        return Integer.parseInt(new String(digits));
    }

    public static void main(String[] args) {
        System.out.println(nextGreater(218765)); // Output: 251678
        System.out.println(nextGreater(4321));   // Output: -1
    }
}