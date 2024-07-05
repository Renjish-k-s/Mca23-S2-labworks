import java.io.*;
import java.util.*;

public class file_opt
{
    public static void writerFun()
    {
    Scanner s = new Scanner(System.in);

    String filename ="contact.txt";

    int limit,i;

    System.out.println("enter the number of words to feed");
    limit=s.nextInt();
    s.nextLine();

    try(BufferedWriter writer =new BufferedWriter(new FileWriter(filename,true)))
    {
    System.out.println("Enter the"+limit+"no. of words");
    for(i=0;i<limit;i++)
    {
        writer.write(s.nextLine()+"\n");
        //System.out.println();   
    }

    writer.close();
    System.out.println("Data inserted Successsfully");
    }
    catch(IOException ex)
    {
        System.out.println(ex);
    }
    }


    public static void readfun()
    {
        String filename ="contact.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(filename)))
        {
            String line ;
            int i=0;
            while((line=br.readLine())!=null)
            {
                if(i==0)
                    System.out.println("CONTENT IN FILE IS\n--------------------------------");
                i+=1;
                System.out.println("line no"+i+": "+line);
            }

            if (i==0)
                System.out.println("File is empty");
            else
                System.out.println("\n"+i+"no. line found");
        }
        catch(IOException ex)
        {
            System.out.println(ex);
        }
    }

    public static void main(String[] arg)
    {
        Scanner s = new Scanner(System.in);

        boolean i = true;

        while(i)
        {
          System.out.println("\nMenu \n 1.Insert new \n 2.Read the file \n 3.Exit");
          int ch = s.nextInt();

          switch(ch)
          {
            case 1:
                writerFun();
                break;
            case 2:
                readfun();
                break;
            case 3:
                i=false;
                System.out.println("Exiting....");
                break;
          }
        }
    

    }
}