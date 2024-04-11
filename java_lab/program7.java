class program7
{
    public static void main(String args[])
    {
        String s1="hello hari how are you";
        String s2="hari";

        System.out.println("length of string 1: "+s1.length());
        System.out.println("cancatination: "+s1.concat(s2));
        System.out.println("string1 and string2 are equal: "+s1.equals(s2));
        System.out.println("string 1 in upper case: "+s1.toUpperCase());
        System.out.println("string 1 in lower case: "+s1.toLowerCase());
        System.out.println("string 1 is empty: "+s1.isEmpty());
        String[] arr= s1.split(" ");
         System.out.println("spliting string1:");
        for (String str : arr)
                System.out.print(str+",");

    }
}