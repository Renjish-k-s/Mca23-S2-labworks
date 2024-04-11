import java.util.Scanner;
class cpu
{
    Scanner s =new Scanner(System.in);
    int price;
    String cname;

                void getdetails()
                        {
                            System.out.println("Enter the Cpu model name:");
                            cname=s.nextLine();
                            System.out.println("Enter the price:");
                            price=s.nextInt();
                        }

                void printdetails()
                        {
                            System.out.println("Cpu model name:"+cname);
                            System.out.println("Price of CPU:"+price+"$");
                        }



                        class processor
                        {
                            Scanner s =new Scanner(System.in);
                            int cores;
                            String name;
                        void getdetails()
                                {
                                    System.out.println("Enter the no. cores");
                                    cores=s.nextInt();
                                    s.nextLine();
                                    System.out.println("Enter the processor manufacturer name");
                                    name=s.nextLine();
                                }
                        void printdetails()
                                {

                                    System.out.println("No.of cores:"+cores);
                                    System.out.println("Processor manufacturer name:"+name);
                                }
                            
                        }

                        static class ram
                        {
                            Scanner s =new Scanner(System.in);
                            String mname;
                            int memory;

                            void getdetails()
                                {
                                    System.out.println("Enter the memory space");
                                    memory=s.nextInt();
                                    s.nextLine();
                                    System.out.println("Enter the ram manufacturer name");
                                    mname=s.nextLine();
                                }
                            void printdetails()
                                {
                                System.out.println("Memory:"+memory+"GB");
                                System.out.println("Ram manufacturer name:"+mname);
                                }
                        }
}
class program5
{
    public static void main(String args[])
    {
        cpu c = new cpu();
        cpu.processor p = c.new processor();
        cpu.ram r = new cpu.ram();
        c.getdetails();      
        p.getdetails();       
        r.getdetails();
        System.out.println("-----------------------------------------------------------------------------------------");
        c.printdetails();
        p.printdetails();       
        r.printdetails();

    }
}