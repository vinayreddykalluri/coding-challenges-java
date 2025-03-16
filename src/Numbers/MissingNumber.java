package Numbers;

public class MissingNumber {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1;
        int sum = n * (n + 1) / 2;
        for (int num : nums) sum -= num;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[]{1, 2, 4, 5})); // Output: 3
    }
}
