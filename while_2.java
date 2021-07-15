package while_loop;

import java.util.Scanner;



public class while_2
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        int n=sc.nextInt();
        int i=1; int f=1;
        while(i<=n)
        {
            f=f*i;
            i++;
        }
        System.out.println("factorial"+n+"="+f);

   
        }
    }
