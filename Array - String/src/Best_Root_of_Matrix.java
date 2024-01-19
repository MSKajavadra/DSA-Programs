//07-01-2023
public class Best_Root_of_Matrix {
    public static void main(String[] args) {
        int[][] arr={{1,5,3},{4,1,3},{6,8,2}};
        int n=3,m=3;
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0)
                    continue;
                if(i==0){
                    arr[i][j]+= arr[i][j-1];
                } else if (j==0) {
                    arr[i][j]+= arr[i-1][j];
                }else {
                    arr[i][j]+= Math.min(arr[i-1][j],arr[i][j-1]);
                }
            }
        }

        System.out.println();
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(arr[m-1][n-1]);
    }
}
