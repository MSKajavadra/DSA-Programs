//19-12-2022
public class Pattern7 {
    public static void main(String[] args) {
        int n=5,count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((count%2)==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
                count++;
            }
            System.out.println();
        }
    }
}
