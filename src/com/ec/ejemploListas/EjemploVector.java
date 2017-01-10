/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.ejemploListas;

/**
 *
 * @author AuditaQ
 */
public class EjemploVector {
   public static void main(String[] args) {   
     int a[]= new int[10];
     String [] nombre = {"María", "Gerson","José"}; 
    
     
     for (int i=0;i<10;i++)
        {
             
            a[i]= (int) (Math.random()*(100-10+1)+10);
         
             
        }
     
     for (int i=0;i<10;i++)
        {
             
            System.out.print(a[i]+",");
            
         
        }
     System.out.println("");
     
     for (int i=0;i<nombre.length;i++)
        {
             
           
            System.out.print(nombre[i]+",");
         
        }
     
     arrayObjetos[0]=new Empleado("Fernando", "Ureña", 23, 1000);
		arrayObjetos[1]=new Empleado("Epi", "Dermis", 30, 1500);
		arrayObjetos[2]=new Empleado("Blas", "Femia", 25, 1200);
     
     
}
}
