package while_loop;

import java.util.Scanner;



public class while_5
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        int n=sc.nextInt();
        int t=n;
        int a;
        int s=0;
        while(t!=0)
        {
         a=t%10;
         int cb=((int)Math.pow(a,3));
         s=s+cb;
         t=t/10;
        }
       if(s==n)
       {
        System.out.println("it is an amstrong no.");
        }
        else
       {
        System.out.println("it is not an amstrong no.");
        }
        
  
    }
}
