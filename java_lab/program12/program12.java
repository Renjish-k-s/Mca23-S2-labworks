import areaofshapes.*;
import java.util.*;

/**
 * program12
 */
public class program12 {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int i=0;
        area a = new area();
       

        while (i==0) {
            
            System.out.println("MENU FOR AREA \n 1.circle \n 2.rectangle  \n 3.triangle5 \n 4.square \n 5.Exit");
            int ch = s.nextInt();

            switch (ch) {
                case 1:
                System.out.println("enter the radius of the circle");
                int r=s.nextInt();
                System.out.println(a.circle(r));               
                break;
                case 2:
                System.out.println("enter the length");
                int l=s.nextInt();
                System.out.println("enter the breadth");
                int b=s.nextInt();
                System.out.println(a.rectangle(l,b));               
                break;
                case 3:
                System.out.println("enter the hypotnuse");
                int h=s.nextInt();
                System.out.println("enter the breadth");
                int br=s.nextInt();
                System.out.println(a.triangle(h,br));               
                break;
                case 4:
                System.out.println("enter the side of square");
                int side=s.nextInt();
                System.out.println(a.square(side));               
                break;
                case 5:
                i=1;
                break;
            
                default:
                    break;
            }
        }

    }
}