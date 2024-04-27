import java.util.Scanner;

class employee
{
    Scanner s = new Scanner(System.in);
    int eid,salary;
    String ename;

    employee()
    {
        System.out.println("ENTER THE EMPLOYEE NO.");
        this.eid =s.nextInt();
        s.nextLine();
        System.out.println("ENTER THE EMPLOYEE NAME");
        this.ename =s.nextLine();

        System.out.println("ENTER THE EMPLOYEE SALARY");
        this.salary=s.nextInt();

    }

    void display()
    {
        System.out.println("----------------------------------------");
        System.out.println("Employee Number::"+eid);
        System.out.println("Employee Name  ::"+ename);
        System.out.println("Employee Salary::"+salary);
    }
}


public class program8 {

  
   
    public static void main(String[] arg)
    {
        Scanner s = new Scanner(System.in);
        int eno;
        System.out.println("ENTER THE NO. OF EMPLOYEES");
        eno=s.nextInt();

        employee emp[] = new employee[eno];

        for(int i=0;i<eno;i++)
        {
            emp[i]=new employee();
        }

        // for(int i=0;i<eno;i++)
        // {
        //     emp[i].display();
        // }
        int choice;
        int i=0;
        while (i==0) {

            System.out.println("----------------------------------------");
            System.out.println("MENU \n 1.SEARCH EMPLOYEE \n 2.EXIT");
            choice=s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the employee no.");
                    int enos=s.nextInt();
                    emp[enos].display();
                    break;
                case 2:
                    System.out.println("Exiting....... \n Exited");
                    i=1; 
                    break;
            
                default:
                    System.out.println("INVALID OPTION");
                    break;
            }
           
            
        }
    }
    
}
