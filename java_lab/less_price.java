import java.util.Scanner;
class less_price
{   
    public static void main(String args[])
    {
            take t = new take();
            t.take_value();
          
            take t2 = new take();
            t2.take_value();
            
            take t3 = new take();
            t3.take_value();
            
           take less= t;
           if(t2.price<less.price)
           {
                less=t2;
           }               
           if(t3.price<less.price)
           {
                less=t3;
           }
            less.output();
    }
}
class take
{
    int pid;
    String pname;
    int price;
    Scanner s = new Scanner(System.in);
    void take_value()
    {
        System.out.println("product code");
        pid=s.nextInt();
        s.nextLine();
        System.out.println("product name");
        pname=s.nextLine();
        System.out.println("product price");
        price=s.nextInt();
    }

    void output()
    {
        System.out.println(pid);
        System.out.println(pname);
        System.out.println(price);
    }
}