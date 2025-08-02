public class EvenNumbers {
    public static void main(String[] args) {
        // Using For Loop
        int sum1 = 0;
        int n1 = 5;
        for(int i = 0; i<n1; i++){
            sum1 = sum1 + (2*i);
        }
        System.out.print("Sum of 5 even numbers using For Loop : ");
        System.out.println(sum1);

        //Using While Loop
        int sum2 = 0;
        int n2 = 5;
        int j = 0;
        while(j<n2){
            sum2 = sum2 + (2*j);
            j++;
        }
        System.out.print("Sum of 5 even numbers using While Loop : ");
        System.out.println(sum2);
    }
}
// First 5 even numbers sum -> 0+2+4+6+8 = 20
