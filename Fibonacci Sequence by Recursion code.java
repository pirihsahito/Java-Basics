public class Recursion {
    static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        int x = 9;
        System.out.println("The Fibonacci Sequence of x is : " + fibonacci(x));
    }
}
/*
Fibonacci Sequence Formula > Fn = F(n-1) + F(n+2)
Fn is nth Fibonacci number
each term is sum of two preceding terms
The sequence starts with initial conditions > F(0) = 0 and F(1) = 1
 */
