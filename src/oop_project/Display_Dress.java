/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author chaud
 */
public class Display_Dress extends JFrame
{
    JButton b1,b2;
    Display_Dress()
    {
        setSize(400,600);
        setLayout(new GridLayout(2,2));
        b1= new JButton("DISPLAY RECORD");
        b2= new JButton("HOME");
        add(b1);
        add(b2);
        MyActionListener a = new MyActionListener();
        b1.addActionListener(a);
        b2.addActionListener(a);
        setVisible(true);
    }
    public class MyActionListener implements ActionListener
    {
      public void actionPerformed(ActionEvent ae)
      {
         if(ae.getActionCommand()=="DISPLAY RECORD")
         {
            ArrayList<Dresses> c= Dresses.readAllDataFromFile();
            for(int i=0;i<c.size();i++)
            {
                JOptionPane.showMessageDialog(null,c.get(i).getCode()+"  "+c.get(i).getBrand()+"  "+c.get(i).getQuantity()+"  "+c.get(i).getType()+c.get(i).getPrice());
            }
         }
         if(ae.getActionCommand()=="HOME")
         {
             dispose();
             Dress_menu c= new Dress_menu();
         }
      }
}
    
}
