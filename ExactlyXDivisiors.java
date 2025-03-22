
import java.util.Scanner;

class ExactlyXDivisiors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (getDivisors(i) == x) {
                count++;
            }
        }
        System.out.println(count);
    }

    static int getDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }
}