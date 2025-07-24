import java.util.Scanner;
public class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String str = sc.next(); ...> Shows only first word as output
        String str = sc.nextLine(); // Shows all as output...
        System.out.println(str);
    }
}
