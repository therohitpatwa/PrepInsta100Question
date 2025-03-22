
import java.util.Scanner;

class DToB
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        System.out.println(dToB(d));
    }
    public static int dToB(int d)
    {
        int b=0;
        int i=1;
        while(d>0)
        {
            int rem=d%2;
            b = b + rem*i;
            d=d/2;
            i=i*10;
        }
        return b;
    }
}