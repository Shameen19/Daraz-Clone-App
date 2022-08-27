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
public class home_appliances_menu extends JFrame
{
    JButton b1,b2,b3,b4,b5,b6;
    home_appliances_menu()
    {
        setSize(400,500);
        setLayout(new GridLayout(5,1));
        b1= new JButton("ADD HOME APPLIANCES RECORD");
        b2= new JButton("SEARCH HOME APPLIANCES RECORD");
        b3= new JButton("DELETE HOME APPLIANCES RECORD"); 
        b4= new JButton("UPDATE HOME APPLIANCES RECORD");
        b5= new JButton("DISPLAY HOME APPLIANCES RECORD");
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
         if(ae.getActionCommand()=="ADD HOME APPLIANCES RECORD")
         {
             dispose();
             Add_home_appliances d= new Add_home_appliances();
         }
         if(ae.getActionCommand()=="SEARCH HOME APPLIANCES RECORD")
         {
             dispose();
             Search_home_appliances c= new Search_home_appliances();
         }
         if(ae.getActionCommand()=="DELETE HOME APPLIANCES RECORD")
         {
             dispose();
             Delete_home_appliances c= new Delete_home_appliances();
         }
         if(ae.getActionCommand()=="UPDATE HOME APPLIANCES RECORD")
         {
             dispose();
             Update_home_appliance e= new Update_home_appliance();
         }
         if(ae.getActionCommand()=="DISPLAY HOME APPLIANCES RECORD")
         {
             dispose();
             Display_home_appliances c= new Display_home_appliances();
         }
         if(ae.getActionCommand()=="HOME")
         {
             dispose();
             Product c= new Product();
         }
      }
    }
    
}
