import java.util.Scanner;
interface prototype
{
    public void area();
    public void perimeter();
}

class circle implements prototype
{
    int r;
    circle(int r)
    {
        this.r=r;
    }
    public void area()
    {
        System.out.println("Area of circle::"+3.14*r*r);
    }

    public void perimeter()
    {
        System.out.println("Perimeter of circle::"+2*3.14*r);
    }
}

class rectangle implements prototype
{
    int l,b;
    rectangle(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    public void area()
    {
        System.out.println("Area of rectangle::"+l*b);
    }

    public void perimeter()
    {
        System.out.println("Perimeter of rectangle::"+2*(l+b));
    }
}

public class program11 {


    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
            circle c;
            rectangle r ;
            int i=0;

            while(i==0)
            {
                System.out.println("MENU \n1.Area or Perimeter of circle\n2.Area or Perimeter of Rectangle\n3.Exit");
                int ch =s.nextInt();

                switch (ch) {
                    case 1:
                        System.out.println("Enter the radius of circle");
                        int ra = s.nextInt();
                        c=new circle(ra);
                        System.out.println("1.Area\n2.Perimeter");
                        int sh=s.nextInt();
                        switch (sh) {
                                    case 1:
                                        c.area();
                                        break;
                                    case 2:
                                        c.perimeter();
                                        break;
                                    }
                        break;
                    case 2:
                        System.out.println("Enter the length");
                        int l = s.nextInt();
                        System.out.println("Enter the breadth");
                        int b = s.nextInt();
                        r= new rectangle(l, b);
                        System.out.println("1.Area\n2.Perimeter");
                        int rh=s.nextInt();
                        switch (rh) {
                                    case 1:
                                        r.area();
                                        break;
                                    case 2:
                                        r.perimeter();
                                        break;
                                    }
                        break;
                    case 3:
                        i=0;
                        break;
                }
            }
    }
    
}
