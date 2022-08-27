/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author chaud
 */
public class Cosmetics implements Serializable
{
    protected String code;
    protected String brand;
    protected String price;
    protected String quantity;
    protected String name;
    
    // CONSTRUCTORS
    static ArrayList<String> CODE= new ArrayList<>();
    public Cosmetics()
    {
        
    }
    public Cosmetics(String code,String brand, String quantity, String name,String price)
    {
        this.code=code;
        this.brand=brand;
        this.quantity=quantity;
        this.name=name;
        this.price=price;
    }
    // GETTERS
    public String getCode() {
        return this.code;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return this.price;
    }

    public String getQuantity() {
        return this.quantity;
    }
    // SETTERS
    public void setCode(String code) 
    {
        this.code=code;
        
    }

    public void setBrand(String brand) 
    {
        this.brand=brand;
    }

    public void setName(String name) 
    {
        this.name=name;
    }

    public void setPrice(String price) 
    {
        this.price=price;
        
    }

    public void setQuantity(String quantity) 
    {
        this.quantity= quantity;
        
    }
    // METHODS 
    public static boolean addProduct(String c,String b,String q,String n,String p)
    {
        String code_prod=c;
        String type_prod=n;
        String brand_prod=b;
        String price_prod=p;
        String quantity_prod=q;
        boolean check=false;
        for(int h=0;h<code_prod.length();h++)
        {
           char passenger_id=code_prod.charAt(h);
           if (Character.isDigit(passenger_id))
           {
               check=true;
           }
           else
           {
              check=false;
           }
        }
        if (CODE.contains(code_prod))
        {
            check=false;
        }
        CODE.add(code_prod);
        for(int h=0;h<brand_prod.length();h++)
        {
           char ql=brand_prod.charAt(h);
           if (Character.isLetter(ql))
           {
                  check=true;
           }
           else
           {
                check=false;
           }
        }
        for(int h=0;h<type_prod.length();h++)
        {
           char qk=type_prod.charAt(h);
           if (Character.isLetter(qk))
           {
              check=true;
           }
           else
           {
             check=false;
           }
        }
        for(int h=0;h<quantity_prod.length();h++)
        {
          char qm=quantity_prod.charAt(h);
          if (Character.isDigit(qm))
          {
             check=true;
          }
          else
          {
            check=false;
           }
        }
        for(int h=0;h<price_prod.length();h++)
        {
              char qi=price_prod.charAt(h);
              if (Character.isDigit(qi))
              {
                  check=true;
              }
              else
              {
                check=false;
              }
        }
        return check;
        
    }
    public  static void writeProduct(Cosmetics cosmetics)
    {
        ArrayList<Cosmetics> list = readAllDataFromFile();
        list.add(cosmetics);
        try
        {
            ObjectOutputStream output = new ObjectOutputStream( new FileOutputStream("Cosmetics Record"));
            output.writeObject(list);
        }
        catch (IOException e)
        {
            
        }
        
    }
    public  static void deleteProduct(String code)
    {
        ArrayList <Cosmetics> list = readAllDataFromFile();
       int index =0;
       for (int i =0; i< list.size() ; i++)
       {
           if (list.get(i).getCode()==code)
           {
               System.out.println("VALUE FOUND NOW DELETING IT");
               index = i;
               break;
           }
       }
       if(list.size()!=0)
       {
           list.remove(index);   
       }
       else
       {
           System.out.println("NO RECORD FOUND ");
       }
       try
       {
          ObjectOutputStream output = new ObjectOutputStream( new FileOutputStream("Cosmetics Record"));
          output.writeObject(list);
       }
       catch (IOException e)
       {
            
       }
    }
    
    
    public  static  ArrayList<Cosmetics> readAllDataFromFile(   )
    {
        ArrayList <Cosmetics> list = new ArrayList<Cosmetics>();
        
        try
        {
            ObjectInputStream input = new ObjectInputStream (new FileInputStream("Cosmetics Record"));
            list = (ArrayList<Cosmetics>) input.readObject();
        }
        catch(ClassNotFoundException c)
        {
            
        }
        catch (IOException e)
        {
            
        }
        
        return list;
    }
    public static boolean checkPrice(String p)
    {
        boolean check=false;
        for(int h=0;h<p.length();h++)
        {
              char qi=p.charAt(h);
              if (Character.isDigit(qi))
              {
                  check=true;
              }
              else
              {
                check=false;
              }
        }
        return check;
    }
    public static boolean checkQuantity(String q)
    {
        boolean check=false;
        for(int h=0;h<q.length();h++)
        {
              char qi=q.charAt(h);
              if (Character.isDigit(qi))
              {
                  check=true;
              }
              else
              {
                check=false;
              }
        }
        return check;
    }
    public static void UpdateQuantity(String code,String Updated_quantity)
    {
       ArrayList<Cosmetics> list=readAllDataFromFile();
       boolean check_quantity=true;
       Scanner input= new Scanner(System.in);
       String Updated;
       
       while(check_quantity==true)
       {
           for(int h=0;h<Updated_quantity.length();h++)
           {
              char q=Updated_quantity.charAt(h);
              if (Character.isDigit(q))
              {
                  check_quantity=false;
              }
              else
              {
                check_quantity=true;
              }
           }
           if(check_quantity==true)
           {
               System.out.println("QUANTITY MUST BE IN DIGIT FORM");
               System.out.println("ENTER AGAIN THE UPDATED QUANTITY");
               Updated=input.next();
               Updated_quantity=Updated;
           }
       }
       for(int i=0;i<list.size();i++)
       {
          if(list.get(i).getCode().toLowerCase().equals(code.toLowerCase())) 
          {
               list.get(i).setQuantity(Updated_quantity);
               break;
          }
          else
          {
              System.out.println("NO RECORD OF DRESS FOUND AGAINST THIS CODE");
          }
       }
       try 
       {
          ObjectOutputStream Output=new ObjectOutputStream(new FileOutputStream("Cosmetics Record"));
          Output.writeObject(list);
       }
       catch (IOException e) 
       {
          System.out.println("Error");
       }
    }
    public static void UpdatePrice(String code,String Updated_price)
     {
       ArrayList<Cosmetics> list=readAllDataFromFile();
       Scanner input= new Scanner(System.in);
       String Updated;
       boolean check_price=true;
       while(check_price==true)
       {
           for(int h=0;h<Updated_price.length();h++)
           {
              char p=Updated_price.charAt(h);
              if (Character.isDigit(p))
              {
                  check_price=false;
              }
              else
              {
                check_price=true;
              }
           }
           if(check_price==true)
           {
               System.out.println("PRICE MUST BE IN DIGIT FORM");
               System.out.println("ENTER AGAIN THE UPDATED PRICE");
               Updated=input.next();
               Updated_price=Updated;
           }
       }
       for(int i=0;i<list.size();i++)
       {
          if(list.get(i).getCode().toLowerCase().equals(code.toLowerCase())) 
          {
               list.get(i).setPrice(Updated_price);
               break;
          }
          else
          {
              System.out.println("NO RECORD OF DRESS FOUND AGAINST THIS CODE");
          }
       }
       try 
       {
          ObjectOutputStream Output=new ObjectOutputStream(new FileOutputStream("Cosmetics Record"));
          Output.writeObject(list);
       }
       catch (IOException e) 
       {
          System.out.println("Error");
       }
    }
    

    
    
    
    public static boolean searchDataFromFile(String code)
    {
       ArrayList <Cosmetics> list = readAllDataFromFile();
       for(int i=0;i<list.size();i++)
       {
          if(list.get(i).getCode().toLowerCase().equals(code.toLowerCase())) 
          {
              System.out.println(list.get(i).getCode()+"  "+list.get(i).getBrand()+"   "+list.get(i).getName()+"   "+list.get(i).getQuantity()+"   "+list.get(i).getPrice());
               return true;
          }
       }
       return false;
    }
    public static void display()
    {
        ArrayList <Cosmetics> list = readAllDataFromFile();
        System.out.println("COSMETICS CODE\t\tCOSMETICS BRAND\t\tCOSMETICS NAME\t\tCOSMETICS QUZNTITY\t\tCOSMETICS PRICE");
        for(int i=0;i<list.size();i++)
        {
          System.out.println(list.get(i).getCode()+"\t\t\t"+list.get(i).getBrand()+"\t\t\t"+list.get(i).getName()+"\t\t\t"+list.get(i).getQuantity()+"\t\t\t"+list.get(i).getPrice());  
        }
        
    }
    
}

