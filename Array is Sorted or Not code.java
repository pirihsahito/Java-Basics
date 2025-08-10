public class ArraySorted {
    public static void main(String[] args) {
        boolean isSorted = true;
        int[] arr = {19, 23, 34, 45, 55, 46, 37, 28, 12};
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is Sorted...");
        }
        else{
            System.out.println("The Array is not Sorted...");
        }
    }
}
