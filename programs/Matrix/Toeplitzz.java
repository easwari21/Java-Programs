import java.util.HashMap;
import java.util.Scanner;

public class Toeplitzz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        checkToeplitz(matrix);
    }

    static void checkToeplitz(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int key = i - j;
                if (map.containsKey(key)) {
                    if (map.get(key) != matrix[i][j]) {
                        System.out.println("It is not a Toeplitz Matrix");
                        return;
                    }
                } else {
                    map.put(key, matrix[i][j]);
                }
            }
        }
        System.out.println("It is a Toeplitz Matrix");
    }
}
