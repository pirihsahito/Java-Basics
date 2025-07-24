import java.util.Scanner;

public class MarksInput {
    public static void main(String[] args) {
        System.out.println("Taking Marks From The User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Subject 1 Marks :");
        int s1 = sc.nextInt();
        System.out.println("Subject 2 Marks :");
        int s2 = sc.nextInt();
        System.out.println("Subject 3 Marks :");
        int s3 = sc.nextInt();
        System.out.println("Subject 4 Marks :");
        int s4 = sc.nextInt();
        System.out.println("Subject 5 studies Marks :");
        int s5 = sc.nextInt();
        int total = s1 + s2 + s3 + s4 + s5;
        float percentage = (float) total/500*100;
        System.out.println("Percentage =");
        System.out.println(percentage + "%");

    }
}
