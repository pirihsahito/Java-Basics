public class AverageMarks {
    public static void main(String[] args) {
        int [] mathsMarks = {78, 98, 90, 67, 59, 93, 85};
        float sum = 0;
        for(int marks : mathsMarks){
            sum += marks;
        }
        System.out.println("The Average Marks From an Array : " + sum/mathsMarks.length);
    }
}
