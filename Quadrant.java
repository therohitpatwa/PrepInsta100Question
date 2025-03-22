import java.util.Scanner;
class Quadrant
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
         if ( x == 0 && y==0 )
        System.out.println("Origin Quadrant");

        if ( x!=0 && y==0 )
        System.out.println("x- Quadrant");

        if ( x>0 && y>0 )
        System.out.println("y-axis Quadrant");

        if ( x>0 && y>0 )
        System.out.println("First Quadrant");

        if ( x<0 && y>0 ) 
        System.out.println("Second Quadrant");
        if ( x<0 && y<0 ) 
        System.out.println("Third Quadrant");
        if ( x>0 && y>0 ) 
        System.out.println("Fourth Quadrant");

       
    }
}