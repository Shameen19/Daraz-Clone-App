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
import java.util.Objects;

public class Admin implements Serializable 
{
    
   static  String email="admin1567@daraz.pk";
    static String pswd="Addprod123_class";
    Dresses d;
    Cosmetics c;
    Sports s;
    HomeAppliances a;
    public Admin(String email, String pswd) {
        this.email = email;
        this.pswd = pswd;
    }

    public Admin() {
    }
    Admin( Admin ad)
    {
      this.email=ad.email;
      this.pswd=ad.pswd;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPswd() {
        return this.pswd;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }
    public static boolean search(String e, String p)
    {
        if(email.equals(e) && pswd.equals(p))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
     public static void writeToFile( Admin c )
     {
        ArrayList <Admin> list = readobj();
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
    
    public static ArrayList<Admin> readobj()
    {
        ArrayList<Admin> list = new ArrayList<Admin>();
        try
        {
            ObjectInputStream in = new ObjectInputStream (new FileInputStream("Admin Record"));
            list = (ArrayList<Admin>) in.readObject();
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
