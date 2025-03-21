
import java.util.Scanner;

public class Fibbonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("0");
            System.exit(0);
        }
        if (n == 2) {
            System.out.print("0"+" ");
            System.out.print("1");
            System.exit(0);
        }
        int result = 1;
        int a;
        int b=0;
        System.out.print("0"+" ");
        System.out.print("1"+ " ");
        for (int i = 3; i <= n; i++) {
            a = b;
            b = result;
            result = a + b;
            System.out.print(result+" ");

        }
    }
}
