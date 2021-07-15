package input_methods;

import java.io.*;

public class input_method
{
    void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("print your name");
        String name=in.readLine();     
        System.out.println("enter roll no.");     
        int rdlno=Integer.parseInt(in.readLine());          
        System.out.println("enter ur percentage");
        double per=Double.parseDouble(in.readLine());
        System.out.println("enter ur div"); 
        char div=in.readLine().charAt(0);
        
        System.out.println("hello!" + name+"welcome");
        System.out.println("your rollno. is"+rdlno);
        System.out.println("your precentage is"+ per);
        System.out.println("your division is"+ div);
        System.out.println("thank you sir");
        
    }
}
