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
public class Cosmetic_menu extends JFrame
{
    JButton b1,b2,b3,b4,b5,b6;
    Cosmetic_menu()
    {
        setSize(400,500);
        setLayout(new GridLayout(5,1));
        b1= new JButton("ADD COSMETIC RECORD");
        b2= new JButton("SEARCH COSMETIC RECORD");
        b3= new JButton("DELETE COSMETIC RECORD"); 
        b4= new JButton("UPDATE COSMETIC RECORD");
        b5= new JButton("DISPLAY COSMETIC RECORD");
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
         if(ae.getActionCommand()=="ADD COSMETIC RECORD")
         {
             dispose();
             Add_cosmetic d= new Add_cosmetic();
         }
         if(ae.getActionCommand()=="SEARCH COSMETIC RECORD")
         {
             dispose();
             Search_cosmetic c= new Search_cosmetic();
         }
         if(ae.getActionCommand()=="DELETE COSMETIC RECORD")
         {
             dispose();
             Delete_cosmetic c= new Delete_cosmetic();
         }
         if(ae.getActionCommand()=="UPDATE COSMETIC RECORD")
         {
             dispose();
             Update_cosmetic c= new Update_cosmetic();
         }
         if(ae.getActionCommand()=="DISPLAY COSMETIC RECORD")
         {
             dispose();
             Display_cosmetic c= new Display_cosmetic();
         }
         if(ae.getActionCommand()=="HOME")
         {
             dispose();
             Product c= new Product();
         }
      }
    }
    
}
