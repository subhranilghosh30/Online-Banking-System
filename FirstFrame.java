
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class FirstFrame
{
    Button b1;
    TextField t1, t2;
    Label l1, l2, l3;
    Frame f;
    public FirstFrame()
    {
        f=new Frame("Add Two Numbers");
        l1=new Label("Enter First Number");
        l1.setBounds(5,50,150,30);
        f.add(l1);

        t1=new TextField();
        t1.setBounds(200, 50, 150, 30);
        f.add(t1);

        l2=new Label("Enter Second Number");
        l2.setBounds(5,80,150,30);
        f.add(l2);

        t2=new TextField();
        t2.setBounds(200, 80, 150, 30);
        f.add(t2);


        l3=new Label("Results:");
        l3.setBounds(90,140,150,30);
        f.add(l3);

        b1=new Button("ADD");
        b1.setBounds(90,200,100,30);
        f.add(b1);

        b1.addActionListener((ActionListener) this);
        f.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });

        JButton c = new JButton("Back");
        c.setBounds(450, 820, 150, 30);
        c.setSelected(true);
        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new OBank();
            }
        });
        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        int a= Integer.parseInt(t1.getText());
        int b= Integer.parseInt(t2.getText());
        int c=0;
        if(e.getSource().equals(b1))
        {
            c=a+b;
            l3.setText(String.valueOf("Results: "+c));
        }
    }

    public static void main(String args[])
    {
        new FirstFrame();
    }
}
