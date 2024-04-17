class outer
{
    class  inner{

        void fun()
        {
            System.out.println("finctioon fun");
        }
        static void fun2()
        {
            System.out.println("ststic funcctionkkccbs");

        }

    }
}



public class innerclass {

    public static void main(String[] args)
    {
        outer out = new outer();
        outer.inner in = out.new inner();
        in.fun();
        outer.inner.fun2();
       
    }
    
}
