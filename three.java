package if_programs;



public class three
{
    void main(int a, int b, int c )
    {
    if(a>b&&a>c)
    System.out.println(a+" is greater");
   else if(b>a&&b>c)
    System.out.println(b+" is greater");
    else  if(c>b&&c>a)
    System.out.println(c+" is greater");
    else if(a<b&&a==c)
    System.out.println(a+"is greater");
    else if(b<a&&b==c)
    System.out.println(b+"is greater");
    else if(c<b&&b==a)
    System.out.println(b+"is greater");
    else
    System.out.println("all are equal");
    }
}

