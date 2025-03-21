import java.util.Scanner;

public class StrongNumber
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(n!=0){
            int digit=n%10;
            sum+= fact(digit);
            n=n/10;
        }
        if(sum==temp)
        System.out.print("Strong Number");
        else
        System.out.println("Not Strong Number");
    }
    public static int fact(int n1) {
        if (n1 == 1) {
            return 1;
        }

        return n1 * fact(n1 - 1);

    }
}

