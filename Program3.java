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
public class Program3 {

public static void main(String args[])
    {   
        int a[]=new int[10];
        System.out.println("Enter the elements of array");
        Scanner s=new Scanner(System.in);
        int i,j;
        for(i=0;i<10;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=0;i<10;i++)
        {
            for(j=i+1;j<10;j++)
            {
                int temp;
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        int len=a.length;
        
        System.out.println("Secong largest number is"+a[len-2]);
        
    }
}


    

        
    

