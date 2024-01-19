//17-12-2022
//Store Zero and One: Zeros are begin and Ones are End
public class ZeroAndOne {
    public static void main(String[] args) {
        int arr[]= {0,1,1,0,1,0,1};
        int n = arr.length;

        //By Counting Zero(0)
//        int count=0;
//        for(int i=0;i<n;i++){
//            if(arr[i] == 0)
//                count++;
//        }
//        for(int i=0;i<n;i++){
//            if(i<count) {
//                arr[i] = 0;
//            }
//            else {
//                arr[i] = 1;
//            }
//        }
//        for (int i=0;i<n;i++) {
//            System.out.print(arr[i] + " ");
//        }

        //By many if-else Conditions
//        int i=0,j=n-1;
//        while (i<j){
//            if((arr[i]==arr[j]) && (arr[i]==0)){
//                i++;
//            } else if ((arr[i]==arr[j]) && (arr[i]==1)) {
//                j--;
//            }
//            else if(arr[j] < arr[i]){
//                int temp = arr[i];
//                arr[i]=arr[j];
//                arr[j]=temp;
//                j--;
//                i++;
//            }
//            else {
//                i++;
//                j--;
//            }
//        }
//        for (int k=0;k<n;k++){
//            System.out.print(arr[k] + " ");
//        }

        //By 2 pointer but Easy method
        int i=0,j=n-1;
        while(i<j){
            if(arr[i]==0) {
                i++;
            } else if (arr[j]==1) {
                j--;
            }
            else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        for (int m=0;m<n;m++) {
            System.out.print(arr[m] + " ");
        }
    }
}
