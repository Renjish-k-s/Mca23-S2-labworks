class base
{
    String name;
    int age;

    base(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void printx()
    {
        System.out.println("name"+name);
        System.out.println("age"+age);

    }
}
class child extends base
{
    String batch;

    child(String name,int age,String batch)
    {
        super(name,age);
        this.batch=batch;

    }
    void printx()
    {
        super.printx();
        System.out.println("batch"+batch);

    }
}
public class inher {

    public static void main(String[] args)
    {
        child ch =new child("ram",21,"MCA");
        ch.printx();
    }
    
}
