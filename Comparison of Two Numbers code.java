import java.util.Scanner;
public class InputComparison {
    public static void main(String[] args) {
        System.out.println("Write Your Number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a>10);
    }
}
