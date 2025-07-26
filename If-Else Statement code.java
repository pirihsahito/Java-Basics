public class Conditionals {
    public static void main(String[] args) {

        // For Relational Operators
        int age1 = 6; // Example 1
        if(age1>18) {
            System.out.println("Yes, you can derive...!");
        }
        else{
            System.out.println("No, you can not drive yet...!");
        }
        int age2 = 26; //Example 2
        if(age2>18) {
            System.out.println("Yes, you can derive...!");
        }
        else{
            System.out.println("No, you can not drive yet...!");
        } // else is optional. If executes without else statement...
        int age3 = 36; // Example 3
        if(age3==18) {
            System.out.println("Yes, you can derive...!");
        }
        else{
            System.out.println("No, you can not drive yet...!");
        }
        // For Logical Operators
        System.out.println("For Logical AND");
        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = false;
        if(b1 && b2 && b3){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        } // Evaluates to true when at least all conditions are true...

        System.out.println("For Logical OR");
        boolean a = true;
        boolean b = false;
        if(a || b){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }  // Evaluates to true when at least 1 of conditions is true...

        System.out.println("For Logical NOT");
        System.out.print("Not(a) is ");
        System.out.println(!a);
        System.out.print("Not(b) is ");
        System.out.println(!b);
    } // Logical NOT is also known as Inverter. True becomes false and false become true.
}
