/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Myaccount extends JFrame 
{
    JButton b1,b2,b3;
    ImageIcon i1,i2,i3,i4;
    JFrame frame;
    Myaccount()
    {
        frame=new JFrame();
        frame.setSize(400,600);
        frame.setLayout(new BorderLayout());
        frame.setTitle("My Account");
        i1=new ImageIcon("person.png");
        frame.setIconImage(i1.getImage());
        frame.getContentPane().setBackground(new Color(10,10,56,56));
        b1=new JButton("Start Shopping");
        b1.setFont(new Font("Courgette",Font.BOLD,16));
        i2=new ImageIcon("shopping.png");
        b1.setIcon(i2);
        b1.setHorizontalTextPosition(JButton.RIGHT);
        b1.setBackground(Color.lightGray);
        b2=new JButton("Setting");
        b2.setFont(new Font("Courgette",Font.BOLD,16));
        i3=new ImageIcon("settings.png");
        b2.setIcon(i3);
        b2.setHorizontalTextPosition(JButton.RIGHT);
        b2.setBackground(Color.lightGray);
        b3=new JButton("Log out");
        b3.setFont(new Font("Courgette",Font.BOLD,16));
        i4=new ImageIcon("logout.png");
        b3.setIcon(i4);
        b3.setHorizontalTextPosition(JButton.RIGHT);
        b3.setBackground(Color.LIGHT_GRAY);
        MyActionListener a = new MyActionListener();
        JPanel p1= new JPanel();
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        add(p1,BorderLayout.CENTER);
        b1.addActionListener(a);
        b2.addActionListener(a);
        b3.addActionListener(a);
        frame.add(p1);
        frame.setVisible(true);
    }
    public class MyActionListener implements ActionListener
    {
      @Override
      public void actionPerformed(ActionEvent ae)
      {
         if(ae.getActionCommand()=="Start Shopping")
         {
             frame.dispose();
            ADD_TO_CART_GUI a=new ADD_TO_CART_GUI();
         }
         if(ae.getActionCommand()=="Setting")
         {
             frame.dispose();
             updatemenucust u1=new updatemenucust();
         }
         if(ae.getActionCommand()=="Log out")
         {
             frame.dispose();
             DarazClone d=new DarazClone();
         }
      }
    }
}
