package switch_case;



public class switch_3
{
    void main(char ch)
    {
        switch(ch)
        {
            case'a':case'e':case'i':case'o':case'u':
            case'A':case'E':case'I':case'O':case'U':
            System.out.println("vowels");
            break;
            default:
            System.out.println("consonents");
        }
    }
}
