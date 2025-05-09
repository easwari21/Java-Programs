public class Sparse {
    public static void main(String[] args) {
        SparseMatrix[] mat1 = {
            new SparseMatrix(0, 0, 1),
            new SparseMatrix(1, 2, 2)
        };

        SparseMatrix[] mat2 = {
            new SparseMatrix(0, 0, 4),
            new SparseMatrix(2, 1, 5)
        };

        System.out.println("Result:");
        for (int i = 0; i < mat1.length; i++) {
            System.out.println(mat1[i].row + " " + mat1[i].col + " " + mat1[i].val);
        }
        for (int j = 0; j < mat2.length; j++) {
            int count = 0; 

            for (int i = 0; i < mat1.length; i++) {
                if (mat2[j].row == mat1[i].row && mat2[j].col == mat1[i].col) {
                    System.out.println(mat2[j].row + " " + mat2[j].col + " " + (mat2[j].val + mat1[i].val));
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(mat2[j].row + " " + mat2[j].col + " " + mat2[j].val);
            }
        }
    }
}
,
class SparseMatrix {
    int row;
    int col;
    int val;

    SparseMatrix(int r, int c, int v) {
        row = r;
        col = c;
        val = v;
    }
}
