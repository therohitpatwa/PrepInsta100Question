import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long square = n * n;
        int l = (int) Math.log10(n) + 1;
        int i = 0;
        long sum = 0;

        while (l > 0) {
            long digit = square % 10;
            sum = sum + digit * (int) Math.pow(10, i);
            square = square / 10;
            l--;
            i++;
        }

        if (sum == n) {
            System.out.print("Automorphic Number");
        } else {
            System.out.print("Not Automorphic Number");
        }
    }
}