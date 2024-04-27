import java.util.Scanner;

class person
{
    Scanner s = new Scanner(System.in);
    String name,gender,age,address;
    person()
    {
        System.out.println("Enter the name");
        this.name=s.nextLine();
        s.nextLine();
        System.out.println("Enter the gender");
        this.gender=s.nextLine();
        System.out.println("Enter the address");
        this.address=s.nextLine();
        System.out.println("Enter the age");
        this.age=s.nextLine();
    }

    void display()
    {
        System.out.println("Nam    ::"+name);
        System.out.println("Gender ::"+gender);
        System.out.println("Address::"+address);
        System.out.println("Age    ::"+age);
    }
}
class employe extends person
{
    String empid,cname,qual,sal;
    employe()
    {
        super();
        System.out.println("Enter the Employee id");
        this.empid=s.nextLine();
        s.nextLine();
        System.out.println("Enter the Company name");
        this.cname=s.nextLine();
        System.out.println("Enter the Qualification");
        this.qual=s.nextLine();
        System.out.println("Enter the Salary");
        this.sal=s.nextLine();

    }
    void display()
    {
        super.display();
        System.out.println("Employee id  ::"+empid);
        System.out.println("Company name ::"+cname);
        System.out.println("Qualification::"+qual);
        System.out.println("Salary       ::"+sal);
    }
}

class teacher extends employe
{
    String sub,dept,tid;

    teacher()
    {
        super();
        System.out.println("Enter the Subject");
        this.sub=s.nextLine();
        s.nextLine();
        System.out.println("Enter the Department");
        this.dept=s.nextLine();
        System.out.println("Enter the Teacher Id");
        this.tid=s.nextLine();
        
    }
    void display()
    {
        super.display();
        System.out.println("Subject   ::"+sub);
        System.out.println("Department::"+dept);
        System.out.println("Teacher Id::"+tid);
        
    }
}


public class program10 {

    public static void main(String[] arg)
    {
        Scanner s = new Scanner(System.in);
        int n;
      

        System.out.println("enter the no. of teachers");
        n=s.nextInt();
        teacher teach[] = new teacher[n];
        
        for(int i=0;i<n;i++)
        {
            teach[i]=new teacher();
        }

        for(int i=0;i<n;i++)
        {
            System.out.println("-------------Displayed details----------------");
            teach[i].display();
        }



    }
    
}
