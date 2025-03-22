
import java.util.Scanner;

class BToD
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        System.out.println(bToD(b));
    }
    public static int bToD(int b)
    {
        int d=0;
        int i=0;
        while(b>0)
        {
            int rem=b%10;
            d = d + rem*(int)Math.pow(2,i);
            b=b/10;
            i++;
        }
        return d;
    }
    
}