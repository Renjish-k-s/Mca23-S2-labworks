class T1 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
            {
                
                try
                {
                    System.out.println(i);
                    sleep(1000);
                }
                catch(Exception ex){System.out.println(ex);}
            }
    }
}

class T2 extends Thread
{
    public void run()
    {
         for(int i=5;i<10;i++)
            {
                
                try
                {
                    System.out.println(i);
                    sleep(1010);
                }
                 catch(Exception ex){System.out.println(ex);}
            }
    }
}

class theadeg 
{
    public static void main(String[] arg)
    {
        T1 t1 = new T1();
        T2 t2 = new T2();

        t1.start();
        t2.start();
    }
}