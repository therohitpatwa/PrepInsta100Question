import java.util.Scanner;
class DToO
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        System.out.println(dToO(d));
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