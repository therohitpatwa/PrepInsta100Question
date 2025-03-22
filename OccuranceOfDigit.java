import java.util.Scanner;
class OccuranceOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        System.out.println(occuranceOfDigit(n,d));
    }
    public static int occuranceOfDigit(int n,int d)
    {
        int cnt=0;
        while(n!=0)
        {
            int digit=n%10;
            if(digit==d)
            {
                cnt++;
            }
            n=n/10;
        }
        return cnt;
    }

}