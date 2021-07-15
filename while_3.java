package while_loop;

import java.util.Scanner;



public class while_3
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        System.out.println("enter the number");
        int n=sc.nextInt();
        int i=2;
        while(i<n)
        {
            if(n%i==0)
            {
            flag=true;
            break;
            }
            i++;
        }
        if(flag==true)
        {
        System.out.println("not prime");    
        }
        else 
        System.out.println("prime");
    }
}
