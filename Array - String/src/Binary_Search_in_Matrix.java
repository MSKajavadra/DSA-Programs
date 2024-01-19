//Check Value is Present in Matrix
import java.util.Scanner;

//07-01-2023
public class Binary_Search_in_Matrix {
    public static void main(String[] args) {
        int[][] arr = {{1,6,7},
                    {8, 10, 13},
                    {16, 18, 20},
                    {26,28,30},
                    {31,34,36},
                    {38,40,49}};

        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter Number For Search in Matrix: ");
        int value=sc.nextInt();

        int top=0,bottom=row-1,rowTobeSearch=-1;
        while(top<=bottom){
            int mid=(top+bottom)/2;
            if ((arr[mid][0] <= value) && (arr[mid][col-1] >= value)) {
                rowTobeSearch=mid;
                break;
            }
            else if(arr[mid][0] < value){
                top=mid+1;
            }
            else {
                bottom=mid-1;
            }
        }
        if(rowTobeSearch == -1){
            System.out.println("Value Not Present");
            return;
        }
        int left=0,right=col-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[rowTobeSearch][mid] == value){
                System.out.println(value + " is Present");
                return;
            } else if(arr[rowTobeSearch][mid] < value){
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        System.out.println(value + " is Not Present");
    }
}
