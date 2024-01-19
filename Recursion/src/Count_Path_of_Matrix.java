public class Count_Path_of_Matrix {
    public static void main(String[] args) {
        int totalPaths=countPaths(0,0,3,3);
        System.out.println(totalPaths);
    }

    public static int countPaths(int i,int j,int n,int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }

        return countPaths(i+1,j,n,m) + countPaths(i,j+1,n,m);
    }
}
