import java.util.Scanner;

class costumized extends Exception
{
    public costumized(String str)
    {
        super(str);
    }
}



public class pogram13 {


    static void validate(String usercheck,String passcheck) throws costumized
    {
        final String password="password";
        final String username="username";
        if(usercheck != username || password!=passcheck)
        {
            throw new costumized("Incorrect username or password");
        }

        else
        {
            System.out.println("Logged in");
        }
    }
    public static void main(String[] arg)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the username");
        String username = s.nextLine();
        System.out.println("enter the password");
        String password = s.nextLine();

        try
        {
            validate(username,password);
        }
        catch(costumized ex)
        {
            System.out.println(ex);
        }
        


    }
    
}
