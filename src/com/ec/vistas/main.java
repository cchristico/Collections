/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.vistas;

import com.ec.entidades.Persona;
import java.util.ArrayList;
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
     
        //Collections
        //ArrayList
        ArrayList<Persona> listaPersonas = new ArrayList<Persona>(); // El tipo de listaPersona es Collection
        Persona p = new Persona("Jose", "Urbina", 56);
        Persona p1 = new Persona("Jose", "Flores", 66);
        Persona p2= new Persona("Jaime","Roldos", 76);
        listaPersonas.add(p);
        listaPersonas.add(p1);
        listaPersonas.add(p2);
        
        System.out.println("Número elementos antes de eliminar: " + listaPersonas.size() ) ;
        System.out.println (listaPersonas.toString() ) ;
        
        listaPersonas.remove (p);
        listaPersonas.remove (p1);
        System.out.println("Número elementos después de eliminar Jose Urbina y Jose Flores:" + listaPersonas.size() ) ;
        System.out.println(listaPersonas.toString () );

    }    
}
