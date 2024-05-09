class f1 extends Thread
{
    public void run()
    {
        int n=30;
        int fib1=0;
        int fib2=1;
        System.out.print(fib1+" ");
        try
        {
        while(fib2<=n)
        {
            System.out.print(fib2+" ");
            int fib=fib1+fib2;
            fib1=fib2;
            fib2=fib;

               // sleep(1000);
        }
        }catch(Exception ex){System.out.println();}
    }
}

class f2 extends Thread
{
    public void run()
    {
        int n=30;
        try
        {
for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
             // sleep(1000);
        }
        }catch(Exception ex){System.out.println();}
        
        }
    }


class threadegx 
{
    public static void main(String[] arg)
    {
        f1 ff1 = new f1();
        f2 ff2 = new f2();

       
        ff2.start();
 ff1.start();

    }
}