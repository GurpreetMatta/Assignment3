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
class Rectangle
{
    private float length;
    private float bredth;
    public void CalculateArea(float l,float b)
    {
        length=l;
        bredth=b;
        float area=length*bredth;
        System.out.println("Area of Rectangle is"+area);
        
    }
    
}
public class Program1 {
    
    public static void main(String args[])
    {
        float l,b;
        System.out.println("Enter Length:");
        Scanner s=new Scanner(System.in);
        l=s.nextFloat();
        System.out.println("Enter Bredth:");
        b=s.nextFloat();
        Rectangle r= new Rectangle();
        r.CalculateArea(l,b);
        
        
        
    }
}
