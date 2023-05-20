public class Transposon {
    public static void main(String[] args) {
        int[][] matrix = { 
                {1, 2, 3}, 
                {4, 5, 6} 
        };

        int rows = matrix.length;
        int columns = matrix[0].length;

        // Create a matrix to store the transpose
        int[][] transpose = new int[columns][rows];

        // Calculate the transpose of the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matrix:");
        printMatrix(matrix);

        System.out.println("Transpose:");
        printMatrix(transpose);
    }

    // Helper method to print the matrix
    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        // Iterate over the matrix and print each element
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
