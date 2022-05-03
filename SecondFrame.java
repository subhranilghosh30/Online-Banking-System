import com.mysql.cj.conf.BooleanPropertyDefinition;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;


public class SecondFrame {
    Connection con;
    Statement s;
    public JFrame f = new JFrame("Create Account");

    public SecondFrame() {


        Font font3 = new Font("SansSerif", Font.PLAIN, 15);
        Font font2 = new Font("SansSerif", Font.ITALIC, 15);
        Font font4 = new Font("SansSerif", Font.PLAIN, 30);

        Label l1 = new Label("H.A.S Bank Account Creation Form");
        l1.setBounds(70, 60, 1000, 70);
        l1.setFont(font4);

        Label l2 = new Label("*required fields. Fill the form carefully");
        l2.setBounds(70, 120, 1000, 70);
        l2.setFont(font2);


        Label tf = new Label();
        tf.setBounds(50, 210, 160, 25);
        tf.setText("First Name*");
        tf.setFont(font3);

        Label tf1 = new Label();
        tf1.setBounds(50, 250, 160, 25);
        tf1.setText("Last Name*");
        tf1.setFont(font3);


        Label tf2 = new Label();
        tf2.setBounds(50, 290, 160, 25);
        tf2.setText("Mobile Number*");
        tf2.setFont(font3);


        Label tf3 = new Label();
        tf3.setBounds(50, 330, 160, 25);
        tf3.setText("Age*");
        tf3.setFont(font3);

        Label tf4 = new Label();
        tf4.setBounds(50, 370, 160, 25);
        tf4.setText("Gender*");
        tf4.setFont(font3);

        Label tf5 = new Label();
        tf5.setBounds(50, 410, 160, 25);
        tf5.setText("Date of Birth*");
        tf5.setFont(font3);

        Label tf6 = new Label();
        tf6.setBounds(50, 450, 160, 25);
        tf6.setText("Aadhar Card*");
        tf6.setFont(font3);

        Label tf7 = new Label();
        tf7.setBounds(50, 490, 160, 25);
        tf7.setText("Marital Status*");
        tf7.setFont(font3);

        Label tf8 = new Label();
        tf8.setBounds(50, 530, 160, 25);
        tf8.setText("Father's Name*");
        tf8.setFont(font3);

        Label tf9 = new Label();
        tf9.setBounds(50, 570, 160, 25);
        tf9.setText("Mother's Name*");
        tf9.setFont(font3);

        Label tf10 = new Label();
        tf10.setBounds(50, 610, 160, 25);
        tf10.setText("Nationality*");
        tf10.setFont(font3);

        Label tf11 = new Label();
        tf11.setBounds(50, 650, 160, 25);
        tf11.setText("Occupation*");
        tf11.setFont(font3);

        Label tf12 = new Label();
        tf12.setBounds(50, 700, 160, 25);
        tf12.setText("Address*");
        tf12.setFont(font3);

        Label tf13 = new Label();
        tf13.setBounds(780, 290, 50, 25);
        tf13.setText("Code");
        tf13.setFont(font3);


        TextField t = new TextField();
        t.setBounds(230, 210, 350, 25);
        t.setFont(font3);
        t.setText(" ");


        TextField t1 = new TextField();
        t1.setBounds(230, 250, 350, 25);
        t1.setFont(font3);
        t1.setText(" ");


        TextField t2 = new TextField();
        t2.setBounds(230, 290, 350, 25);
        t2.setFont(font3);
        t2.setText(" ");


        TextField t3 = new TextField();
        t3.setBounds(230, 330, 350, 25);
        t3.setFont(font3);
        t3.setText(" ");


        JRadioButton cb1 = new JRadioButton("Male");
        cb1.setBounds(230, 370, 170, 25);
        cb1.setFont(font3);

        JRadioButton cb2 = new JRadioButton("Female");
        cb2.setBounds(400, 370, 170, 25);
        cb2.setFont(font3);


        JRadioButton cb3 = new JRadioButton("Others");
        cb3.setBounds(570, 370, 170, 25);
        cb3.setFont(font3);


        TextField t4 = new TextField();
        t4.setBounds(230, 410, 350, 25);
        t4.setFont(font3);
        t4.setText(" ");


        TextField t5 = new TextField();
        t5.setBounds(230, 450, 350, 25);
        t5.setFont(font3);
        t5.setText(" ");


        TextField t6 = new TextField();
        t6.setBounds(230, 490, 350, 25);
        t6.setFont(font3);
        t6.setText(" ");


        TextField t7 = new TextField();
        t7.setBounds(230, 530, 350, 25);
        t7.setFont(font3);
        t7.setText(" ");


        TextField t8 = new TextField();
        t8.setBounds(230, 570, 350, 25);
        t8.setFont(font3);
        t8.setText(" ");


        JCheckBox c1 = new JCheckBox("Indian");
        c1.setBounds(230, 610, 170, 25);
        c1.setFont(font3);

        JCheckBox c2 = new JCheckBox("Others");
        c2.setBounds(400, 610, 170, 25);
        c2.setFont(font3);


        TextField t9 = new TextField();
        t9.setBounds(570, 610, 170, 25);
        t9.setFont(font3);


        TextField t10 = new TextField();
        t10.setBounds(230, 650, 350, 25);
        t10.setFont(font3);
        t10.setText(" ");


        TextField t11 = new TextField();
        t11.setBounds(230, 690, 350, 25);
        t11.setFont(font3);
        t11.setText(" ");


        TextField t12 = new TextField();
        t12.setBounds(230, 720, 350, 25);
        t12.setFont(font3);
        t12.setText(" ");

        TextField t13= new TextField();
        t13.setBounds(850, 290, 110, 25);
        t13.setFont(font3);

        JCheckBox c3 = new JCheckBox("I agree to all the Terms and Condition");
        c3.setBounds(230, 750, 350, 25);
        c3.setFont(font3);

        f.add(l1);
        f.add(l2);
        f.add(tf);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(tf4);
        f.add(tf5);
        f.add(tf6);
        f.add(tf7);
        f.add(tf8);
        f.add(tf9);
        f.add(tf10);
        f.add(tf11);
        f.add(tf12);
        f.add(tf13);

        f.add(t);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(t4);
        f.add(t5);
        f.add(t6);
        f.add(t7);
        f.add(t8);
        f.add(c1);
        f.add(c2);
        f.add(t9);
        f.add(t10);
        f.add(t11);
        f.add(t12);
        f.add(c3);
        f.add(t13);

        JButton b = new JButton("Enter");
        b.setBounds(600, 290, 110, 25);
        b.setSelected(true);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null, "Verification Code Sent!");
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

        JButton g = new JButton("Submit");
        g.setBounds(230, 820, 150, 30);
        g.setSelected(true);
        g.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Submitted");
            }


        });


        f.add(c);
        f.add(g);
        f.add(b);


        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1000, 1000);
        f.setLayout(null);
        f.setVisible(true);
    }
}


    /*public void conn()
    {
       try
       {
          //Class.forName("com.mysql.jdbc.Driver");//con = DriverManager.getConnection(JdbcURL, Username, password);
          //con = DriverManager.getConnection("jdbc:mysql:/var/lib/mysql/customer", "ricky3010", "ricky@1234");

           con = DriverManager.getConnection("jdbc:mysql:/var/lib/mysql/customer","root", "book");
           System.out.println("Connected to MySQL database");
           s = con.createStatement();

        }
       catch (SQLException e) //| ClassNotFoundException e)
       {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }*/

