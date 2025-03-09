import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        for (int j : a) {
            System.out.println(j);
        }

        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int sum = number1 + number2;
        System.out.println(sum);
        sc.close();
    }
}