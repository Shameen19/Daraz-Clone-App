/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SIGN_IN extends JFrame
{
    JButton b1,b2,b6;
    ImageIcon i1,i2,i3;
    JFrame frame;
    SIGN_IN()
    {
        frame=new JFrame();
        i1=new ImageIcon("person.png");
        i2=new ImageIcon("admin.png");
        i3=new ImageIcon("home1.png");
        frame.setSize(400,800);
        frame.setLayout(new GridLayout(3,3));
        frame.getContentPane().setBackground(new Color(30,20,40,40));
        b1= new JButton("CUSTOMER");
        b1.setFont(new Font("Courgette",Font.BOLD,16));
        b1.setIcon(i1);
        b1.setHorizontalTextPosition(JButton.RIGHT);
        b1.setBackground(Color.white);
        b2= new JButton("ADMIN");
        b2.setFont(new Font("Courgette",Font.BOLD,16));
        b2.setIcon(i2);
        b2.setHorizontalTextPosition(JButton.RIGHT);
        b2.setBackground(Color.white);
        b6= new JButton("HOME");
        b6.setFont(new Font("Courgette",Font.BOLD,16));
        b6.setIcon(i3);
        b6.setHorizontalTextPosition(JButton.RIGHT);
        b6.setBackground(Color.white);
        MyActionListener a = new MyActionListener();
        frame.add(b1);
        frame.add(b2);
        frame.add(b6);
        b1.addActionListener(a);
        b2.addActionListener(a);
        b6.addActionListener(a);
        frame.setVisible(true);

    }
    public class MyActionListener implements ActionListener
    {
      public void actionPerformed(ActionEvent ae)
      {
         if(ae.getActionCommand()=="CUSTOMER")
         {
             frame.dispose();
             CUSTOMER_MENU C= new CUSTOMER_MENU();
         }
         if(ae.getActionCommand()=="ADMIN")
         {
             frame.dispose();
             ADMIN_MENU d= new ADMIN_MENU();
         }
         if(ae.getActionCommand()=="HOME")
         {
            frame.dispose();
            WELCOME_PAGE w=new WELCOME_PAGE();
         }
      }
    
    }
}
