package Numbers;

public class PalindromeNumber {
    public static boolean isPalindrome(int n) {
        if (n < 0 || (n % 10 == 0 && n != 0)) return false;

        int reversed = 0;
        while (n > reversed) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return n == reversed || n == reversed / 10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));  // Output: true
        System.out.println(isPalindrome(123));  // Output: false
    }
}
