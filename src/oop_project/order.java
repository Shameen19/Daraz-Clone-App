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
public class order 
{
    static double BILL;
    order()
    {
        
    }
    public  void add_order(double b)
    {
        this.BILL=BILL+b;
    }
    public double get_bill()
    {
        return BILL;
    }
    public void set_bill(double b)
    {
        this.BILL=0;
    }
    
}
