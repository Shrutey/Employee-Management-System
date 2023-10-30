package employee.management.system;

import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;

public class AddEmployee extends JFrame implements ActionListener{
    
    Random ran = new Random();
    int number = ran.nextInt(999999);
    
    JTextField tfname, tffname, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation;
    JDateChooser dcdob;
    JComboBox cbeducation;
    JLabel lblempId;
    JButton add, back;
    
    AddEmployee() {
       
      
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("ADD EMPLOYEE:");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("Montserrat", Font.BOLD, 25));
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
        
        dcdob = new JDateChooser();
        dcdob.setBounds(200, 200, 150, 30);
        add(dcdob);
        
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
        
        JLabel labelphone = new JLabel("Contact:");
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
        
        String courses[] = {"BBA", "BCA", "BA", "BSC", "B.COM", "BTech", "MBA", "MCA", "MA", "MTech", "MSC", "PHD"};
        cbeducation = new JComboBox(courses);
        cbeducation.setBackground(Color.WHITE);
        cbeducation.setFont(new Font("Montserrat", Font.PLAIN, 20));
        cbeducation.setBounds(600, 300, 150, 30);
        add(cbeducation);
        
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
        
        lblempId = new JLabel("" + number);
        lblempId.setBounds(200, 400, 150, 30);
        lblempId.setFont(new Font("Montserrat", Font.PLAIN, 20));
        lblempId.setForeground(Color.WHITE);
        add(lblempId);
        
        add = new JButton("ADD DETAILS");
        add.setBounds(250, 550, 150, 40);
        add.setFont(new Font("Montserrat", Font.BOLD, 15));
        add.addActionListener(this);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add(add);
        
        back = new JButton("BACK");
        back.setBounds(450, 550, 150, 40);
        back.setFont(new Font("Montserrat", Font.BOLD, 15));
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
            String name = tfname.getText();
            String fname = tffname.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = (String) cbeducation.getSelectedItem();
            String designation = tfdesignation.getText();
            String aadhar = tfaadhar.getText();
            String empId = lblempId.getText();
            
            try {
                Conn conn = new Conn();
                String query = "insert into Employee_record values('"+name+"', '"+fname+"', '"+dob+"', '"+salary+"', '"+address+"', '"+phone+"', '"+email+"', '"+education+"', '"+designation+"', '"+aadhar+"', '"+empId+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added successfully");
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
        new AddEmployee();
    }
}