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

public class Update_sport extends JFrame
{
    JButton b1, b2,b3;
    Update_sport()
    {
        setSize(400,600);
        setLayout(new GridLayout(3,1));
        b1=new JButton("Update Quantity");
        b2=new JButton("Update Price");
        b3=new JButton("UPDATE SPORT");
        MyActionListener a1=new MyActionListener();
        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(a1);
        b2.addActionListener(a1);
        b3.addActionListener(a1);
        setVisible(true);
    }
    public class MyActionListener implements ActionListener
    {
      @Override
      public void actionPerformed(ActionEvent ae)
      {
          if(ae.getActionCommand()=="Update Quantity")
         {
             dispose();
             UpdatedSportquantity U= new UpdatedSportquantity();
         }
         if("Update Price".equals(ae.getActionCommand()))
         {
             dispose();
             UpdatedSportprice u1=new UpdatedSportprice();
         }
         
         if("UPDATE SPORT".equals(ae.getActionCommand()))
         {
             dispose();
             Sports_menu c= new Sports_menu();
         }
      }
    }
    
}

