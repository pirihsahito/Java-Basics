public class EvenNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int n = 5;
        for(int i = 0; i<n; i++){
            sum = sum + (2*i);
        }
        System.out.print("Sum of even numbers is : ");
        System.out.println(sum);
    }
}
// First 5 even numbers sum -> 0+2+4+6+8 = 20
