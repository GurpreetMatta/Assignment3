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
public class program4 {
    public static void main(String ags[])
    {
        int a[]=new int[10];
        System.out.println("Enter the elements of array");
        Scanner s=new Scanner(System.in);
        int i,j;
        for(i=0;i<10;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=0;i%2==0 && i<10;i=i+2)
        {
          int temp;
          temp=a[i];
          a[i]=a[i+1];
          a[i+1]=temp;
            
        }
        System.out.println("Array in waveform is");
         for(i=0;i<10;i++)
         {
             System.out.println(a[i]);
         }
    }  
}
