import java.util.Scanner;
class takevalue
{
    Scanner s= new Scanner(System.in);
    int[][] temp= new int[10][10];

    int[][] take(int colrow)
    {
       
             for(int i=0;i<colrow;i++)
                for(int j=0;j<colrow;j++)
                    temp[i][j]=s.nextInt();
        return temp;
    }
   
    void add(int[][] mat1,int[][] mat2,int colrow)
    {
        
         for(int i=0;i<colrow;i++)
             {
                for(int j=0;j<colrow;j++)
                {
                    System.out.print(mat1[i][j]+mat2[i][j]+"\t");
                }        
                System.out.println();          
             }
    }
    

}
class multi_array_co
{
   

    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int[][] mat1= new int[10][10];
        int[][] mat2= new int[10][10];
        System.out.println("enter the no of rows and columns");
        int colrow=s.nextInt();

        takevalue t =  new takevalue();
        System.out.println("-------------------------------Enter the first matrix--------------------------------");
        mat1=t.take(colrow);
        System.out.println("-------------------------------Enter the second matrix-------------------------------");
        mat2=t.take(colrow);
        System.out.println("----------------------------------Addition-------------------------------------------");
        t.add(mat1,mat2,colrow);
    }
    
}