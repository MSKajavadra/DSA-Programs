//12-01-2023
//Find highest sum among all rows
public class HIghest_Sum_among_Rows {
    public static void main(String[] args) {
        int[][] mat={{1,4,6},
                     {5,2,3},
                     {9,7,0}};
        int row=mat.length;
        int col=mat[0].length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<row;i++){
            int sum=0;
            for(int j=0;j<col;j++){
                sum+=mat[i][j];
            }
            if(max<sum){
                max=sum;
            }
            System.out.println("Sum of Row-" + i + ":" + sum);
        }
        System.out.println("Highest Sum: " + max);
    }
}
