package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener {
    
    Splash() {
        
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(70, 30, 1100, 60);
        heading.setFont(new Font("Montserrat", Font.BOLD, 55));
        heading.setForeground(Color.WHITE);
        add(heading);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Front1.png"));
        Image i2 = i1.getImage().getScaledInstance(1170, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1170, 650);
        add(image);
        
        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setFont(new Font("Montserrat", Font.CENTER_BASELINE, 20));
        clickhere.setBounds(300, 500, 450, 50);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.WHITE);
        clickhere.addActionListener(this);
        clickhere.addMouseListener(new MouseListener() {
    @Override
    public void mouseReleased(MouseEvent e) {
        clickhere.setBackground(new Color(3, 59, 90));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        clickhere.setBackground(new Color(4, 69, 100));
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        clickhere.setBackground(new Color(3, 59, 90).brighter());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        clickhere.setBackground(new Color(3, 59, 90).brighter());
    }

            @Override
            public void mousePressed(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        image.add(clickhere);
        
        
        setSize(1170, 650);
        setLocation(200, 50);
        setVisible(true);
       
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }
    
    public static void main(String args[]) {
        new Splash();
    }
}