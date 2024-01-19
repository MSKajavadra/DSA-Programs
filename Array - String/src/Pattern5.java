//09-12-2022
public class Pattern5 {
    public static void main(String[] args){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        for(int k=n-1;k>=1;k--){
            for(int l=k;l>=1;l--){
                System.out.print(l+ " ");
            }
            System.out.println();
        }
    }
}
