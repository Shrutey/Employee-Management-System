package employee.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateEmployee extends JFrame implements ActionListener{
    
    JTextField tfeducation,tfname,tfdob, tffname, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation;
    JLabel lblempId;
    JButton add, back;
    String empId;
    
    UpdateEmployee(String empId) {
        this.empId = empId;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("UPDATE EMPLOYEE:");
        heading.setBounds(270, 30, 500, 50);
        heading.setFont(new Font("Montserrat", Font.BOLD, 35));
        heading.setForeground(Color.WHITE);
        add(heading);
        
        JLabel labelname = new JLabel("Name:");
        labelname.setBounds(50, 150, 150, 30);
        labelname.setFont(new Font("Montserrat", Font.PLAIN, 20));
        labelname.setForeground(Color.WHITE);
        add(labelname);
        
        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);
        
        JLabel labelfname = new JLabel("Father's Name:");
        labelfname.setBounds(400, 150, 180, 30);
        labelfname.setFont(new Font("Montserrat", Font.PLAIN, 20));
        labelfname.setForeground(Color.WHITE);
        add(labelfname);
        
        tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        add(tffname);
        
        JLabel labeldob = new JLabel("DOB:");
        labeldob.setBounds(50, 200, 150, 30);
        labeldob.setFont(new Font("Montserrat", Font.PLAIN, 20));
        labeldob.setForeground(Color.WHITE);
        add(labeldob);
        
        tfdob = new JTextField();
        tfdob.setBounds(200, 200, 150, 30);
        add(tfdob);
        
        JLabel labelsalary = new JLabel("Salary:");
        labelsalary.setBounds(400, 200, 150, 30);
        labelsalary.setFont(new Font("Montserrat", Font.PLAIN, 20));
        labelsalary.setForeground(Color.WHITE);
        add(labelsalary);
        
        tfsalary = new JTextField();
        tfsalary.setBounds(600, 200, 150, 30);
        add(tfsalary);
        
        JLabel labeladdress = new JLabel("Address:");
        labeladdress.setBounds(50, 250, 150, 30);
        labeladdress.setFont(new Font("Montserrat", Font.PLAIN, 20));
        labeladdress.setForeground(Color.WHITE);
        add(labeladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);
        
        JLabel labelphone = new JLabel("Phone:");
        labelphone.setBounds(400, 250, 150, 30);
        labelphone.setFont(new Font("Montserrat", Font.PLAIN, 20));
        labelphone.setForeground(Color.WHITE);
        add(labelphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);
        
        JLabel labelemail = new JLabel("Email:");
        labelemail.setBounds(50, 300, 150, 30);
        labelemail.setFont(new Font("Montserrat", Font.PLAIN, 20));
        labelemail.setForeground(Color.WHITE);
        add(labelemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);
        
        JLabel labeleducation = new JLabel("Education:");
        labeleducation.setBounds(400, 300, 150, 30);
        labeleducation.setFont(new Font("Montserrat", Font.PLAIN, 20));
        labeleducation.setForeground(Color.WHITE);
        add(labeleducation);
        
        tfeducation = new JTextField();
        tfeducation.setBounds(600, 300, 150, 30);
        add(tfeducation);
        
        JLabel labeldesignation = new JLabel("Designation:");
        labeldesignation.setBounds(50, 350, 150, 30);
        labeldesignation.setFont(new Font("Montserrat", Font.PLAIN, 20));
        labeldesignation.setForeground(Color.WHITE);
        add(labeldesignation);
        
        tfdesignation = new JTextField();
        tfdesignation.setBounds(200, 350, 150, 30);
        add(tfdesignation);
        
        JLabel labelaadhar = new JLabel("Aadhar No:");
        labelaadhar.setBounds(400, 350, 150, 30);
        labelaadhar.setFont(new Font("Montserrat", Font.PLAIN, 20));
        labelaadhar.setForeground(Color.WHITE);
        add(labelaadhar);
        
        tfaadhar = new JTextField();
        tfaadhar.setBounds(600, 350, 150, 30);
        add(tfaadhar);
        
        JLabel labelempId = new JLabel("Employee ID:");
        labelempId.setBounds(50, 400, 150, 30);
        labelempId.setFont(new Font("Montserrat", Font.PLAIN, 20));
        labelempId.setForeground(Color.WHITE);
        add(labelempId);
        
        lblempId = new JLabel();
        lblempId.setBounds(200, 400, 150, 30);
        lblempId.setFont(new Font("Montserrat", Font.PLAIN, 20));
        lblempId.setForeground(Color.WHITE);
        add(lblempId);
        
        try {
            Conn c = new Conn();
            String query = "select * from Employee_record where Emp_ID = '"+empId+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                tfname.setText(rs.getString("Name"));
                tffname.setText(rs.getString("Fname"));
                tfdob.setText(rs.getString("DOB"));
                tfaddress.setText(rs.getString("Address"));
                tfsalary.setText(rs.getString("Salary"));
                tfphone.setText(rs.getString("Contact"));
                tfemail.setText(rs.getString("Email_ID"));
                tfeducation.setText(rs.getString("Education"));
                tfaadhar.setText(rs.getString("Aadhar_ID"));
                lblempId.setText(rs.getString("Emp_ID"));
                tfdesignation.setText(rs.getString("Designation"));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        add = new JButton("UPDATE");
        add.setBounds(250, 550, 150, 40);
        add.setFont(new Font("Montserrat", Font.BOLD, 20));
        add.addActionListener(this);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add(add);
        
        back = new JButton("BACK");
        back.setBounds(450, 550, 150, 40);
        back.setFont(new Font("Montserrat", Font.BOLD, 20));
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Add.png"));
        Image i2 = i1.getImage().getScaledInstance(900, 700, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 700);
        add(image);
        
        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String fname = tffname.getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = tfeducation.getText();
            String designation = tfdesignation.getText();
            
            try {
                Conn conn = new Conn();
                String query = "update Employee_record set Fname = '"+fname+"', Salary = '"+salary+"', Address = '"+address+"', Contact = '"+phone+"', Email_ID =  '"+email+"', Education = '"+education+"', Designation = '"+designation+"' where Emp_ID = '"+empId+"'";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details updated successfully");
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
        new UpdateEmployee("");
    }
}