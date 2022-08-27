/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Update_home_appliance
package oop_project;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Update_home_appliance extends JFrame
{
    JButton b1, b2,b3;
    Update_home_appliance()
    {
        setSize(400,600);
        setLayout(new GridLayout(3,1));
        b1=new JButton("Update Quantity");
        b2=new JButton("Update Price");
        b3=new JButton("UPDATE HOME APPLIANCES");
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
             Updateappliancesquantity U= new Updateappliancesquantity();
         }
         if("Update Price".equals(ae.getActionCommand()))
         {
             dispose();
             Updateappliancesprice u1=new Updateappliancesprice();
         }
         
         if("UPDATE HOME APPLIANCES".equals(ae.getActionCommand()))
         {
             dispose();
             home_appliances_menu c= new home_appliances_menu();
         }
      }
    }
    
}

