package Numbers;

import java.util.*;

public class SmallestBinaryMultiple {
    public static String findSmallestMultiple(int n) {
        Queue<String> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add("1");

        while (!queue.isEmpty()) {
            String numStr = queue.poll();
            int num = Integer.parseInt(numStr);

            if (num % n == 0) return numStr;

            int remainder = num % n;
            if (!visited.contains(remainder)) {
                visited.add(remainder);
                queue.add(numStr + "0");
                queue.add(numStr + "1");
            }
        }
        return "-1";
    }

    public static void main(String[] args) {
        System.out.println(findSmallestMultiple(3)); // Output: 111
        System.out.println(findSmallestMultiple(7)); // Output: 1001
    }
}