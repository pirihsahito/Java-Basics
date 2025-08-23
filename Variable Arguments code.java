public class VarArgs {
/*    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
    static int sum(int a, int b, int c, int d){
        return a+b+c+d;
    } */
  // The above code is time taking, so follow the bellow one...
    static int sum(int ...arr){
        // Available as int [] arr;
        int result = 0;
        for(int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome To Var Args Code...");
        System.out.println("The Sum of Nothing : " + sum());
        System.out.println("The Sum of 4, and 5 : " + sum(4,5));
        System.out.println("The Sum of 3, 4 and 5 : " + sum(3,4, 5));
        System.out.println("The Sum of 2, 3, 4 and 5 : " + sum(2,3, 4,5 ));
        System.out.println("The Sum of 1, 2, 3, 4 and 5 : " + sum(1, 2,3, 4,5 ));
    }
}
