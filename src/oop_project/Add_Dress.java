
package oop_project;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Add_Dress extends JFrame
{
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2;
    Add_Dress()
    {
        setSize(400,600);
        setLayout( new BorderLayout());
        b1= new JButton("SUBMIT");
        b2= new JButton("HOME");
        l1= new JLabel("ENTER DRESS CODE");
        l2= new JLabel("ENTER DRESS BRAND");
        l3= new JLabel("ENTER DRESS QUANTITY");
        l4= new JLabel("ENTER DRESS TYPE");
        l5= new JLabel("ENTER DRESS PRICE");
        t1= new JTextField(20);
        t2= new JTextField(20);
        t3= new JTextField(20);
        t4= new JTextField(20);
        t5= new JTextField(20);
        JPanel p1= new JPanel();
        JPanel p2=new JPanel();
        p1= new JPanel();
        p1.setLayout(new GridLayout(10,2));
        p2= new JPanel();
        p2.setLayout(new FlowLayout());
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p1.add(l4);
        p1.add(t4);
        p1.add(l5);
        p1.add(t5);
        
        p2.add(b1);
        p2.add(b2);
        add(p1,BorderLayout.CENTER);
        add(p2,BorderLayout.SOUTH);
        b1.addActionListener(new MyActionListener() );
        b2.addActionListener(new MyActionListener() );
        setVisible(true);
        
    }
    public class MyActionListener implements ActionListener
    {
      public void actionPerformed(ActionEvent ae)
      {
        
         if(ae.getActionCommand()=="SUBMIT")
         {
             if(t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty() || t4.getText().isEmpty() || t5.getText().isEmpty())
             {
                 JOptionPane.showMessageDialog(null, "PLEASE FIRST FILL ALL TEXT FILEDS");
             }
             else
             {
                 if(Dresses.addProduct(t1.getText(), t2.getText(), t3.getText(), t4.getText(), t5.getText())==true)
                 {
                     Dresses c= new Dresses(t1.getText(),t2.getText(),t3.getText(),t4.getText(),t5.getText());
                     Dresses.writeProduct(c);
                     JOptionPane.showMessageDialog(null,"SUBMITTED");
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(null,"INVALID INPUT");
                 }
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
