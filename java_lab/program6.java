import java.util.Arrays;
import java.util.Scanner;

class program6
{
   
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        System.out.println("enter the no. of strings");
        int size= s.nextInt();

        String[] arr = new String[size+1];
        
        for(int i=0;i<=size;i++)
            arr[i]= s.nextLine();

        System.out.println("Before sort");
        for(int i=0;i<=size;i++)
            System.out.println(arr[i]);

        Arrays.sort(arr);

        System.out.println("After sort");
        for(int i=0;i<=size;i++)
            System.out.println(arr[i]);
            
    }
}

