/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class updateaddress extends JFrame
{
    JButton b1, b2;
     JLabel l1,l2,l3,l4,l6;
     JTextField t1,t2,t3,t4,t6;
    updateaddress()
    {
        setSize(400,600);
        setLayout(new GridLayout(8,2));
        l1=new JLabel("Enter your email");
        t1=new JTextField(20);
        l6= new JLabel("Enter your password");
        t6=new JTextField(20);
        l2=new JLabel("Enter your home no");
        t2=new JTextField(20);
        l3=new JLabel("Enter your street no");
        t3=new JTextField(20);
        l4=new JLabel("Enter your city ");
        t4=new JTextField(20);
        b1=new JButton("Submit");
        b2=new JButton("Update Menu");
        MyActionListener n=new MyActionListener();
        add(l1);
        add(t1);
        add(l6);
        add(t6);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        JPanel p1=new JPanel();
        p1.add(b1);
        p1.add(b2);
        add(p1,BorderLayout.SOUTH);
        b1.addActionListener(n);
        b2.addActionListener(n);
        setVisible(true);
    }
    public class MyActionListener implements ActionListener
    {
      @Override
      public void actionPerformed(ActionEvent ae)
      {
         if("Submit".equals(ae.getActionCommand()))
         {
              Address a=new Address(t2.getText(),t3.getText(),t4.getText());
              if(t1.getText().isEmpty()||t2.getText().isEmpty()||t3.getText().isEmpty()||t4.getText().isEmpty())
             {
                 JOptionPane.showMessageDialog(null, "Please fill all the Text Fields"); 
             }
              else
              {
             if(t1.getText().contains("@")&& t1.getText().endsWith(".com"))
              {
               if(Customer.searchcust(t1.getText(), t6.getText()))
                {
                 if(Address.homecheck(t2.getText()))
                 {
                     if(Address.streetcheck(t3.getText()))
                     {
                         if(Address.citycheck(t4.getText()))
                         {
                              Customer.update_Address(t1.getText(), a);
                             JOptionPane.showMessageDialog(null,"Successfully updated"); 
                             dispose();
                              updatemenucust c= new updatemenucust();
                         }
                         else
                         {
                             JOptionPane.showMessageDialog(null, "INVALID Street no entry");
                             dispose();
                             updatemenucust c= new updatemenucust();
                         }
                         
                     }
                     else
                     {
                         JOptionPane.showMessageDialog(null, "INVALID City entry");
                          dispose();
                          updatemenucust c= new updatemenucust();
                     }  
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(null, "INVALID Home no entry");
                      dispose();
                      updatemenucust c= new updatemenucust();
                 }
             }
             else
             {
                 JOptionPane.showMessageDialog(null,"Record not found");
                 dispose();
                 updatemenucust c= new updatemenucust();
             }
         }
             else
             {
                 JOptionPane.showMessageDialog(null," Invalid email format");
               dispose();
               updatemenucust c= new updatemenucust();
             }
         }
         }
         if("Update Menu".equals(ae.getActionCommand()))
         {
             dispose();
             updatemenucust c= new updatemenucust();
         }
      }
    }  
}
