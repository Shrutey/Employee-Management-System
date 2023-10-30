package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class RemoveEmployee extends JFrame implements ActionListener {
    
    Choice cEmpId;
    JButton delete, back;
    JTextField tfname,tfphone, tfemail;
    
    RemoveEmployee() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel labelempId = new JLabel("Employee ID:");
        labelempId.setBounds(50, 50, 150, 30);
        labelempId.setForeground(Color.WHITE);
        labelempId.setFont(new Font("Montserrat", Font.PLAIN, 20));
        add(labelempId);
        
        cEmpId = new Choice();
        cEmpId.setBounds(200, 50, 150, 40);
        add(cEmpId);
        
        try {
            Conn c = new Conn();
            String query = "select * from Employee_record";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                cEmpId.add(rs.getString("Emp_ID"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        JLabel labelname = new JLabel("Name:");
        labelname.setBounds(50, 100, 100, 30);
        labelname.setFont(new Font("Montserrat", Font.PLAIN, 20));
        labelname.setForeground(Color.WHITE);
        add(labelname);
        
        tfname = new JTextField();
        tfname.setBounds(200, 100, 150, 30);
        add(tfname);
        
        JLabel lblname = new JLabel();
        lblname.setBounds(200, 100, 100, 30);
        add(lblname);
        
        JLabel labelphone = new JLabel("Phone:");
        labelphone.setBounds(50, 150, 100, 30);
        labelphone.setFont(new Font("Montserrat", Font.PLAIN, 20));
        labelphone.setForeground(Color.WHITE);
        add(labelphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(200, 150, 150, 30);
        add(tfphone);
        
     
        
        JLabel lblphone = new JLabel();
        lblphone.setBounds(200, 150, 100, 30);
       
        add(lblphone);
        
        JLabel labelemail = new JLabel("Email:");
        labelemail.setBounds(50, 200, 100, 30);
        labelemail.setFont(new Font("Montserrat", Font.PLAIN, 20));
        labelemail.setForeground(Color.WHITE);
        add(labelemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200, 200, 150, 30);
        add(tfemail);
        
        JLabel lblemail = new JLabel();
        lblemail.setBounds(200, 200, 100, 30);
        add(lblemail);
        
        try {
            Conn c = new Conn();
            String query = "select * from Employee_record where Emp_ID = '"+cEmpId.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                lblname.setText(rs.getString("Name"));
                lblphone.setText(rs.getString("Contact"));
                lblemail.setText(rs.getString("Email_ID"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        cEmpId.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                try {
                    Conn c = new Conn();
                    String query = "select * from Employee_record where Emp_ID = '"+cEmpId.getSelectedItem()+"'";
                    ResultSet rs = c.s.executeQuery(query);
                    while(rs.next()) {
                        lblname.setText(rs.getString("Name"));
                        lblphone.setText(rs.getString("Contact"));
                        lblemail.setText(rs.getString("Email_ID"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        
        delete = new JButton("DELETE");
        delete.setBounds(80, 300, 120,30);
        delete.setBackground(Color.BLACK);
        delete.setForeground(Color.WHITE);
        delete.setFont(new Font("Montserrat", Font.BOLD, 20));
        delete.addActionListener(this);
        add(delete);
        
        back = new JButton("BACK");
        back.setBounds(220, 300, 100,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Montserrat", Font.BOLD, 20));
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/remove.png"));
        Image i2 = i1.getImage().getScaledInstance(1000, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1000, 400);
        add(image);
        
        setSize(1000, 400);
        setLocation(300, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == delete) {
            try {
                Conn c = new Conn();
                String query = "delete from Employee_record where Emp_ID = '"+cEmpId.getSelectedItem()+"'";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Employee Information Deleted Sucessfully");
                setVisible(false);
                new Home();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Home();
        }
    }

    public static void main(String[] args) {
        new RemoveEmployee();
    }
}