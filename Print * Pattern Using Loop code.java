public class Pattern {
    public static void main(String[] args) {

        // Using For Loop
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

        // Using While Loop
        // Example 1
        int j = 5;
        while (j > 0) {
            int k = 0;
            while (k < j) {
                System.out.print("*");
                k++;
            }
            System.out.print("\n");
            j--;
        }

        // Example 2
        int k = 0;
        while (k < 5) {
            int l = 0;
            while(l < k) {
                System.out.print("*");
                l++;
            }
            System.out.print("\n");
            k++;
        }
    }
}
