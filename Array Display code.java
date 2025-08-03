public class ArrayDisplay {
    public static void main(String[] args) {

        int [] marks = {98, 87, 68, 90, 79};

        System.out.println("Displaying the Array (Naive way ) :");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("Displaying the Array by For Loop :");
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        System.out.println("Displaying the Array by Enhanced For Loop/For-each Loop :");
        for (int mark : marks) {
            System.out.println(mark);
        }

        System.out.println("Displaying the Array in Reverse Order :");
        for(int i=marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }
    }
}
