public class SumOfTableNumbers {
    public static void main(String[] args) {
            int n = 8;
            int sum = 0;
            for(int i = 1; i <= 10; i++){
                sum += n*i;
            }
        System.out.println("Sum of numbers of multiplication table of 8 :");
        System.out.println(sum);
    }
}
