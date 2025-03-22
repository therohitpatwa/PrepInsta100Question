import java.util.Scanner;
class QuadraticRoot
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double d=b*b-4*a*c;
        if(d>0)
        {
            double r1=(-b+Math.sqrt(d))/(2*a);
            double r2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("Roots are real and different");
            System.out.println(r1+" "+r2);
        }
        else if(d==0)
        {
            double r1=(-b)/(2*a);
            System.out.println("Roots are real and same");
            System.out.println(r1+" "+r1);
        }
        else
        {
            double realPart=(-b)/(2*a);
            double imaginaryPart=Math.sqrt(-d)/(2*a);
            System.out.println("Roots are imaginary");
            System.out.println(realPart+"+i"+imaginaryPart+" "+realPart+"-i"+imaginaryPart);
        }
    }
}