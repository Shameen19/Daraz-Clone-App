/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

 

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

 

/**
 *
 * @author chaud
 */
public class ADD_TO_CART_GUI extends JFrame
{
   JButton c1;
   JButton c2;
   JButton c3;
    JButton c4;
   JLabel l1,l2;
   JTextField t1,t2;
   JButton b1,b2;
   JButton o1,o2,o3,o4;
   ADD_TO_CART_GUI()
   {
        setSize(400,600);
        setLayout(new BorderLayout());
        b1= new JButton("HOME");
        b2=new JButton("SHOW BILL");
        o1= new JButton("ORDER DRESS");
        o2= new JButton("ORDER SPORTS");
        o3= new JButton("ORDER COSMETICS");
        o4= new JButton("ORDER HOME APPLIANCES");
        l1= new JLabel("ENTER THE CODE");
        l2= new JLabel("ENTER QUANTITY");
        JPanel p4= new JPanel();
       
        p4.setLayout(new GridLayout(2,2));
        t1= new JTextField(20);
        t2= new JTextField(20);
        c1=new  JButton ("SHOP DRESSES");
        c2=new  JButton ("SHOP SPOTS ITEM");
        c3= new  JButton ("SHOP COSMETICS");
        c4= new  JButton ("SHOP HOME APPLIANCES");
        JPanel p1= new JPanel();
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.setLayout(new GridLayout(2,2));
        JPanel p2= new JPanel();
        p2.add(c1);
        p2.add(c2);
        p2.add(c3);
        p2.add(c4);
        p2.add(o1);
        p2.add(o2);
        p2.add(o3);
        p2.add(o4);
        JPanel p3= new JPanel();
        p3.add(b1);
        p3.add(b2);
        add(p3,BorderLayout.SOUTH);
        add(p2,BorderLayout.CENTER);
        add(p1,BorderLayout.NORTH);
        c1.addActionListener(new MyActionListener() );
        c2.addActionListener(new MyActionListener() );
        c3.addActionListener(new MyActionListener() );
        c4.addActionListener(new MyActionListener() );
        b1.addActionListener(new MyActionListener() );
        b2.addActionListener(new MyActionListener());
        o1.addActionListener(new MyActionListener());
        o2.addActionListener(new MyActionListener());
        o3.addActionListener(new MyActionListener());
        o4.addActionListener(new MyActionListener());
        setVisible(true);
   }
   
   public class MyActionListener implements ActionListener
    {
      public void actionPerformed(ActionEvent ae)
      {
         if(ae.getActionCommand()=="SHOP DRESSES")
         {
             ArrayList<Dresses> d= Dresses.readAllDataFromFile();
             for(int i=0;i<d.size();i++)
             {
                 JOptionPane.showMessageDialog(null, d.get(i).getCode()+" "+d.get(i).getBrand()+" "+d.get(i).getPrice()+" "+d.get(i).getType());
             }
            
           
         }
         if(ae.getActionCommand()=="ORDER DRESS")
         {
             AddToCart c= new AddToCart();
             if(t1.getText().isEmpty() && t2.getText().isEmpty()   )
             {
                 JOptionPane.showMessageDialog(null,"PLEASE FILL THE TEXT FIELDS FIRST");
             }
             if(t1.getText().isEmpty() || t2.getText().isEmpty())
             {
                 JOptionPane.showMessageDialog(null,"PLEASE FILL THE TEXT FIELDS FIRST");
             }
             else
             {
                if(c.orderDress(t1.getText(),(t2.getText()))==true)
                {
                   JOptionPane.showMessageDialog(null,"YOUR ORDER IS TAKEN");
                   JOptionPane.showMessageDialog(null,"WE WILL DELIEVER YOUR ODER IN 3 T 4 DAYS ");       
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "ITEM OUT OF STROKE");
                }
                
             }
         }
         if(ae.getActionCommand()=="ORDER SPORTS")
         {
             AddToCart c= new AddToCart();
             if(t1.getText().isEmpty() && t2.getText().isEmpty()   )
             {
                 JOptionPane.showMessageDialog(null,"PLEASE FILL THE TEXT FIELDS FIRST");
             }
             if(t1.getText().isEmpty() || t2.getText().isEmpty())
             {
                 JOptionPane.showMessageDialog(null,"PLEASE FILL THE TEXT FIELDS FIRST");
             }
             else
             {
                if(c.orderSports(t1.getText(), (t2.getText()))==true)
                {
                  JOptionPane.showMessageDialog(null,"YOUR ORDER IS TAKEN");
                  JOptionPane.showMessageDialog(null,"WE WILL DELIEVER YOUR ODER IN 3 T 4 DAYS ");      
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "ITEM OUT OF STROKE");
                }
                 
             }
         }
         if(ae.getActionCommand()=="ORDER COSMETICS")
         {
             AddToCart c= new AddToCart();
             if(t1.getText().isEmpty() && t2.getText().isEmpty()   )
             {
                 JOptionPane.showMessageDialog(null,"PLEASE FILL THE TEXT FIELDS FIRST");
             }
             if(t1.getText().isEmpty() || t2.getText().isEmpty())
             {
                 JOptionPane.showMessageDialog(null,"PLEASE FILL THE TEXT FIELDS FIRST");
             }
             else
             {
                if(c.orderCosmetics(t1.getText(), (t2.getText()))==true)
                {
                    JOptionPane.showMessageDialog(null,"YOUR ORDER IS TAKEN");
                    JOptionPane.showMessageDialog(null,"WE WILL DELIEVER YOUR ODER IN 3 T 4 DAYS ");      
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"ITEM OUT OF STROKE");
                }
             }
         }
         if(ae.getActionCommand()=="ORDER HOME APPLIANCES")
         {
             AddToCart c= new AddToCart();
             if(t1.getText().isEmpty() && t2.getText().isEmpty()   )
             {
                 JOptionPane.showMessageDialog(null,"PLEASE FILL THE TEXT FIELDS FIRST");
             }
             if(t1.getText().isEmpty()|| t2.getText().isEmpty())
             {
                 JOptionPane.showMessageDialog(null,"PLEASE FILL THE TEXT FIELDS FIRST");
             }
             else
             {
                if(c.orderHomeAppliances(t1.getText(),(t2.getText()))==true)
                {
                    JOptionPane.showMessageDialog(null,"YOUR ORDER IS TAKEN");
                    JOptionPane.showMessageDialog(null,"WE WILL DELIEVER YOUR ODER IN 3 T 4 DAYS ");    
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"ITEM OUT OF STROKE");
                }
             }
         }
         
         if(ae.getActionCommand()=="SHOP SPORTS ITEMS")
         {
             ArrayList<Sports> d= Sports.readAllDataFromFile();
             for(int i=0;i<d.size();i++)
             {
                 JOptionPane.showMessageDialog(null, d.get(i).getCode()+" "+d.get(i).getBrand()+" "+d.get(i).getPrice()+" "+d.get(i).getName());
             } 
         }
         if(ae.getActionCommand()=="SHOP COSMETICS")
         {
              ArrayList<Cosmetics> d= Cosmetics.readAllDataFromFile();
             for(int i=0;i<d.size();i++)
             {
                 JOptionPane.showMessageDialog(null, d.get(i).getCode()+" "+d.get(i).getBrand()+" "+d.get(i).getPrice()+" "+d.get(i).getName());
             }
         }
         if(ae.getActionCommand()=="SHOP HOME APPLIANCES")
         {
              ArrayList<HomeAppliances> d= HomeAppliances.readAllDataFromFile();
             for(int i=0;i<d.size();i++)
             {
                 JOptionPane.showMessageDialog(null, d.get(i).getCode()+" "+d.get(i).getBrand()+" "+d.get(i).getPrice()+" "+d.get(i).getName());
             }
         }
         if(ae.getActionCommand()=="HOME")
         {
              dispose();
              SIGN_IN C= new SIGN_IN();
         }
         if(ae.getActionCommand()=="SHOW BILL")
         {
             order o = new order();
             JOptionPane.showMessageDialog(null, "YOUR TOTAL BILL IS   "+" "+o.get_bill());
             JOptionPane.showMessageDialog(null, "WE WILL DELIEVER YOUR ORDER IN 3 TO 4 DAYS");
             JOptionPane.showMessageDialog(null,"THANKYOU FOR SHOPPING");
             o.set_bill(0);
         }
        
      }
    }

   
}
