class A 
{
    int x=10;
    void print()
    {
        System.out.println(x);
    }
  
    void same()
    {
        System.out.println("CLASS A ACCESSED");
    }
     
}
class B extends  A
{
    int x=1000;
    void show()
    {
        System.out.println(x);
    }

    void same()
    {
        super.same();  
        System.out.println("CLASS B ACCESSED");
    }
}


class inheritance
{
    public static void main(String[] args)
    {
        //System.out.println("fdfdf");
        A a=new A();
        B b=new B();
         
        b.print();
        b.show();       
        b.same(); 
        
    }
}