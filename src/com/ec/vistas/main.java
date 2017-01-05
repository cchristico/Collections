/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.vistas;

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
        // TODO code application logic here
        //Arreglo de strings
        String personas[]= new String[5];
        System.out.println(personas.length);
        personas[0]="Manuel";
        personas[1]="Maria";
        personas[2]="Juana";
        personas[3]="Pepina";
        personas[4]="Dulcinea";
        System.out.println(personas[0]+"\n"+personas[1]+"\n"+personas[2]+"\n"+personas[3]+"\n"+personas[4]);
         Random rnd = new Random();
        /*
        Llenado "Dinamico"
        */
        System.out.println("Ingrese la longitud del arreglo");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Double numerosRandomicos[]= new Double[n];
        System.out.println("Longitud antes de llenar:"+numerosRandomicos.length);
        for(int i=0;i<numerosRandomicos.length;i++)
        {
            numerosRandomicos[i]=rnd.nextDouble();
        }
        for(Double num:numerosRandomicos)
        {
            System.out.print(" "+num+" ");
        }
        System.out.println("");
        System.out.println("Longitud despues de llenar:"+numerosRandomicos.length);
    }
    
}
