class cpu
{
    class proccessor
    {
        void printp()
        {
            System.out.println("NO. OF CORES=8");
            System.out.println("MANFACTURER:AZUZ");
        }
    }
    class RAM
    {
        void printr()
        {

        System.out.println("MEMORY=8GB");
        System.out.println("MANFACTURER:INTEL");

        }
    }
}
class nestedclass
{
    public static void main(String[] args)
    {
        cpu out = new cpu();
        cpu.proccessor in = out.new proccessor();
        in.printp();
    }
    
}