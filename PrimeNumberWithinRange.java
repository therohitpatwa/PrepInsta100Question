
import java.util.Scanner;

class PrimeNumberWithinRange
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=n1;i<=n2;i++)
        {
            boolean b=isPrime(i);
            if(b)
            {
                System.out.print(i+" ");
            }
        }
    }
    public static Boolean isPrime(int i)
    {
     if (i < 2) {
            System.out.println("Not Prime");
        }

        for (int j = 2; j * j<= i; j++) {
            if (i % j == 0) {
                return false;
            }

        }
        return true;
        
    }
}