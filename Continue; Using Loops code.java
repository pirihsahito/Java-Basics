public class Continue {
    public static void main(String[] args) {

        // Continue using For Loop
        for(int a = 0; a<=10; a++){
            if(a==5){
                System.out.println("Ending the Loop");
                continue;
            }
            System.out.println(a);
            System.out.println("Java is Great...!!!");
        }
        System.out.println("For Loop ends here...");

        // Continue using While Loop
        int b = 0;
        while(b<=10){
            b++;
            if(b==5) {
                System.out.println("Ending the Loop");
                continue;
            }
            System.out.println(b);
            System.out.println("Java is Great...!!!");
        }
        System.out.println("While Loop ends here...");

        // Continue using Do While Loop

        int c = 0;
        do{
            c++;
            if(c==5) {
                System.out.println("Ending the Loop");
                continue;
            }
            System.out.println(c);
            System.out.println("Java is Great...!!!");
        } while(c<=10);
        System.out.println("Do While Loop ends here...");
    }
}
