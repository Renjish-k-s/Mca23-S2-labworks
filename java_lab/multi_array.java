import java.util.Scanner;
class multi_array
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int[][] mat1= new int[10][10];
        int[][] mat2= new int[10][10];
       // int[][] res= new int[10][10];

        System.out.println("------------------------Enter the first matrix------------------------------");   
            for(int i=0;i<2;i++)
                for(int j=0;j<2;j++)
                    mat1[i][j]=s.nextInt();
        System.out.println("------------------------Enter the second matrix------------------------------");   
            for(int i=0;i<2;i++)
                for(int j=0;j<2;j++)
                    mat2[i][j]=s.nextInt();

     System.out.println("---------------------Resultant matrix after addition---------------------------------");    
             for(int i=0;i<2;i++)
             {
                for(int j=0;j<2;j++)
                {
                    System.out.print(mat1[i][j]+mat2[i][j]);
                }        
                System.out.println();          
             }
               
 
    }
}