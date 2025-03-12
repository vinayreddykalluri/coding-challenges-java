public class GCDLCM {
    public static void main(String[] args) {
        int a = 12, b = 18;
        int gcd = gcd(a, b);
        int lcm = lcm(a, b);
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
