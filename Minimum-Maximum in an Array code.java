public class MinimumMaximum {
    public static void main(String[] args) {
      // Maximum element in an Array
        int[] arr1 = {19, 23, 34, 45, 55, 46, 37, 28, 12};
        int max = Integer.MIN_VALUE;
        for(int e : arr1){
            if(e>max){
                max = e;
            }
        }
        System.out.println("The value of the maximum element in this array : " + max);

        int[] arr2 = {19, 23, 34, 45, 55, 46, 37, 28, 12};
      // Minimum element in an Array
        int min = Integer.MAX_VALUE;
        for(int e : arr2){
            if(e<min){
                min = e;
            }
        }
        System.out.println("The value of the minimum element in this array : " + min);
    }
}
