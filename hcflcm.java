package while_loop;

import java.util.Scanner;

public class hcflcm
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m=Math.min(a,b);
        int p=a*b;
        int hcf=0;
        for(int i=1;i<=m;i++)
        {
            if(a%i==0&&b%i==0)
            {
                 hcf=i;
            }
        }
        System.out.println("hcf="+hcf);
        int lcm=p/hcf;
        System.out.println("lcm="+lcm);

    }
}
