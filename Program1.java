/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

/**
 *
 * @author Gurpreet Singh
 */
public class Program1 {
    /*There are 2 type of initialization block
        1. Instance initialization block 2. static initialization block
        instance initialization block is piece of code written within curly brackets that is within 
    {
        ------
    }
    this block executed when instance of class is creatd
        2. Static initialization block is the piece of code written within curly braces and named it static that is
    
        static
    {
        -------
    }
    this is executed only when class is initiated
    */
    
    private static int k;// by default staic variable are initial with 0
    static
    {
        System.out.println("Stattc initialization K= "+k);
        
        for(int i=1;i<=10;i++)
        { System.out.println("Stattc initialization K= "+k);
            k++;
        }
    }
    
    public static void main (String a[])
    {
        new Program1();
      
    }
    
}

