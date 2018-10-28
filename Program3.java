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
public class Program3 {
    public void Print(float a)
    {
        System.out.println(a);    
    }
    public void Print(int a)
    {
        System.out.println(a);       
    }
    public void Print(String a)
    {
        System.out.println(a);       
    }
    public static void main(String args[])
    {
        Program3 p= new Program3();
        p.Print(null);
        p.Print(3.14f);
        p.Print(20);
    }
}
