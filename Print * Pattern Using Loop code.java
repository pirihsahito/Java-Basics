public class Pattern {
    public static void main(String[] args) {

        // Example 1
        int b = 5;
        for (int j = b; j > 0; j--) {
            for (int k = 0; k < j; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        // Example 2
        int a = 0;
        for (int i = a; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
