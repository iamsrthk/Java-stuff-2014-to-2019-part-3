package STRINGHAND;

import java.util.Scanner;

public class appbased
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");String s="";
        String x=sc.nextLine();
        
        x=" "+x;
        int len=x.length();

        for(int i=0;i<len;i++)
        {
            char ch=x.charAt(i);
            if(ch==' ')
            {
              s=s+x.charAt(i+1);   
            System.out.print(s);
           
        }
    }
        }
    }
