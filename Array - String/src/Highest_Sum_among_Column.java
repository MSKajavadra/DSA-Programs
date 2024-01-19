//12-01-2023
//Find highest sum among all column
public class Highest_Sum_among_Column {
    public static void main(String[] args) {
        int[][] mat={{2,6,7},
                     {7,6,4},
                     {0,9,1}};
        int row=mat.length;
        int col=mat[0].length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<col;i++){
            int sum=0;
            for(int j=0;j<row;j++){
                sum+=mat[j][i];
            }
            if(max<sum){
                max=sum;
            }
            System.out.println("Sum of Column-" + i + ":" + sum);
        }
        System.out.println("Highest Sum: "+ max);
    }
}
