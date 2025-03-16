package Numbers;

public class TrailingZeros {
    public static int countTrailingZeros(int n) {
        int count = 0;
        while (n >= 5) {
            n /= 5;
            count += n;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countTrailingZeros(100)); // Output: 24
    }
}
