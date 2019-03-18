/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15_3_2019;

import java.util.Scanner;

/**
 *
 * @author Fdim_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("dwsearithmiti :");
        int x=sc.nextInt();
        
        System.out.println("dwse paronomasti :");
        int y=sc.nextInt();
       
        System.out.println("to piliko einai :"+x/y);
       }
       catch(ArithmeticException e){
           System.out.println("Exception thrown :"+e);
           
       }
        
        // TODO code application logic here
    }
    
    }
