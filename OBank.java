import java.lang.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout.Group;

public class OBank
{
        Connection con;
    Statement s;

      public OBank()
      {
        Font font1 = new Font("SansSerif", Font.BOLD, 60);
        Font font2 = new Font("SansSerif", Font.ITALIC, 25);
        Font font4 = new Font("SansSerif", Font.PLAIN, 30);


        JFrame f = new JFrame("H . A . S Bank");

        Label l1 = new Label(" Welcome to the H.A.S Bank ");
        l1.setBounds(500, 50, 1000, 100);
        l1.setFont(font1);

        Label l2 = new Label("Thank you for trusting H.A.S Bank. We are serving 3.6 million people since 1960, having several brancehes all over India.");
        l2.setBounds(50, 150, 2000, 40);
        l2.setFont(font2);

        Label l3 = new Label("It will be a great honour and privilege to serve you.");
        l3.setBounds(50, 180, 1000, 50);
        l3.setFont(font2);

        Label l4 = new Label("Our bank staff, welcomes you to Your H.A.S family!!");
        l4.setBounds(50, 250, 1000, 30);
        l4.setFont(font2);


        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);


        JButton b = new JButton("Create Account");
        b.setBounds(30, 350, 500, 55);
        //b.setSelected(true);
        b.setFont(font4);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new SecondFrame();
                //conn();
            }
        });

        JButton a = new JButton("Money Transfer");
        a.setSelected(true);
        a.setBounds(30, 410, 500, 55);
        a.setFont(font4);
        a.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new ThirdFrame();
                }
        });

        JButton m = new JButton("Money Withdraw");
        m.setSelected(true);
        m.setBounds(30, 470, 500, 55);
        m.setFont(font4);
        m.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new FourthFrame();
            }
        });

        JButton n = new JButton("Money Deposit");
        n.setSelected(true);
        n.setBounds(30, 530, 500, 55);
        n.setFont(font4);
        n.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new FifthFrame();
                //conn();
            }
        });


        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);

        f.add(b);
        f.add(a);
        f.add(m);
        f.add(n);

        f.setSize(2000, 1000);
        f.setLayout(null);
        f.setVisible(true);
    }

   /* public void conn()
    {
        try
        {
            con=DriverManager.getConnection("jdbc:mysql:/var/lib/mysql/customer", "root", "ricky1234");
            s=con.createStatement();
        }
        catch(SQLException e)
        {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }*/

    public static void main(String[] args)
    {
        OBank n = new OBank();
    }

}
