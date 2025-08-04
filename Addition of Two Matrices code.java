public class MatricesAddition {
    public static void main(String[] args) {
        int [][] matrix1 = {{1,3,5},
                           {7,9,11}};

        int [][] matrix2 = {{2,4,6},
                           {8,10,12}};

        int [][] result = {{0,0,0},
                          {0,0,0}};

        System.out.println("Addition of Two Matrices :");
        for(int i = 0; i<matrix1.length; i++){ // Row number of times
            for(int j = 0; j<matrix1[i].length; j++){ // Column number of times
                result[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println(""); // Prints a new line...
        }
    }
}
