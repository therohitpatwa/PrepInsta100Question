
import java.util.Scanner;

class Power
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int base=sc.nextInt();
        int exponent=sc.nextInt();
        
        long result = 1;
        long b = base;

        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result *= b;
            }
            b *= b;
            exponent /= 2;
        }
        System.out.print(result);
      
    }
}





