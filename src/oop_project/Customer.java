/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;

 import java.io.Serializable;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Customer implements Serializable
{
    static Scanner input=new Scanner(System.in);
   protected String name,contact,email,password;
   Address ad;

    public Customer(String name, String contact,String email, String password, Address ad) {
        this.name = name;
        this.contact = contact;
        this.email=email;
        this.password = password;
        this.ad = ad;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }


    public Address getAd() {
        return ad;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   

    public void setAd(Address ad) 
    { 
       this.ad=ad;   
    }
   public void display()
    {
        System.out.println("The name   is " + name);
        System.out.println("The email  is " + email);
        System.out.println("The password is " + password);
        System.out.println("The password is " + contact);
        System.out.println("The addresss  is " + ad);
    }
     public static boolean searchcust(String n,String p)
    {
        ArrayList<Customer> list=readobj();
        boolean search=false;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getEmail().equals(n) && list.get(i).getPassword().equals(p))
            {
                search=true;
                break;
            }
            else
                search=false;
            
        }
        return search;
        
    }
   
   public static boolean chekemail(String e)
   {
       boolean esearch=true;
       ArrayList<Customer> list=readobj();
       for(int i=0;i<list.size();i++)
       {
           if(!(list.get(i).getEmail().toLowerCase().equals(e.toLowerCase())))
           {
               esearch=true;
           }
           else
           {
                esearch=false;
                break;
       
           }
              
       }
       return esearch;
       
   
   }
   public static boolean checkname(String n)
   {
       boolean found=false;
       char cust_check=0;
       for(int i=0;i<n.length();i++)
           {
               cust_check=n.charAt(i);
               if(Character.isLetter(cust_check))
               {
                   found=true;
               }    
               else
               {
                   found=false;
                   break;
               }
           }
       return found;
   }
   public static void writeToFile( Customer c )
    {
        ArrayList <Customer> list = readobj();
        list.add(c);
        try
        {
            ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream("Customer Record"));
            out.writeObject(list);
        }
        catch (IOException e)
        {
        }
    }
   public static ArrayList<Customer> readobj()
    {
        ArrayList<Customer> list = new ArrayList<Customer>();
        try
        {
            ObjectInputStream in = new ObjectInputStream (new FileInputStream("Customer Record"));
            list = (ArrayList<Customer>) in.readObject();
        }
        catch(ClassNotFoundException c)
        {
            
        }
        catch (IOException e)
        {
        }
        
        return list;
    }
   public static void displayAllRecords()
    {
        ArrayList <Customer> list = readobj();
        for( Customer c:list)
        {
             System.out.println("\nThe name is "+c.getName()+"\nThe contact number is "+c.getContact()+"\nThe email is " + c.getEmail() +"\nthe password   is "  + c.getPassword()+"\nthe address is" +c.getAd());
        }        
    }
   public static void update_password(String n,String pass)
   {
       ArrayList<Customer> list=readobj();
       boolean id_check=true;
       
       if(id_check==true)
       {
           for(int i=0;i<list.size();i++)
           {
               if(list.get(i).getEmail().equals(n))
               {
                   list.get(i).setPassword(pass);
                   break;
               }
           }
       }
       try 
       {
          ObjectOutputStream Output=new ObjectOutputStream(new FileOutputStream("Customer Record"));
          Output.writeObject(list);
       }
       catch (IOException e) 
       {
          System.out.println("Error");
       }
       
   }
   public static boolean check_contact(String c)
   {
       boolean check_validation=false;
       String format = ("\\d{3}-\\d{7}");
       String format_2 = ("\\d{4}-\\d{7}");
       if (c.matches(format) || c.matches(format_2)) 
       {
          check_validation= true;
       } 
       else 
       {
         check_validation = false;
       }
       return check_validation;
   }
    public static void update_Address(String n,Address a)
   {
       ArrayList<Customer> list=readobj();
       boolean id_check=true;
       
       if(id_check==true)
       {
           Address a2=new Address(a);
           for(int i=0;i<list.size();i++)
           {
               if(list.get(i).getEmail().equals(n))
               {
                   list.get(i).setAd(a2);
                   break;
               }
           }
       }
       
        try 
       {
          ObjectOutputStream Output=new ObjectOutputStream(new FileOutputStream("Customer Record"));
          Output.writeObject(list);
       }
       catch (IOException e) 
       {
          System.out.println("Error");
       }
       
   }
    public static void update_cont(String n,String con)
    {
       ArrayList<Customer> list=readobj();
       boolean id_check=true;
       if(id_check==true)
       {
           for(int i=0;i<list.size();i++)
           {
               if(list.get(i).getEmail().equals(n))
               {
                   list.get(i).setContact(con);
                   break;
               }
           }
       }
        try 
       {
          ObjectOutputStream Output=new ObjectOutputStream(new FileOutputStream("Customer Record"));
          Output.writeObject(list);
       }
       catch (IOException e) 
       {
          System.out.println("Error");
       }
       
   }
    public static void deletecustomer(String n,String p)
    {
        ArrayList <Customer> list = readobj();
       int index =0;
       for (int i =0; i < list.size() ; i++)
       {
           if (list.get(i).getPassword().toLowerCase()==p.toLowerCase() && list.get(i).getEmail().toLowerCase()==n.toLowerCase())
           {
               //System.out.println("VALUE FOUND NOW DELETING IT");
               index = i;
               break;
           }
       }
       if(list.size()!=0)
       {
           System.out.println("RECORD DELETED");
           list.remove(index); 
          
       }
       else
       {
           System.out.println("NO RECORD FOUND ");
           
       }
        try
        {
            ObjectOutputStream in=new ObjectOutputStream(new FileOutputStream("Customer Record"));
            in.writeObject(list);
        }
        catch(IOException e)
        {
            System.out.println("Exception Generated");
        }
    }
    
        
   
}