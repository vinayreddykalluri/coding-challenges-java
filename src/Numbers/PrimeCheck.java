package Numbers;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = isPrime(number);
        System.out.println(isPrime ? "Prime" : "Not Prime");
    }

    private static boolean isPrime(int number) {
        return number > 1 && java.math.BigInteger.valueOf(number).isProbablePrime(1);
    }
}
