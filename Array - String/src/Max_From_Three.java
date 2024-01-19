//17-12-2022
// Find Max value from A,B,C
import java.util.Scanner;
public class Max_From_Three {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A:");
        a=sc.nextInt();
        System.out.print("Enter B:");
        b=sc.nextInt();
        System.out.print("Enter C:");
        c= sc.nextInt();
        if (a > b && a > c) {
            System.out.println("A is Big");
        }else if (b>a && b>c){
            System.out.println("B is Big");
        }else if (c>a && c>b) {
            System.out.println("C is Big");
        }else if (a==b && b==c) {
            System.out.println("All are Equal");
        }else if (a==b && a>c) {
            System.out.println("A and B both are Big");
        }else if (a==c && a>b){
            System.out.println("A and C both are Big");
        }else if (b==c && b>a){
            System.out.println("B and C both are Big");
        }
    }
}
