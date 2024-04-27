import java.util.Scanner;
class overload
{
    void area(int r)
    {
        System.out.println("Area of Circle::"+3.14*(r*r));
    }
    void area(int l,int b)
    {
        System.out.println("Area of Rectangle::"+l*b);
    }
    void area(double a)
    {
        System.out.println("Area of Square::"+a*a);
    }
}

public class program9 {

    public static void main(String[] args)
    {

        Scanner s =new Scanner(System.in);
       int i=0;

       overload over = new overload();

       while(i==0)
       {
        System.out.println("MENU \n 1.Area of circle \n 2.Area of rectangle \n 3.Area of square \n 4.Exit");
        int ch = s.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("enter the radius(integer value)");
                    int r= s.nextInt();
                    over.area(r);
                    break;
                case 2:
                    System.out.println("enter the length");
                    int l= s.nextInt();
                    System.out.println("enter the breadth");
                    int b= s.nextInt();
                    over.area(l,b);
                    break;
                case 3:
                    System.out.println("enter the side length");
                    double sl= s.nextDouble();
                    over.area(sl);
                    break;
                case 4:
                    System.out.println("Exiting....... \n Exited");
                    i=1; 
                    break;
                default:
                    System.out.println("INVALID OPTION");
                    break;

            }
       }
    }
    
}
