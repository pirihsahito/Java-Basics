public class Arrays {
    public static void main(String[] args) {
        // Classroom of 5 students. You have to store marks of 5 students.
        
       int [] marks = new int[5];
        marks[0] = 98;
        marks[1] = 87;
        marks[2] = 68;
        marks[3] = 90;
        marks[4] = 79;
        System.out.println(marks[3]);
    }
}
/*
There are three main ways to create an array in java.
1. Declaration and memory allocation.
    Syntax : int [] marks = new int[5]
2. Declaration and then memory allocation.
    Syntax : int [] marks;
             marks = new int[5]
3. Declaration, memory allocation, and initialization together
    Syntax : int [] marks = {98, 87, 68, 90, 79};
*/
