import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter Year :");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 4 == 0){
            System.out.println("This Is A Leap Year...!!!");
        }
        else{
            System.out.println("This Is Not A Leap Year...!!!");
        }
    }
}
