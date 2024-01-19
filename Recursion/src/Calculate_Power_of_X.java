public class Calculate_Power_of_X {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(calcPower(x, n));

        System.out.println(calcPower2(x, n));
    }

    public static int calcPower(int x, int n) {  //stack height = n
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        return x * calcPower(x, n - 1);
    }

    public static int calcPower2(int x, int n) {  //stack height = logn
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        //n is even or odd
        if (n % 2 == 0) {
            return calcPower2(x, n / 2) * calcPower2(x, n / 2);
        } else {
            return calcPower2(x, n / 2) * calcPower2(x, n / 2) * x;
        }
    }
}
