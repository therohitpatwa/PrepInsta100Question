import java.util.Scanner;


public class Armstrong
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int noDigit= (int)Math.log(n)+1;
        int sum=0;
        while(n!=0)
        {
            int digit=n%10;
            sum=sum+ (int)Math.pow(digit,noDigit);
            n=n/10;
        }
        if(sum==temp)
        System.out.println("ArmStrong");
        else
        System.out.println("Not ArmStrong");
        
    }
}