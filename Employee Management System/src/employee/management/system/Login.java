package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JTextField tfusername, tfpassword;
    
    Login() {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblusername = new JLabel("Username:");
        lblusername.setFont(new Font("Montserrat", Font.BOLD, 16));
        lblusername.setBounds(40, 20, 100, 30);
        add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setFont(new Font("Montserrat", Font.PLAIN, 16));
        tfusername.setBounds(150, 20, 150, 30);
        tfusername.setToolTipText("Enter your username");
        add(tfusername);
        
        JLabel lblpassword = new JLabel("Password:");
         lblpassword.setFont(new Font("Montserrat", Font.BOLD, 16));
        lblpassword.setBounds(40, 70, 100, 30);
        add(lblpassword);
        
        tfpassword = new JPasswordField();
         tfpassword.setFont(new Font("Montserrat", Font.PLAIN, 16));
        tfpassword.setBounds(150, 70, 150, 30);
        tfpassword.setToolTipText("Enter your Password");
        add(tfpassword);
        
        JButton login = new JButton("LOGIN");
        Font customFont = new Font("Montserrat", Font.BOLD, 16); 
        login.setFont(customFont);
        login.setBounds(150, 140, 150, 30);
        Color customColor = new Color(0x121149);
        login.setBackground(customColor);


        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/LOGIN.PNG"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);
        
        setSize(600, 250);
        setLocation(450, 200);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        try {
            String username = tfusername.getText();
            String password = tfpassword.getText();
            
            Conn c = new Conn();
            String query = "select * from login where username = '"+username+"' and password = '"+password+"'";
            
            ResultSet rs = c.s.executeQuery(query);
            if (rs.next()) {
                 setVisible(false);  // Hide the login window
                 Home home = new Home();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password");
                //setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}

