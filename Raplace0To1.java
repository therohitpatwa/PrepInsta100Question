import java.util.Scanner;
class Replace0To1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String num=String.valueOf(n);
        num=num.replace('0','1');
        System.out.println(num); 

    }
}