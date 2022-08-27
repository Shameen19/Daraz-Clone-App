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
public class Dresses implements Serializable 
{
    protected String code;
    protected String brand;
    protected String type;
    protected String price;
    protected String quantity;
    
    
    
    // CONSTRUCTORS
    static  ArrayList<String> CODE= new ArrayList<>();
    public Dresses()
    {
        
    }
    public Dresses(String code,String brand, String quantity, String type,String price)
    {
        this.brand=brand;
        this.code=code;
        this.price=price;
        this.quantity=quantity;
        this.type=type;
        
    }
    // GETTERS
    public String getCode() {
        return this.code;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getType() {
        return type;
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
        this.code = code;
    }

    public void setBrand(String brand) 
    {
       this.brand = brand; 
    }

    public void setType(String type) 
    {
        this.type = type;
    }

    public void setPrice(String price) 
    {
       this.price = price; 
    }

    public void setQuantity(String quantity) 
    {
       this.quantity = quantity;
    }
    // METHODS 
    public static boolean addProduct(String c,String b,String q,String t,String p)
    {
        String code_prod=c;
        String type_prod=t;
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
    public  static void writeProduct(Dresses dress)
    {
        ArrayList<Dresses> list = readAllDataFromFile();
        list.add(dress);
        try
        {
            ObjectOutputStream output = new ObjectOutputStream( new FileOutputStream("Dress Record"));
            output.writeObject(list);
        }
        catch (IOException e)
        {
            
        }
        
    }
    public  static void deleteProduct(String code)
    {
        ArrayList <Dresses> list = readAllDataFromFile();
       int index =0;
       for (int i =0; i < list.size() ; i++)
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
          ObjectOutputStream output = new ObjectOutputStream( new FileOutputStream("Dress Record"));
          output.writeObject(list);
       }
       catch (IOException e)
       {
            
       }
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
    public  static  ArrayList<Dresses> readAllDataFromFile(   )
    {
        ArrayList <Dresses> list = new ArrayList<Dresses>();
        
        try
        {
            ObjectInputStream input = new ObjectInputStream (new FileInputStream("Dress Record"));
            list = (ArrayList<Dresses>) input.readObject();
        }
        catch(ClassNotFoundException c)
        {
            
        }
        catch (IOException e)
        {
            
        }
        
        return list;
    }
    public static void UpdateQuantity(String code,String Updated_quantity)
    {
       boolean check_quantity=true;
       ArrayList<Dresses> list=readAllDataFromFile();
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
       }
       try 
       {
          ObjectOutputStream Output=new ObjectOutputStream(new FileOutputStream("Dress Record"));
          Output.writeObject(list);
       }
       catch (IOException e) 
       {
          System.out.println("Error");
       }
    }
    public static void UpdatePrice(String code,String Updated_price)
     {
       ArrayList<Dresses> list=readAllDataFromFile();
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
       }
       try 
       {
          ObjectOutputStream Output=new ObjectOutputStream(new FileOutputStream("Dress Record"));
          Output.writeObject(list);
       }
       catch (IOException e) 
       {
          System.out.println("Error");
       }
    }
    
    public static boolean searchDataFromFile(String code)
    {
       ArrayList <Dresses> list = readAllDataFromFile();
       for(int i=0;i<list.size();i++)
       {
          if(list.get(i).getCode().toLowerCase().equals(code.toLowerCase())) 
          {
              System.out.println(list.get(i).getCode()+"  "+list.get(i).getBrand()+"   "+list.get(i).getType()+"   "+list.get(i).getQuantity()+"   "+list.get(i).getPrice());
               return true;
          }
       }
       return false;
    }
    public static void display()
    {
        ArrayList <Dresses> list = readAllDataFromFile();
        System.out.println("DRESS CODE\t\tDRESS BRAND\t\tDRESS QUZNTITY\t\tDRESS TYPE\t\tDRESS PRICE");
        for(int i=0;i<list.size();i++)
        {
          System.out.println(list.get(i).getCode()+"\t\t\t"+list.get(i).getBrand()+"\t\t\t"+list.get(i).getType()+"\t\t\t"+list.get(i).getQuantity()+"\t\t\t"+list.get(i).getPrice());  
        }
        
    }
    
}
