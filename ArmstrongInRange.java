
import java.util.Scanner;

public class ArmstrongInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = n1; i <= n2; i++) {
            boolean b = isArmstrong(i);
            if (b) {
                System.out.println(i);
            }
        }

    }

    public static boolean isArmstrong(int n) {
        int temp = n;
        int noDigit = (int) Math.log(n) + 1;
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum = sum + (int) Math.pow(digit, noDigit);
            n = n / 10;
        }
        if(sum == temp) 
        {
            return true;
        }
        else
        return false;
    }
}
