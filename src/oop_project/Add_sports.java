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

public class Add_sports  extends JFrame
{
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2;
    Add_sports()
    {
        setSize(400,600);
        setLayout( new BorderLayout());
        // //String code,String brand, String quantity, String type,String price
        b1= new JButton("SUBMIT");
        b2= new JButton("HOME");
        l1= new JLabel("ENTER SPORT CODE");
        l2= new JLabel("ENTER SPORT BRAND");
        l3= new JLabel("ENTER SPORT QUANTITY");
        l4= new JLabel("ENTER SPORT NAME");
        l5= new JLabel("ENTER SPORT PRICE");
        
        
        t1= new JTextField(20);
        t2= new JTextField(20);
        t3= new JTextField(20);
        t4= new JTextField(20);
        t5= new JTextField(20);
       
       
        JPanel p1= new JPanel();
        JPanel p2=new JPanel();
        p1= new JPanel();
        p1.setLayout(new GridLayout(10,2));
        p2= new JPanel();
        p2.setLayout(new FlowLayout());
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p1.add(l4);
        p1.add(t4);
        p1.add(l5);
        p1.add(t5);
        
        p2.add(b1);
        p2.add(b2);
        add(p1,BorderLayout.CENTER);
        add(p2,BorderLayout.SOUTH);
        b1.addActionListener(new MyActionListener() );
        b2.addActionListener(new MyActionListener() );
        setVisible(true);
        
    }
    public class MyActionListener implements ActionListener
    {
      public void actionPerformed(ActionEvent ae)
      {
        
         if(ae.getActionCommand()=="SUBMIT")
         {
            if(t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty() || t4.getText().isEmpty() || t5.getText().isEmpty())
             {
                 JOptionPane.showMessageDialog(null, "PLEASE FIRST FILL ALL TEXT FILEDS");
             }
             else
             {
                 if(Sports.addProduct(t1.getText(), t2.getText(), t3.getText(), t4.getText(), t5.getText())==true)
                 {
                     Sports c= new Sports(t1.getText(),t2.getText(),t3.getText(),t4.getText(),t5.getText());
                     Sports.writeProduct(c);
                     JOptionPane.showMessageDialog(null,"SUBMITTED");
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(null,"INVALID INPUT");
                 }
             }
         }
         if(ae.getActionCommand()=="HOME")
         {
             dispose();
             Sports_menu c= new Sports_menu();
         }
      }
    }
    
}
