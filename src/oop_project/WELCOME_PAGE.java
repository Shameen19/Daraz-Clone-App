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
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class WELCOME_PAGE extends JFrame
{
    JButton b1,b2;
    JLabel l1;
    ImageIcon image1;
    JFrame frame;
    WELCOME_PAGE()
    {
        frame=new JFrame();
        frame.setSize(400,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Draz online shopping");
        image1=new ImageIcon("daraz.png");
        frame.setIconImage(image1.getImage());
        frame.getContentPane().setBackground(new Color(10,10,56,56));
        l1=new JLabel();
        l1.setText("WELCOME TO Daraz Online");
        l1.setIcon(image1);
        l1.setHorizontalTextPosition(JLabel.RIGHT);
        l1.setForeground(new Color(20,20,20));
        l1.setFont(new Font("MV Boli",Font.ITALIC,16));
        frame.setLayout(new GridLayout(3,1));
        b1= new JButton("GO TO MAIN MENU");
        b2= new JButton("EXIT");
        MyActionListener a = new MyActionListener();
        frame.add(l1) ;
        frame.add(b1);
        frame.add(b2);
        b1.addActionListener(a);
        b2.addActionListener(a);
       frame.setVisible(true);

    }
    public class MyActionListener implements ActionListener
    {
      public void actionPerformed(ActionEvent ae)
      {
         if(ae.getActionCommand()=="GO TO MAIN MENU")
         {
             frame.dispose();     
             DarazClone c= new DarazClone();
             
         }
         if(ae.getActionCommand()=="EXIT")
         {
             frame.dispose();
             System.exit(0);
         }
         
      }
    
    }
}
