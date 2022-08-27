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
public class updatemenucust extends JFrame 
{
    JButton b1, b2,b3,b4;
    updatemenucust()
    {
        setSize(400,600);
        setLayout(new GridLayout(3,1));
        b1=new JButton("Update Password");
        b2=new JButton("Update Address");
        b3=new JButton("UPDATE Contact");
        b4=new JButton("Main Page");
        MyActionListener a1=new MyActionListener();
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        b1.addActionListener(a1);
        b2.addActionListener(a1);
        b3.addActionListener(a1);
        b4.addActionListener(a1);
        setVisible(true);
    }
    public class MyActionListener implements ActionListener
    {
      @Override
      public void actionPerformed(ActionEvent ae)
      {
          if(ae.getActionCommand()=="Update Password")
         {
             dispose();
             updatepassword  U= new updatepassword ();
         }
         if("Update Address".equals(ae.getActionCommand()))
         {
             dispose();
            updateaddress u1=new updateaddress();
         }
         
         if("UPDATE Contact".equals(ae.getActionCommand()))
         {
             dispose();
             updatecontact c= new  updatecontact();
         }
         if("Main Page".equals(ae.getActionCommand()))
         {
             dispose();
             Myaccount a=new Myaccount();
         }
      }
    }
    
}
