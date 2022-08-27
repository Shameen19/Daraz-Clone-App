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
public class Sports_menu extends JFrame
{
    JButton b1,b2,b3,b4,b5,b6;
    Sports_menu()
    {
        setSize(400,500);
        setLayout(new GridLayout(5,1));
        b1= new JButton("ADD SPORTS");
        b2= new JButton("SEARCH SPORTS");
        b3= new JButton("DELETE SPORTS"); 
        b4= new JButton("UPDATE SPORTS");
        b5= new JButton("DISPLAY SPORTS");
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
         if(ae.getActionCommand()=="ADD SPORTS")
         {
             dispose();
             Add_sports d= new Add_sports();
         }
         if(ae.getActionCommand()=="SEARCH SPORTS")
         {
             dispose();
             Search_sport c= new Search_sport();
         }
         if(ae.getActionCommand()=="DELETE SPORTS")
         {
             dispose();
             Delete_Sport c= new Delete_Sport();
         }
         if(ae.getActionCommand()=="UPDATE SPORTS")
         {
             dispose();
             Update_sport s= new Update_sport();
         }
         if(ae.getActionCommand()=="DISPLAY SPORTS")
         {
             dispose();
             Display_sport c= new Display_sport();
         }
         if(ae.getActionCommand()=="HOME")
         {
             dispose();
             Product c= new Product();
         }
      }
    }
}
