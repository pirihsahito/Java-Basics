public class Decrement {
    public static void main(String[] args) {
        int i = 56;
        System.out.println(i--); //  First value assigned then decremented
        System.out.println(i);
        System.out.println(--i); // First decremented then value assigned

        // Example 1
        int y = 7;
        int x = --y * 8; // precedence of -- is higher than *
        System.out.println(x);
        // Example 2
        char ch = 'b';
        System.out.println(--ch);
    }
}
