package while_loop;

import java.util.Scanner;

public class unique
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        int n=sc.nextInt();
        int i=0;
        int t,f,a;
        boolean flag=false;
        while(i<=9)
        {f=0;
            t=n;
            while(t!=0)
            {
                a=t%10;
                if(i==a)
                {f++;
                }
                t=t/10;
            }
            if(f>1)
            {
                flag=true;
                break;
            }
            i++;
            if(flag=false)
            {
                System.out.println("unique");
            }
            else
            {
                System.out.println("no");
            }
        }
    }
}


