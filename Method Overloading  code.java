public class MethodOverloading {
    static void good(){
        System.out.println("Good Morning Mate...!!!");
    }
    static void good(int a){
        System.out.println("Good Morning Mate..." + a);
    }
    static void good(int b, int c){
        System.out.println("Good Morning Mate..." + b);
        System.out.println("Good Morning Mate..." + c);
    }

    public static void main(String[] args) {
        good();
        good(53);
        good(130, 132); // Arguments are actual...
    }
}
