/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class SIGN_UP  extends JFrame
{
  JButton b1,b2;
    JLabel l1,l2,l3,l4,l8,l9,l10;
    JTextField t1,t2,t3,t4,t8,t9,t10;
    SIGN_UP(){
        setLayout(new BorderLayout());
        setSize(400,500);
        l1=new JLabel("Name: ");
        l2=new JLabel(" Contact: ");
        l3=new JLabel("Email: ");
        l4=new JLabel("Password: ");
        l8=new JLabel("Home no: ");
        l9=new JLabel("Street no: ");
        l10=new JLabel("City: ");
        t1= new JTextField(20);
        t2= new JTextField(20);
        t3=new JTextField(20);
        t4=new JTextField(20);
        t8=new JTextField(20);
        t9=new JTextField(20);
        t10=new JTextField(20);
        b1=new JButton("Home");
        b2=new JButton("Submit");
        JPanel p1=new JPanel();
        p1.setLayout(new GridLayout(20,10));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p1.add(l4);
        p1.add(t4);
        p1.add(l8);
        p1.add(t8);
        p1.add(l9);
        p1.add(t9);
        p1.add(l10);
        p1.add(t10);
        add(p1,BorderLayout.NORTH);
        JPanel p2=new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(b1);
        p2.add(b2);
        add(p2, BorderLayout.SOUTH);
        MyActionListener a=new MyActionListener();
         b1.addActionListener(a);
         b2.addActionListener(a);
        setVisible(true);
    }
    public class MyActionListener implements ActionListener
    {
        Customer c1;
        Address a1;
        @Override
      public void actionPerformed(ActionEvent ae)
      {
         if(ae.getActionCommand()=="Submit")
         {
             a1=new Address(t8.getText(),t9.getText(),t10.getText());
             c1=new Customer(t1.getText(),t2.getText(),t3.getText(),t4.getText(),a1);
             if(t1.getText().isEmpty()||t2.getText().isEmpty()||t3.getText().isEmpty()||t4.getText().isEmpty()||t8.getText().isEmpty()||t9.getText().isEmpty()||t10.getText().isEmpty())
             {
                 JOptionPane.showMessageDialog(null, "Please fill all the Text Fields"); 
             }
             else
             {
             if(Customer.checkname(t1.getText()))
             {
                 if(Customer.check_contact(t2.getText()))
                 {
                     if(Customer.chekemail(t3.getText()))
                     {
                         if(t3.getText().contains("@") && t3.getText().endsWith(".com"))
                         {
                             if(Address.homecheck(t8.getText()))
                             {
                                 if(Address.streetcheck(t9.getText()))
                                 {
                                     if(Address.citycheck(t10.getText()))
                                     {
                                         Customer.writeToFile(c1);
                                         JOptionPane.showMessageDialog(null, "Successful"); 
                                         dispose();
                                         DarazClone d= new DarazClone();
                                     }
                                     else
                                     {
                                         JOptionPane.showMessageDialog(null, "Invalid city name"); 
                                        dispose();
                                         DarazClone d= new DarazClone();
                                     }
                                 }
                                 else
                                 {
                                     JOptionPane.showMessageDialog(null, "Invalid street name"); 
                                     dispose();
                                     DarazClone d= new DarazClone();
                                 }
                             }
                             else
                             {
                                 JOptionPane.showMessageDialog(null, "Invalid home entry"); 
                              dispose();
                              DarazClone d= new DarazClone();
                                 
                             }
                             
                         }
                         else
                         {
                             JOptionPane.showMessageDialog(null, "Invalid format"); 
                             dispose();
                             DarazClone d= new DarazClone();
                         }
                     }
                     else
                     {
                         JOptionPane.showMessageDialog(null, "This Email already exist"); 
                         dispose();
                         DarazClone d= new DarazClone();
                     }
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(null, "Invalid format:Follow Proper format of phone"); 
                     dispose();
                     DarazClone d= new DarazClone();
                     
                 }
                 
             }
             else
             {
                 JOptionPane.showMessageDialog(null, "Invalid Name"); 
                 dispose();
                 DarazClone d= new DarazClone();
             }
                
                
         }
         }
         if(ae.getActionCommand()=="Home")
         {
             dispose();
             DarazClone d= new DarazClone();
         }
        
         
      }
   
   
}
}

