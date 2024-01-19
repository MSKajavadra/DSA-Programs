//12-01-2023
//Matrix diagonal sum of both direction
public class Matrix_Diagonal_Sum_of_Both_Direction {
    public static void main(String[] args) {
        int[][] mat={{1,6,5},
                     {5,2,9},
                     {8,1,7}};
        int row= mat.length;
        int col=mat[0].length;
        if(row!= col){
            System.out.println("There is No Diagonal in Matrix because row and column are different");
            return;
        }
        int sum=0;
        for(int i=0;i<row;i++){
            if((i==row/2) && (row%2 == 1)){
                sum+=mat[i][i];
                continue;
            }
            sum+=mat[i][i] + mat[i][col-i-1];
        }
        System.out.println(sum);
    }
}

