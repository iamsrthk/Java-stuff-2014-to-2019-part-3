package while_loop;

import java.util.Scanner;


public class freq
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        int n=sc.nextInt();
        int i=0;
        int t,f,a;

        while(i<=9)
        {
            f=0;
            t=n;
            while(t!=0)
            {
                a=t%10;
                if(i==a)
                {
                    f++;
                }
                t=t/10;
            }
            if(f>0)
            {
                System.out.println("frequency of "+i+"  is "+f );
            }
            i++;

        }
    }
}
