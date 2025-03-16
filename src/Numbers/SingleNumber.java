package Numbers;

public class SingleNumber {
    public static int findSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR cancels out duplicate numbers
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findSingleNumber(new int[]{4, 1, 2, 1, 2})); // Output: 4
    }
}