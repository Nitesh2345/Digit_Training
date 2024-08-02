package Assignment_Day2;

public class MultiDimensional_Array {
    public static void main(String[] args) {

                int rows = 2, cols = 3;

                // Initialize two matrices
                int[][] matrix1 = {
                        {1, 2, 3},
                        {4, 5, 6}
                };

                int[][] matrix2 = {
                        {7, 8, 9},
                        {10, 11, 12}
                };
                int[][] result = new int[rows][cols];

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        result[i][j] = matrix1[i][j] + matrix2[i][j];
                    }
                }
                System.out.println("Sum of the two matrices is: ");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }



