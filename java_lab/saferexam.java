import java.util.*;



public class saferexam {

    public static void main(String[] args)
    {
        int j;
        Scanner s = new Scanner(System .in);
        System.out.println("enter the no. of products");
        int nop= s.nextInt();
        s.nextLine();

        String[][] arr = new  String[nop][2];
        int total=0;

        for(int i = 0;i<nop;i++)
        {
            j=0;
            System.out.println("Enter the name of product");
            arr[i][j]=s.nextLine();
            System.out.println("Enter the price of product");
            arr[i][j+=1]=s.nextLine();
            total += Integer.parseInt(arr[i][j]);       
        }

        System.out.println("-------------------Final bill----------------------------");
        System.out.println("slno-------product_name----------------price"); 
        for(int i = 0;i<nop;i++)
        {
            j=0;
        System.out.println(i+"--------"+arr[i][j]+"---------"+arr[i][j+=1]);          
        }

        System.out.println("-----------Grand total  "+total+"/-");
    }

    
}
