import java.util.Scanner;

public class PassingPercentage {
    public static void main(String[] args) {
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Physics Marks :");
        m1 = sc.nextByte();
        System.out.println("Enter Your mathematics Marks :");
        m2 = sc.nextByte();
        System.out.println("Enter Your English Marks :");
        m3 = sc.nextByte();
        float avg = (m1 + m2 + m3)/3.0f;
        System.out.println("Your Overall Percentage is :" + avg);
        if(avg>40 && m1>33 && m2>33 && m3>33){
            System.out.println("Congratulations, You Have Been Promoted...!");
        }
        else{
            System.out.println("Sorry, You Have Not Been Promoted. Please Try Again...!");
        }
    }
}
