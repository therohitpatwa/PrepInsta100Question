import java.util.*;

public class FriendlyPair {

       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (isFriendlyPair(A, B)) {
            System.out.println("Yes, they are a friendly pair.");
        } else {
            System.out.println("No, they are NOT a friendly pair.");
        }
    }
    public static int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isFriendlyPair(int A, int B) {
        int sumA = sumOfDivisors(A);
        int sumB = sumOfDivisors(B);
        return (sumA * B == sumB * A);
    }

 
}
