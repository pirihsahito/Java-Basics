import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your Age :");
        Scanner sc = new  Scanner(System.in);
        age = sc.nextInt();
        switch(age){
            case 18:
                System.out.println("You are going to become an Adult...!");
                break;
            case 25:
                System.out.println("You are going to join a Job...!");
                break;
            case 60:
                System.out.println("You are going to get retired...!");
                break;
            default :
                System.out.println("Enjoy Your Life...!");
        }
    }
}
