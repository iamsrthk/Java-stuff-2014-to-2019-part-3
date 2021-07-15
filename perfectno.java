package while_loop;

import java.util.Scanner;

public class perfectno
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nos");
        int n=sc.nextInt();
        int i=1;int s=0;
        while(i<n)
        {
            if(n%i==0)
            {
                s=s+i;
            }
            i++;
        }
        if(n%i==0)
        {
            System.out.println("perfect");
        }
        else
        {
            System.out.println(" not perfect");
        }

    }
}

