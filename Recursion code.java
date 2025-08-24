public class Recursion {
    // Factorial(n) = n * n-1....1
    // Factorial (9) = 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 = 362880
    // Factorial (n) = n * factorial(n-1)
    // Factorial (0) = 1
    static int factorial(int n) {
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        int x = 9;
        System.out.println("The value of Factorial x is : " + factorial(x));
    }
}
