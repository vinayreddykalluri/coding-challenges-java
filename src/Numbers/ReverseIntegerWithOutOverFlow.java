package Numbers;

public class ReverseIntegerWithOutOverFlow {
        public static int reverse(int n) {
            int reversed = 0;
            while (n != 0) {
                int digit = n % 10;
                if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) {
                    return 0; // Overflow detected
                }
                reversed = reversed * 10 + digit;
                n /= 10;
            }
            return reversed;
        }

        public static void main(String[] args) {
            System.out.println(reverse(1534236469)); // Output: 0
            System.out.println(reverse(-123)); // Output: -321
        }
    }

