/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;

/**
 *
 * @author chaud
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Address implements Serializable {
    protected String homeno,streetno;
    protected String city;

    public Address() {
    }

    public Address(String homeno, String streetno, String city) {
        this.homeno = homeno;
        this.streetno = streetno;
        this.city = city;
    } 
    public Address(Address a)
    {
        homeno=a.homeno;
        streetno =a.streetno ;
        city=a.city;
    }
    public String getHomeno() {
        return homeno;
    }

    public String getStreetno() {
        return streetno;
    }

    public String getCity() {
        return city;
    }

    public void setHomeno(String homeno) {
        this.homeno = homeno;
    }

    public void setStreetno(String streetno) {
        this.streetno = streetno;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public static boolean homecheck(String h)
    {
        boolean ho=false;
        char k;
        for(int i=0;i<h.length();i++)
        {
             k= h.charAt(i);
            if(Character.isDigit(k) || Character.isLetter(k))
            {
                ho=true;
            }
            else
            {
                ho=false;
                break;
            }
            
        }
        return ho;
    }
    public static boolean streetcheck(String s)
    {
        boolean so=false;
        char k;
        for(int i=0;i<s.length();i++)
        {
             k= s.charAt(i);
            if(Character.isDigit(k))
            {
                so=true;
            }
            else
            {
                so=false;
                break;
            }
            
        }
        return so;
    }
      public static boolean citycheck(String c)
    {
        boolean co=false;
        char k;
        for(int i=0;i<c.length();i++)
        {
             k= c.charAt(i);
            if(Character.isLetter(k))
            {
                co=true;
            }
            else
            {
                co=false;
                break;
            }
            
        }
        return co;
    }
    
     public static void writeToFile( Address s )
    {
        ArrayList <Address> list = readAllDataFromFile();
        list.add(s);
        try
        {
            ObjectOutputStream output = new ObjectOutputStream( new FileOutputStream("Address Record"));
            output.writeObject(list);
        }
        catch (IOException e)
        {
            
        }
    }
    public static ArrayList<Address> readAllDataFromFile(   )
    {
        ArrayList <Address> list = new ArrayList<Address>();
        
        try
        {
            ObjectInputStream input = new ObjectInputStream (new FileInputStream("Address Record"));
            list = (ArrayList<Address>) input.readObject();
        }
        catch(ClassNotFoundException c)
        {
            
        }
        catch (IOException e)
        {
            
        }
        
        return list;
    }
    
}