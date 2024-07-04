import java.awt.*;
import java.awt.event.*;
public class calculator extends Frame implements ActionListener
{
    TextField t1,t2,res;
    Label lb1,lb2,lb3;
    Button a,m,d,s;

    calculator()
    {
        setLayout(new FlowLayout());
         
         //set the text field
         t1=new TextField(10);
         t2=new TextField(10);
         res=new TextField(10);

         lb1=new Label("Enter first number");
         lb2=new Label("Enter second number");
         lb3=new Label("result");

         a=new Button("+");
         s=new Button("-");
         d=new Button("/");
         m=new Button("*");

         add(lb1);
         add(t1);

         add(lb2);
         add(t2);

         add(a);
         add(s);
         add(d);
         add(m);

         add(lb3);
         add(res);


         t1.setText("");
         t2.setText("");

         a.addActionListener(this);
         s.addActionListener(this);
         d.addActionListener(this);
         m.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae)
    {
            int a1,b1;

            if(ae.getSource()==a)
            {
                a1=Integer.parseInt(t1.getText());
                b1=Integer.parseInt(t2.getText());
        
                res.setText(String.valueOf(a1+b1));
            }
             if(ae.getSource()==s)
            {
                a1=Integer.parseInt(t1.getText());
                b1=Integer.parseInt(t2.getText());
        
                res.setText(String.valueOf(a1-b1));
            }

            if(ae.getSource()==m)
            {
                a1=Integer.parseInt(t1.getText());
                b1=Integer.parseInt(t2.getText());
        
                res.setText(String.valueOf(a1*b1));
            }
             if(ae.getSource()==d)
            {
                a1=Integer.parseInt(t1.getText());
                b1=Integer.parseInt(t2.getText());
                if(b1>0)
                {
                res.setText(String.valueOf(a1/b1));
                }
                else
                {
                    res.setText(String.valueOf("not possible"));
                }
            }



        
    }

    public static void main(String[] arg)
    {
        calculator cal=new calculator();
        cal.setSize(200,300);
        cal.setVisible(true);

            cal.addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent e)
                {
                    System.exit(0);

                }
            });
    }
}