public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}