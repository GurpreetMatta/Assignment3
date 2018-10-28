/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.Scanner;

/**
 *
 * @author Gurpreet Singh
 */
class ComplexNumber
{
    private float real;
    private float img;
    public void display(float r,float i)
    {
        real=r;
        img=i;
        if(img>=0)
        {
            System.out.println("Complex Number =  "+real+ " + "+ " i"+img);
         
        }
        else
        {
            System.out.println("Complex Number =  "+real+ " - "+ " i"+(-img));
         
        }
    }
}
public class Program2 {
    public static void main(String args[])
    {
        ComplexNumber c=new ComplexNumber();
       
        float real,img;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter real part:");
        real=s.nextFloat();
        System.out.println("Enter img part:");
        img=s.nextFloat();
        c.display(real, img);
     
        
    }
    
}
