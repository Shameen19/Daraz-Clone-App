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

public class CUSTOMER_MENU extends JFrame
{
    JButton b1,b2;
    JLabel l1,l2;
    JTextField t1,t2;
    CUSTOMER_MENU()
    {
        setSize(400,500);
        
        setLayout(new BorderLayout());
        b1= new JButton("SUBMIT");
        b2= new JButton("HOME");
        l1= new JLabel("ENTER YOUR Email");
        l2= new JLabel("ENTER YOUR Password");
        t1= new JTextField(20);
        t2= new JTextField(20);
        JPanel p= new JPanel();
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.setLayout(new GridLayout(2,2));
        add(p,BorderLayout.NORTH);
        MyActionListener a = new MyActionListener();
        JPanel p1= new JPanel();
        p1.add(b1);
        p1.add(b2);
        add(p1,BorderLayout.SOUTH);
        b1.addActionListener(a);
        b2.addActionListener(a);
        setVisible(true);

    }
    public class MyActionListener implements ActionListener
    {
      @Override
      public void actionPerformed(ActionEvent ae)
      {
         if(ae.getActionCommand()=="SUBMIT")
         {
             if(t1.getText().isEmpty()||t2.getText().isEmpty())
             {
                 JOptionPane.showMessageDialog(null, "Please fill all the Text Fields"); 
             }
             else
             {
             if(t1.getText().contains("@") && t1.getText().endsWith(".com"))
             {
             if(Customer.searchcust(t1.getText(), t2.getText()))
             {
                 dispose();
                 JOptionPane.showMessageDialog(null, "  Vlid access");
                 Myaccount m=new Myaccount();
             }
             else
             {
                 JOptionPane.showMessageDialog(null, "  THAT ID NOT FOUND");
                 dispose();
                 SIGN_IN c= new SIGN_IN();
             }
         }
             else
             {
                 JOptionPane.showMessageDialog(null, "  Invalid Email Address");
                 dispose();
                 SIGN_IN c= new SIGN_IN();
             }
         }
         }
         if(ae.getActionCommand()=="HOME")
         {
             dispose();
             SIGN_IN c= new SIGN_IN();
         }
      }  
}
}
