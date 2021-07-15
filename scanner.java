package scanner;

import java.util.*;

public class scanner
{
 void main()
 {
     Scanner sc = new Scanner(System.in);
     
     System.out.print("enter your name sir");
     String name=sc.nextLine();
     System.out.print("enter your standard");
     int std=sc.nextInt();
     System.out.print("enter your division sir");
     char div=sc.next().charAt(0);
     System.out.print("enter your 1st subjects marks sir");
     int s1=sc.nextInt();
     System.out.print("enter your 2st subjects marks sir");
     int s2=sc.nextInt();
     
     System.out.print(" your name "+name);
     System.out.print("enter your standard"+std);
     System.out.print("enter your division"+div);
     
     System.out.print("total marks= "+(s1+s2));
     System.out.print("percent= "+((s1+s2/200.0)*(100)));
    }
    
    }
}
