public class Factorial {
    public static void main(String[] args) {
        /* Factorial n = n * n-1 * n-2....1
         5! = 5*4*3*2*1
        */

        // Using For Loop
        int n1 = 5;
        int factorial1 = 1;
        for(int i = 1; i<=n1; i++){
            factorial1 *= i;
        }
        System.out.println(factorial1);

        // Using While Loop
        int n2 = 5;
        int j = 1;
        int factorial2 = 1;
        while(j<=n2){
            factorial2 *= j;
            j++;
        }
        System.out.println(factorial2);
    }
}
