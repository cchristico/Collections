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
        ArrayList<String> listaMarcasCoches = new ArrayList<String>(); // El tipo de listaMarcasCoches es Collection
        listaMarcasCoches.add("Audi");
        listaMarcasCoches.add("Paganni");
        listaMarcasCoches.add("Maserati");
        listaMarcasCoches.add("Ferrari");
        listaMarcasCoches.add("Ford");
        listaMarcasCoches.add("Fiat");
        System.out.println("Número elementos antes de eliminar: " + listaMarcasCoches.size() ) ;
        System.out.println (listaMarcasCoches.toString() ) ;
        listaMarcasCoches.remove ("Ford");
        listaMarcasCoches.remove ("Fiat");
        System.out.println("Número elementos después de eliminar Ford y Fiat:" + listaMarcasCoches.size() ) ;
        System.out.println(listaMarcasCoches.toString () );

    }    
}
