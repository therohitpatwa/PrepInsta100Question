
import java.util.Scanner;

class NumOfDigit
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        while(n!=0)
        {
            int digit=n%10;
            cnt++;
            n=n/10;
        }
        System.out.println(cnt);
    }
}