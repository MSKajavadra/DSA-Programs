//12-01-2023
//Print mirror image of matrix
public class Mirror_of_Matrix {
    public static void main(String[] args) {
        int[][] mat={{1,3,5},
                     {6,1,7},
                     {9,10,0}};
        int row=mat.length;
        int col=mat[0].length;
        for (int i=0;i<row-1;i++) {
            for (int j = col - 1; j >= 0; j--) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}