import java.awt.*;  
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class FifthFrame 
{
	private JFrame f = new JFrame("Withdraw");
    Connection con;
    Statement s;
    //JFrame frame = new JFrame();
    
    public FifthFrame ()
    {
        Font font3 = new Font("SansSerif", Font.PLAIN,  15);
        Font font2 = new Font("SansSerif", Font.ITALIC,  15);
        Font font4 = new Font("SansSerif", Font.PLAIN, 30);


        Label l1 = new Label("H.A.S Bank Money Deposit");
        l1.setBounds(70, 60, 1000, 70);
        l1.setFont(font4);

        Label l2 = new Label("*required fields. Fill the form carefully");
        l2.setBounds(70, 120, 1000, 70);
        l2.setFont(font2);


        Label u=new Label();
        u.setBounds(50, 210, 225, 25);
        u.setText("Registered Mobile Number*");
        u.setFont(font3);


        Label u1=new Label();
        u1.setBounds(50, 250, 225, 25);
        u1.setText("Enter OTP*");
        u1.setFont(font3);


        Label u2=new Label();
        u2.setBounds(50, 330, 225, 25);
        u2.setText("Total Amount*");
        u2.setFont(font3);

        Label u3=new Label();
        u3.setBounds(50, 370, 225, 25);
        u3.setText("Amount*");
        u3.setFont(font3);

        Label u4=new Label();
        u4.setBounds(50, 410, 225, 25);
        u4.setText("Amount Deposited: ");
        u4.setFont(font3);

        Label u5=new Label();
        u5.setBounds(50, 450, 225, 25);
        u5.setText("Total Amount: ");
        u5.setFont(font3);


        TextField p=new TextField();
        p.setBounds(310, 210, 350, 25);
        p.setFont(font3);

        TextField p1=new TextField();
        p1.setBounds(310, 250, 350, 25);
        p1.setFont(font3);


        JRadioButton  cb1 = new JRadioButton("Savings");
        cb1.setBounds(310, 290, 100, 25);
        cb1.setFont(font3);

        JRadioButton  cb2 = new JRadioButton("Current");
        cb2.setBounds(420, 290, 100, 25);
        cb2.setFont(font3);


        TextField p2=new TextField();
        p2.setBounds(310, 330, 350, 25);
        p2.setFont(font3);

        TextField p3=new TextField();
        p3.setBounds(310, 370, 350, 25);
        p3.setFont(font3);

        TextField p4=new TextField();
        p4.setBounds(310, 410, 350, 25);
        p4.setFont(font3);

        TextField p5=new TextField();
        p5.setBounds(310, 450, 350, 25);
        p5.setFont(font3);

        JButton m=new JButton("Enter");
        m.setBounds(690, 210, 110, 25);
        m.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog( null, "OTP sent!");
            }
        });


        JButton g=new JButton("Continue"); 
            g.setBounds(230, 620, 150, 30);  
            g.setSelected(true);
            g.addActionListener(new ActionListener()
             {   
                 public void actionPerformed(ActionEvent e)
                    {  
                        int dialogButton = JOptionPane.YES_NO_OPTION;
                        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "H.A.S Bank Money Deposit", dialogButton);
                        if(dialogResult == 0) 
                        {
                          System.out.println("Continue");
                        } 
                        else
                        {
                          System.out.println("Cancel");
                        }

                        int a= Integer.parseInt(p2.getText());
                        int b= Integer.parseInt(p3.getText());
                        int c=0;
                        if(e.getSource().equals(g))
                        {
                            c=a+b;
                            p5.setText(String.valueOf(+c));
                            p4.setText(String.valueOf(+b));

                        }
                    }
            });  

        JButton d=new JButton("Back"); 
        d.setBounds(230, 670, 150, 30);  
        d.setSelected(true);
        d.addActionListener(new ActionListener()
         {   
             public void actionPerformed(ActionEvent e)
                {  
                 f.dispose();
                 new OBank();
        }  
        });


        f.add(l1);
        f.add(l2);
        f.add(u);
        f.add(u1);
        f.add(cb1);
        f.add(u2);
        f.add(u3);
        f.add(u4);
        f.add(u5);
        f.add(m);

        f.add(p2);
        f.add(p);
        f.add(p1);
        f.add(cb2);
        f.add(p3);
        f.add(p4);
        f.add(p5);
        f.add(d);
        f.add(g);

    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(1000, 1000);  
    f.setLayout(null);  
    f.setVisible(true);   
    }

    public void conn()
    {
        try
        {
            con = DriverManager.getConnection("jdbc:mysql:/var/lib/mysql/customer", "root", "ricky1234");
            s = con.createStatement();
        } catch (SQLException e)
        {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }
}