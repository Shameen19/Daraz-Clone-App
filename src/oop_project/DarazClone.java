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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class DarazClone extends JFrame
{
    JButton b1,b2,b3;
    ImageIcon icon,icon2,icon3;
    JFrame frame;
    DarazClone()
    {
        frame=new JFrame();
        icon=new ImageIcon("signup1.png");
        icon2=new ImageIcon("signin.png");
        icon3=new ImageIcon("home1.png");
        frame.setSize(400,800);
        frame.setTitle("Daraz Home page");
        frame.setLayout(new GridLayout(3,3));
        frame.getContentPane().setBackground(new Color(30,20,40,40));
        b1= new JButton("SIGN UP");
        b1.setFont(new Font("Courgette",Font.BOLD,16));
        b1.setIcon(icon);
        b1.setHorizontalTextPosition(JButton.RIGHT);
        b1.setBackground(Color.white);
        b2= new JButton("SIGN IN");
        b2.setFont(new Font("Courgette",Font.BOLD,16));
        b2.setIcon(icon2);
        b2.setHorizontalTextPosition(JButton.RIGHT);
        b2.setBackground(Color.white);
        b3= new JButton("HOME");
        b3.setFont(new Font("Courgette",Font.BOLD,16));
        b3.setIcon(icon3);
        b3.setHorizontalTextPosition(JButton.RIGHT);
        b3.setBackground(Color.white);
        MyActionListener a = new MyActionListener();
        JPanel p1=new JPanel();
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        b3.addActionListener(a);
        b1.addActionListener(a);
        b2.addActionListener(a);
        frame.setVisible(true);

    }
    public class MyActionListener implements ActionListener
    {
      public void actionPerformed(ActionEvent ae)
      {
         if(ae.getActionCommand()=="SIGN UP")
         {
             frame.dispose();
             SIGN_UP d= new SIGN_UP();
         }
         if(ae.getActionCommand()=="SIGN IN")
         {
             frame.dispose();
             SIGN_IN d= new SIGN_IN();
         }
         if(ae.getActionCommand()=="HOME")
         {
             frame.dispose();
             WELCOME_PAGE w= new WELCOME_PAGE();
         }
         
      }
    }
    
}
