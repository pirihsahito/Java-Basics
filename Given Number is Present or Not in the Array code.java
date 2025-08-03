public class GivenValue {
    public static void main(String[] args) {
        int[] numbers = {35, 78, 76, 45, 37};
        int value = 76;
        boolean isInArray = false;
        for (int element : numbers) {
            if (value == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("The value is present in the array");
        } else{
            System.out.println("The value is not present in the array");
        }
    }
}
