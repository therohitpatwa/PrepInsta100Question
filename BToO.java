import java.util.Scanner;
class BToO
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        System.out.println(bToO(b));

    }
    public static int bToO(int b)
    {
        int d=bToD(b);
        int o=dToO(d);
        return o;
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
    public static int dToO(int d)
    {
        int o=0;
        int i=1;
        while(d>0)
        {
            int rem=d%8;
            o = o + rem*i;
            d=d/8;
            i=i*10;
        }
        return o;
    }

}