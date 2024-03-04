class p1_staticnonstatic
{
    public static void main(String a[])
    {
        static_function();
        p1_staticnonstatic p1 = new p1_staticnonstatic();
        p1.non_static_function();
        
    }

    static void static_function()
    {
        System.out.println("STATIC FUNCTION SUCESSFULLY WORKED");
    }
    void non_static_function()
    {
        System.out.println("NON STATIC FUNCTION SUCESSFULLY WORKED");
    }
}