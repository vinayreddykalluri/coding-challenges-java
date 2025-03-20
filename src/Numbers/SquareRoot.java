package Numbers;

public class SquareRoot {
    public static int sqrt(int x) {
        if (x == 0 || x == 1) return x;

        int left = 1, right = x, result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) { // Prevent overflow (mid * mid <= x)
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(8));  // Output: 2
        System.out.println(sqrt(16)); // Output: 4
    }
}