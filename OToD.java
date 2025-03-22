
import java.util.Scanner;

class OToD
{
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
         int o=sc.nextInt();
         System.out.println(oToD(o));       
   } 
   public static int oToD(int o)
   {
       int d=0;
       int i=0;
       while(o>0)
       {
           int rem=o%10;
           d = d + rem*(int)Math.pow(8,i);
           o=o/10;
           i++;
       }
       return d;
   }
}