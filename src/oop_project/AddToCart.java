/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class AddToCart
{
    String customer_name;
    static double bill;
    String quant;
    order o;
    AddToCart()
    {
        o= new order();
    }
    public  boolean orderDress(String code, String q)
    {
        boolean found=Dresses.searchDataFromFile(code);
        int quant=0;
        String price;
        int index=0;
        boolean check=false;
        int q1=Integer.parseInt(q);
        bill=0;
        Scanner input= new Scanner(System.in);
        if(found==true)
        {
            ArrayList<Dresses> list= Dresses.readAllDataFromFile();
            for(int i=0;i<list.size();i++)
            {
                
                if(list.get(i).getCode().toLowerCase().equals(code.toLowerCase()))
                {
                    System.out.println("ITEM FOUND IN THE RECORD");
                    quant=Integer.parseInt(list.get(i).getQuantity());
                    price=list.get(i).getPrice();
                    index=i;
                }
            }
            if(q1>quant)
            {
                System.out.println("ITEM OUT OF STROKE");
                check=false;
                return check;
            }
            else
            {
              String k=Integer.toString(quant-q1);
              list.get(index).setQuantity(k);
              price=list.get(index).getPrice();
              bill=q1*Integer.parseInt(price);  
              o.add_order(bill);
              check=true;
            }
        }
        return check;
    }
    
    public  boolean orderSports(String code, String q)
    {
        boolean found=Sports.searchDataFromFile(code);
        int quant=0;
        String price;
        int index=0;
        int q1= Integer.parseInt(q);
        bill=0;
        boolean check=false;
        Scanner input= new Scanner(System.in);
        if(found==true)
        {
            ArrayList<Sports> list= Sports.readAllDataFromFile();
            for(int i=0;i<list.size();i++)
            {
                
                if(list.get(i).getCode().toLowerCase().equals(code.toLowerCase()))
                {
                    System.out.println("ITEM FOUND IN THE RECORD");
                    quant=Integer.parseInt(list.get(i).getQuantity());
                    price=list.get(i).getPrice();
                    index=i;
                }
            }
            if(q1>quant)
            {
                System.out.println("ITEM OUT OF STROKE");
                check=false;
                return check;
            }
            else
            {
              String k=Integer.toString(quant-q1);
              list.get(index).setQuantity(k);
              price=list.get(index).getPrice();
              bill=q1*Integer.parseInt(price);   
              check=true;
            }
        }
        o.add_order(bill);
        return check;
    }
    
    public boolean orderCosmetics(String code, String q)
    {
        boolean found=Cosmetics.searchDataFromFile(code);
        int quant=0;
        String price;
        int index=0;
        boolean check=false;
        int q1=Integer.parseInt(q);
        bill=0;
        Scanner input= new Scanner(System.in);
        if(found==true)
        {
            ArrayList<Cosmetics> list= Cosmetics.readAllDataFromFile();
            for(int i=0;i<list.size();i++)
            {
                
                if(list.get(i).getCode().toLowerCase().equals(code.toLowerCase()))
                {
                    System.out.println("ITEM FOUND IN THE RECORD");
                    quant=Integer.parseInt(list.get(i).getQuantity());
                    price=list.get(i).getPrice();
                    index=i;
                }
            }
            if(q1>quant)
            {
                System.out.println("ITEM OUT OF STROKE");
                check=false;
                return check;
            }
            
            else
            {
              String k=Integer.toString(quant-q1);
              list.get(index).setQuantity(k);
              price=list.get(index).getPrice();
              bill=q1*Integer.parseInt(price);   
              check=true;
            }
        }
        o.add_order(bill);
        return check;
    }
    public boolean orderHomeAppliances(String code, String q)
    {
        boolean found=HomeAppliances.searchDataFromFile(code);
        int quant=0;
        String price;
        int index=0;
        bill=0;
        boolean check=false;
        int q1=Integer.parseInt(q);
        Scanner input= new Scanner(System.in);
        if(found==true)
        {
            ArrayList<HomeAppliances> list= HomeAppliances.readAllDataFromFile();
            for(int i=0;i<list.size();i++)
            {
                
                if(list.get(i).getCode().toLowerCase().equals(code.toLowerCase()))
                {
                    System.out.println("ITEM FOUND IN THE RECORD");
                    quant=Integer.parseInt(list.get(i).getQuantity());
                    price=list.get(i).getPrice();
                    index=i;
                }
            }
            if(q1>quant)
            {
                System.out.println("ITEM OUT OF STROKE");
                check=false;
                return check;
            }
            else
            {
              String k=Integer.toString(quant-q1);
              list.get(index).setQuantity(k);
              price=list.get(index).getPrice();
              bill=q1*Integer.parseInt(price);      
             
            }
        }
         o.add_order(bill);
         return check;
}
}
