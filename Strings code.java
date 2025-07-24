public class Strings {
    public static void main(String[] args) {
        // String is sequence of characters...
        //String name = new String("Pirih");
        String name = "Pirih Sahito";
        System.out.print("My name is ");
        System.out.println(name);
        int a = 6;
        float b = 5.6435f; // By default, decimal is considered as double...
        // printf and format are same...
        System.out.printf("The value of a is %d and value of b is %f", a,b);
        System.out.format("The value of a is %d and value of b is %f", a,b);

        System.out.printf("The value of a is %d and value of b is %.2f", a,b);
        // The above statement will show float value up to 2 decimals...

    }
}
