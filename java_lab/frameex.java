import java.awt.*;
import java.awt.event.*;

public class frameex extends Frame implements ActionListener
{
    TextField t1,t2,t3,t4;
    Label lb1,lb2,lb3,lb4;
    Button b1;
    frameex(){
        setLayout(new FlowLayout());

        //field declaration
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        t4=new TextField(10);


        //label declaration
        lb1=new Label("First no.");
        lb2=new Label("second no.");
        lb3=new Label("Third no.");
        lb4=new Label("larger no.");

        b1=new Button("check");

        //adding to the page order

        add(lb1);
        add(t1);

        add(lb2);
        add(t2);

        add(lb3);
        add(t3);

        add(b1);
        add(lb4);
        add(t4);

        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");

        b1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae)
    {
        int a,b,c,res;
        if(ae.getSource()==b1)
        {
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t2.getText());
            c=Integer.parseInt(t3.getText());
            res=b;
            if(a>res)
            {
                res=a;
            }
            if(c>res)
            {
                res=c;
            }
            t4.setText(String.valueOf(res));
        }
    }

    public static void main(String[] args)
    {
        frameex obj=new frameex();
        obj.setTitle("compare");
        obj.setSize(200,300);
        obj.setVisible(true);
    }
}