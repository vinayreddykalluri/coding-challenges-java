package Numbers;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) {
        double sqrt5 = Math.sqrt(5);
        System.out.println(sqrt5);
        return (int) ((Math.pow((1 + sqrt5) / 2, n) - Math.pow((1 - sqrt5) / 2, n)) / sqrt5);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}