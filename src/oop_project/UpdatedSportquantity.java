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

public class UpdatedSportquantity extends JFrame {
    JButton b1, b2;
     JLabel l1,l2;
     JTextField t1,t2;
    UpdatedSportquantity()
    {
        setSize(400,600);
        setLayout(new GridLayout(4,2));
        
        l1=new JLabel("Enter the code");
        t1=new JTextField(20);
        l2=new JLabel("Enter the price");
        t2=new JTextField(20);
        b1=new JButton("Submit");
        b2=new JButton("Dress menu");
        MyActionListener n=new MyActionListener();
        add(l1);
        add(t1);
        add(l2);
        add(t2);
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
             if(t1.getText().isEmpty() || t2.getText().isEmpty())
             {
                 JOptionPane.showMessageDialog(null,"PLEASE FIRST FILL THE TEXT FIELDS");
             }
             else
             {
                 if(Sports.searchDataFromFile(t1.getText()))
                 {
                   if(Sports.checkQuantity(t2.getText())==true)
                   {
                     Sports.UpdateQuantity(t1.getText(), t2.getText());
                     JOptionPane.showMessageDialog(null,"Successfully updated");   
                   }
                   else
                   {
                     JOptionPane.showMessageDialog(null,"INVALID UPDATED QUANTITY");
                   }
                 }
                 else
                 {
                   JOptionPane.showMessageDialog(null,"Record not found");
                 }
             }
             
                 
          }
         if("Dress menu".equals(ae.getActionCommand()))
         {
             dispose();
             Sports_menu c= new Sports_menu();
         }
      }
    }
}