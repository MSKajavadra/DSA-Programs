//13-01-2023
//Implement insert, update, search, delete, display in sorted array

import java.util.Scanner;

public class Array_Insert_Update_Delete_Display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 20;
        int[] arr = new int[n];
        int l = -1;

        int choice = 0;
        while (choice != 6) {
            System.out.println("\n1.Insert\n2.Update\n3.Search\n4.Delete\n5.Display\n6.Exit");
            System.out.print("\tEnter Your Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (l == n - 1) {
                        System.out.println("Array is Full");
                        break;
                    }
                    System.out.print("Enter Value: ");
                    int value=sc.nextInt();
                    l = insert(arr, l,value);
                    break;
                case 2:
                    if (l == -1) {
                        System.out.println("Array is Empty!");
                        break;
                    }
                    update(arr, l);
                    break;
                case 3:
                    if (l == -1) {
                        System.out.println("Array is Empty!");
                        break;
                    }
                    search(arr, l);
                    break;
                case 4:
                    if (l == -1) {
                        System.out.println("Array is Empty!");
                        break;
                    }
                    System.out.print("Enter Value which you want to delete: ");
                    int val=sc.nextInt();
                    l = delete(arr, l,val);
                    break;
                case 5:
                    if (l == -1) {
                        System.out.println("Array is Empty!");
                        break;
                    }
                    display(arr, l);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Enter Valid Number.");
            }
        }
    }

    private static int insert(int[] arr, int l,int value) {
        l++;
        arr[l]=value;
        int i=l;
        if(l==0){
            return l;
        }
        while((i>0) && (arr[i-1] > arr[i])){
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
            i--;
        }
        return l;
    }

    private static void update(int[] arr, int l) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Value which you want to Update: ");
        int value=sc.nextInt();
        for(int i=0;i<=l;i++)
        {
            if(arr[i] == value) {
                l=delete(arr,l,value);
                System.out.print("Enter New Value: ");
                int newValue=sc.nextInt();
                l=insert(arr,l,newValue);
                return;
            }
        }
        System.out.println("Entered Value not in Array.");
    }

    private static void search(int[] arr, int l) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Value which you want to Search: ");
        int value=sc.nextInt();
        int i=0,j=l;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid] > value){
                j=mid-1;
            } else if (arr[mid] < value) {
                i=mid+1;
            }
            else {
                System.out.println(value + " is Found at index:" + mid);
                return;
            }
        }
        System.out.println(value + " is Not Found");
    }

    private static int delete(int[] arr, int l,int value) {
        int i=0,j=l;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid] > value){
                j=mid-1;
            } else if (arr[mid] < value) {
                i=mid+1;
            }
            else {
                for(int k=mid;k<l;k++)
                {
                    arr[k]=arr[k+1];
                }
                l--;
                return l;
            }
        }
        System.out.println("Entered Element not Found in Array.");
        return l;
    }

    private static void display(int[] arr, int l) {
        System.out.print("All Elements are: ");
        for (int i=0;i<=l;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
