/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.ejemploListas;
    import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author AuditaQ
 */

public class EjemploLinkedlistvsArrayList {
    public static void main(String arg[]) {
            List<Persona> listaarray = new ArrayList<Persona>();
            List<Persona> listalinked = new LinkedList<Persona>();
            long antes;
            for(int i=0;i<10000;i++)
            {
               listaarray.add(new Persona(i,"Persona"+i,i));  // En este ejemplo cada persona lleva datos ficticios
                listalinked.add(new Persona(i,"Persona"+i,i));
            }
            System.out.println("Tiempo invertido en insertar una persona en listaarray (en nanosegundos):");
            antes = System.nanoTime();
            listaarray.add(0,new Persona(10001,"Prueba",10001)); // Inserción en posicion 0 de una persona
            System.out.println(System.nanoTime()- antes); 
            System.out.println("Tiempo invertido en insertar una persona en listalinked (en nanosegundos):");
            antes = System.nanoTime();
            listalinked.add(0,new Persona(10001,"Prueba",10001));  // Inserción en posicion 0 de una persona
            System.out.println(System.nanoTime()- antes);
      } 
}

