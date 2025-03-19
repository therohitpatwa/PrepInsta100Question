
import java.util.Scanner;

class SumOfNWithinRange
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int sum= n2*(n2+1)/2-n1*(n1+1)/2+n1;
        System.out.println(sum);
    }
}