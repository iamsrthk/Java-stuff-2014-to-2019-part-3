package if_programs;
public class triangle_possornot_type
{
    void main(int a,int b,int c )
    {
    if(a==b&&b==c&&a+b>c&&b+c>a&&a+c>b)
    System.out.println("triangle is possible and is equilateral");
    else if(a==b||b==c||c==a&&a+b>c&&b+c>a&&a+c>b)
    System.out.println("triangle is possible and is isoceles");
    else if(a!=b && b!=c && c!=a && a+b>c && b+c>a && a+c>b)
    System.out.println("triangle is possible and is scalene");
    else
    System.out.println("triangle not possible");
    }
}
