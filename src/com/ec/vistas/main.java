/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.vistas;

import com.ec.entidades.Persona;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cchristico
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      Random rnd = new Random();
        
        //Llenado "Dinamico"
        
        System.out.println("Ingrese la longitud del arreglo");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer numerosRandomicos[]= new Integer[n];
        System.out.println("Longitud antes de llenar:"+numerosRandomicos.length);
        for(int i=0;i<numerosRandomicos.length;i++)
        {
            numerosRandomicos[i]=i+1;
        }
        int count=0;
        for(Integer num:numerosRandomicos)
        {
            if(num%2==0)
            {
                count++;
            }
            System.out.print(" "+num+" ");
        }
        System.out.println("");
        
        System.out.println("Longitud eliminando los pares: "+(numerosRandomicos.length-count));
        Integer [] numerosRandomicos2= new Integer[numerosRandomicos.length-count];
        int nu=1;
        for(int i=0;i<numerosRandomicos2.length;i++)
        {
            
            if(nu%2!=0)
            {
                numerosRandomicos2[i]=nu;
                nu=nu+2;
            }
        }
        for(Integer num:numerosRandomicos2)
        {
            System.out.print(num+" ");
        }
        
        System.out.println("\nLongitud despues de llenar:"+numerosRandomicos2.length);
        
    }    
}
