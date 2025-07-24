import java.util.Scanner;
public class ConvertInput {
    public static void main(String[] args){
        System.out.println("Taking Input from User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Write Kilometers :");
        float kilometer = sc.nextFloat();
        double mile = 1.609;
        double mi = kilometer / mile;
        System.out.println("km to mi =");
        System.out.println(mi + " Miles");


    }
}
