public class Toeplitz {
    public static void main(String[] args) {
    int[][] matrix =     { {7, 3, 4 },
                           {0, 7, 3 },
                           {6, 9, 7 },
                           {8, 6, 0 } };
        checkToeplitz(matrix);
    }
     private static void checkToeplitz(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row - 1; i++) {
            for (int j = 0; j < col - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    System.out.println("It is not a Toeplitz Matrix"); 
                }
            }
        }
        System.out.println("It is a Toeplitz Matrix"); 
    }
}
