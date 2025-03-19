
import java.util.Scanner;

class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Not Prime");
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println("Not a Prime");
                System.exit(0);
            }

        }
        System.out.println("Prime");
    }
}
