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

/**
 *
 * @author chaud
 */
public class Product extends JFrame
{
    JButton b1,b2,b3,b4,b6;
    Product()
    {
        setSize(400,500);
        setLayout(new GridLayout(5,1));
        b1= new JButton("DRESS MENU");
        b2= new JButton("SPORTS MENU");
        b3= new JButton("COSMETICS MENU"); 
        b4= new JButton("HOME APPLIANCES MENU");
        b6= new JButton("HOME");
        MyActionListener a = new MyActionListener();
        add(b1);
        add(b2);
        add(b3);
        add(b4);
       
        add(b6);
        b1.addActionListener(a);
        b2.addActionListener(a);
        b3.addActionListener(a);
        b4.addActionListener(a);
        b6.addActionListener(a);
        setVisible(true);

    }
    public class MyActionListener implements ActionListener
    {
      public void actionPerformed(ActionEvent ae)
      {
         if(ae.getActionCommand()=="DRESS MENU")
         {
             dispose();
             Dress_menu d= new Dress_menu();
         }
         if(ae.getActionCommand()=="SPORTS MENU")
         {
             dispose();
             Sports_menu c= new Sports_menu();
         }
         if(ae.getActionCommand()=="COSMETICS MENU")
         {
             dispose();
             Cosmetic_menu c= new Cosmetic_menu();
         }
         if(ae.getActionCommand()=="HOME APPLIANCES MENU")
         {
             dispose();
             home_appliances_menu c= new home_appliances_menu();
         }
         if(ae.getActionCommand()=="HOME")
         {
             dispose();
             SIGN_IN c= new SIGN_IN();
         }
      }
    }
}
