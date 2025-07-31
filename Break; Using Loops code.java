public class Break {
    public static void main(String[] args) {

        // Break using For Loop
        for(int a = 0; a<=10; a++){
            System.out.println(a);
            System.out.println("Java is Great...!!!");
            if(a==5){
                System.out.println("Ending the Loop");
                break;
            }
        }
        System.out.println("For Loop ends here...");

        // Break using While Loop
        int b = 0;
        while(b<10){
            System.out.println(b);
            System.out.println("Java is Great...!!!");
            if(b==5) {
                System.out.println("Ending the Loop");
                break;
            }
            b++;
        }
        System.out.println("While Loop ends here...");

        // Break using Do While Loop

        int c = 0;
        do{
            System.out.println(c);
            System.out.println("Java is Great...!!!");
            if(c==5) {
                System.out.println("Ending the Loop");
                break;
            }
            c++;
        } while(c<10);
        System.out.println("Do While Loop ends here...");
    }
}
