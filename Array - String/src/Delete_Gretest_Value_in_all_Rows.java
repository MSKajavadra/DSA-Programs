//12-01-2023
//Delete greatest value in each row
public class Delete_Gretest_Value_in_all_Rows {
    public static void main(String[] args) {
        int[][] mat={{1,6,5},
                     {5,2,9},
                     {8,0,7}};
        int row= mat.length;;
        int col=mat[0].length;
        for(int i=0;i<row;i++){
            int max=0;
            for(int j=1;j<col;j++){
                if(mat[i][max] < mat[i][j]){
                    max=j;
                }
            }
            while(max<col-1){
                mat[i][max]=mat[i][max+1];
                max++;
            }
        }
        col--;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
