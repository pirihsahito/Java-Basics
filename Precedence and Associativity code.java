public class PrecedenceAssociativity {
    public static void main(String[] args) {
        // precedence and Associativity
        int a = 6 * 5 - 34 / 2;
        System.out.println(a);
        int b = 60 / 5 - 2 * 3;
        System.out.println(b);
        /*
        Highest precedence goes to * and /. They are then evaluated on the basis of left to right associativity.
         */
        int c = 1 * 1 - 4 * 5 * 4 / 2 * 5;
        System.out.println(c);
        int d = 1 * 1 - (4 * 5 * 4) / (2 * 5);
        System.out.println(d);
    }
}
        /* Parentheses have the highest precedence value */


