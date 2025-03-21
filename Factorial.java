
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long f=fact(n);
        System.out.println(f);

    }

    public static long fact(int n) {
        if (n == 1) {
            return 1;
        }

        return n * fact(n - 1);

    }
}
