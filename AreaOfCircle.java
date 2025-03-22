import java.util.Scanner;
class AreaOfCircle
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        System.out.println(areaOfCircle(r));
    }
    public static double areaOfCircle(int r)
    {
        return 3.14*r*r;
    }
}