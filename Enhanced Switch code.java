import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your Age :");
        Scanner sc = new  Scanner(System.in);
        age = sc.nextInt();
        switch (age) {
            case 18 -> System.out.println("You are going to become an Adult...!");
            case 25 -> System.out.println("You are going to join a Job...!");
            case 60 -> System.out.println("You are going to get retired...!");
            default -> System.out.println("Enjoy Your Life...!");
        }
        // In enhanced switch there is no break statement...
    }
}
