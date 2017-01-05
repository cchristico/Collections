/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.vistas;

import com.ec.entidades.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
       
  	List<String> navegadoresInternet = new ArrayList<String>();
 
		// agregar valores diferentes a la lsita
		navegadoresInternet.add("eBay");
		navegadoresInternet.add("Paypal");
		navegadoresInternet.add("Google");
		navegadoresInternet.add("Yahoo");
 
		// iterar con un for
		System.out.println("Ejemplo usando: For");
		for (int i = 0; i < navegadoresInternet.size(); i++) {
			System.out.println(navegadoresInternet.get(i));
		}
 
		// iterar con foreach
		System.out.println("Ejemplo con foreach");
		for (String temp : navegadoresInternet) {
			System.out.println(temp);
		}
 
		// iterate via "iterator loop"
		System.out.println("Ejemplo con Iterador");
		Iterator<String> crunchifyIterator = navegadoresInternet.iterator();
		while (crunchifyIterator.hasNext()) {
			System.out.println(crunchifyIterator.next());
		}
 
		// iterate via "while loop"
		System.out.println("Emplo con un ciclo While");
		int i = 0;
		while (i < navegadoresInternet.size()) {
			System.out.println(navegadoresInternet.get(i));
			i++;
		}
 
		// collection stream() util: Retorna una secuencia Stream como si fuera el funete
		System.out.println("Ejemplo con collection stream() util....");
		navegadoresInternet.forEach((temp) -> {
			System.out.println(temp);
		});

    }    
}
