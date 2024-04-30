import java.util.*;
class numbercheckexception extends Exception
{
    public numbercheckexception(String str)
    {
            super(str);
    }
}

class pogram14
{
    static void validate(int n) throws numbercheckexception
    {
        if(n<0)
            throw new numbercheckexception("negative number not possible");
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = s.nextInt();
        int n;
        int i=0;
        while(i<limit)
        {
            n=s.nextInt();
            try
            {
                validate(n);
            }
            catch(numbercheckexception ex)
            {
                System.out.println(ex);
            }
            i++;
        }

    }
}