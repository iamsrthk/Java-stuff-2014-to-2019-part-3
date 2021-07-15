package if_programs;


public class mks
{
    void main( int mks)
    {
        if(mks>=75&&mks<=100)
            System.out.println("distinction");
        else if(mks>=65&&mks<=74)
            System.out.println("1 class");
        else if(mks>=55&&mks<=64)
            System.out.println("2 class");
        else if(mks>=45&&mks<=64)
            System.out.println("3 class");
        else if(mks>=0&&mks<=44)
        System.out.println("fail");
        else
         System.out.println("invalid");
        
    }
}
