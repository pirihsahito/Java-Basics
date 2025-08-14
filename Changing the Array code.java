public class ArrayChange {
    static void change(int [] arr){
        arr[0] = 27;
    }

    public static void main(String[] args) {
        int [] marks = {72, 80, 96, 59, 38, 97};
        change(marks);
        System.out.println("The value of array after running change is: " + marks[0]);
    }
}
