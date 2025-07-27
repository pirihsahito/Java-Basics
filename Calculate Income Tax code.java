/*
Statement : Calculate income tax paid by an employee to the government as per the slabs mentioned bellow :
"Income-Slabs"  "Tax"
2.5L-5.0L        5%
2.5L-5.0L        20%
2.5L-5.0L        30%
*/
import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Income in Lacs per Annum :");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<=2.5f){
            tax = tax + 0;
        }
        else if(income>2.5f && income<=5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income>5f && income<=10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5.0f);
        }
        else if(income>10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.05f * (10.0f - 5.0f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("The total tax paid by the employee is :" + tax);
    }
}
