import  java.util.Scanner;
class p2_3object
{
    Scanner s = new Scanner(System.in);
    int pcode;
    String name;
    int price;
    public static void main(String args[])
    {

        line();
        p2_3object p1 = new p2_3object();
        p1.takevalue(); 
        
        line();
        p2_3object p2 = new p2_3object();
        p2.takevalue(); 

        line();
        p2_3object p3 = new p2_3object();
        p3.takevalue(); 


        line();

        p2_3object lessprice=p1;
        
        if (p2.price<lessprice.price) 
        {
            lessprice=p2;
        }
        if (p3.price<lessprice.price)
        {
            lessprice=p3;
        }

        lessprice.output();

    }

    void takevalue()
    {
        System.out.println("Enter the product code");
        pcode=s.nextInt();
        s.nextLine();
        System.out.println("Enter the product name");
        name=s.nextLine();
        System.out.println("Enter the price");
        price=s.nextInt();

    }
    void output()
    {
        line();
        System.out.println("Enter the product code: "+pcode);
        

        System.out.println("Enter the product name: "+name);
        
        System.out.println("Enter the price: "+price);
        
    }

    static void line()
    {
        System.out.println("____________________****************___________________________");
    }
}