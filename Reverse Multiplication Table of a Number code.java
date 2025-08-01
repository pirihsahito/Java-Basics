public class ReverseMultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Table of 9 :");
        int n = 10;
        for (int i = 10; i >= 1; i--) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
    }
}
