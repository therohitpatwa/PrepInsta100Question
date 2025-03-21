import java.util.Scanner;

public class AbundentNumber
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            sum+=i;
        }
        if(sum-n>n)
        System.out.println("Abundent Number");
        else
        System.out.println("Not a Abundent Number");
        
    }
}
