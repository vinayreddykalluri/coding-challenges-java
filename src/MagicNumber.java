import java.util.HashSet;

public class MagicNumber {
    public static boolean isMagic(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sumOfDigits(n);
        }

        return n == 1;
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += (num % 10) * (num % 10);
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isMagic(19)); // Output: true
        System.out.println(isMagic(28)); // Output: false
    }
}