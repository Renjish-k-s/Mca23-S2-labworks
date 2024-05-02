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
                if(n<0)
                {
                    throw new numbercheckexception("not possible,it is a negetive number");
                }
            }
            catch(numbercheckexception ex)
            {
                System.out.println(ex);
            }
            i+=1;
        }

    }
}