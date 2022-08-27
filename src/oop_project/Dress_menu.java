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
public class Dress_menu extends JFrame
{
    JButton b1,b2,b3,b4,b5,b6;
    Dress_menu()
    {
        setSize(400,500);
        setLayout(new GridLayout(5,1));
        b1= new JButton("ADD DRESS");
        b2= new JButton("SEARCH DRESS");
        b3= new JButton("DELETE DRESS"); 
        b4= new JButton("UPDATE DRESS");
        b5= new JButton("DISPLAY DRESS");
        b6= new JButton("HOME");
        MyActionListener a = new MyActionListener();
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        b1.addActionListener(a);
        b2.addActionListener(a);
        b3.addActionListener(a);
        b4.addActionListener(a);
        b5.addActionListener(a);
        b6.addActionListener(a);
        setVisible(true);

    }
    public class MyActionListener implements ActionListener
    {
      public void actionPerformed(ActionEvent ae)
      {
         if(ae.getActionCommand()=="ADD DRESS")
         {
             dispose();
             Add_Dress d= new Add_Dress();
         }
         if(ae.getActionCommand()=="SEARCH DRESS")
         {
             dispose();
             Search_Dress c= new Search_Dress();
         }
         if(ae.getActionCommand()=="DELETE DRESS")
         {
             dispose();
             Delete_Dress c= new Delete_Dress();
         }
         if(ae.getActionCommand()=="UPDATE DRESS")
         {
             dispose();
             Update_Dress d= new Update_Dress();
         }
         if(ae.getActionCommand()=="DISPLAY DRESS")
         {
             dispose();
             Display_Dress c= new Display_Dress();
         }
         if(ae.getActionCommand()=="HOME")
         {
             dispose();
             Product c= new Product();
         }
      }
    }
}
