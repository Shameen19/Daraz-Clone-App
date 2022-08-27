/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author chaud
 */
public class Delete_home_appliances extends JFrame
{
    JLabel l1;
    JTextField t1;
    JButton b1,b2;
    Delete_home_appliances ()
    {
        setSize(400,600);
        setLayout(new GridLayout(2,2));
        l1= new JLabel("ENTER THE CODE OF HOME APPLIANCES WHICH RECORD YOU WANT TO DELETE");
        t1= new JTextField(20);
        b1= new JButton("DELETE");
        b2= new JButton("HOME");
        add(b1);
        add(b2);
        add(l1);
        add(t1);
        MyActionListener a = new MyActionListener();
        b1.addActionListener(a);
        b2.addActionListener(a);
        setVisible(true);
    }
    public class MyActionListener implements ActionListener
    {
      public void actionPerformed(ActionEvent ae)
      {
         if(ae.getActionCommand()=="DELETE")
         {
             if(t1.getText().isEmpty())
             {
                 JOptionPane.showMessageDialog(null,"PLEASE FIST FILL THE TEXT FIELDS");
             }
             else
             {
                 if(HomeAppliances.searchDataFromFile(t1.getText()))
                 { 
                   HomeAppliances.deleteProduct(t1.getText());
                   JOptionPane.showMessageDialog(null, "HOME APPLIANCES RECORD DELETED");
                 }
                 else
                 {
                   JOptionPane.showMessageDialog(null, "HOME APPLIANCES ITEM NOT FOUND");
                  }
             }
         }
         if(ae.getActionCommand()=="HOME")
         {
             dispose();
             home_appliances_menu c= new home_appliances_menu();
         }
      }
    }
    
    
}
