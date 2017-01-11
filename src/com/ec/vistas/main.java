/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.vistas;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author cchristico
 */
public class main {

    /**
     * @param args the command line arguments
     */
    static class PQsort implements Comparator<Integer> {
 
		public int compare(Integer one, Integer two) {
			return two - one;
		}
	}
    public static void main(String[] args) {
     
       int[] ia = { 1, 10, 5, 3, 4, 7, 6, 9, 8 };
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
 
		// Use el método offer () para agregar elementos a PriorityQueue pq1
		for (int x : ia) {
			pq1.offer(x);
		}
 
		System.out.println("pq1: " + pq1);
 
		PQsort pqs = new PQsort();
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(10, pqs);
		// En este caso particular, podemos simplemente usar Collections.reverseOrder ()
		// En lugar de un comparador autodefinido
		for (int x : ia) {
			pq2.offer(x);
		}
 
		System.out.println("pq2: " + pq2);
 
		// tamaño
		System.out.println("size: " + pq2.size());
		//Devuelve 1 elemento en función del orden sin eliminarlo.
		System.out.println("peek: " + pq2.peek());
                //tememos los mismos elementos
                
                // tamaño
		System.out.println("size: " + pq2.size());
                // Devuelve 1 elemento en función del orden y lo elimina.
		//hemos eliminado el 1º elemento
                System.out.println("poll: " + pq2.poll());
                
		//Devuelve 1 elemento en función del orden y lo elimina.
		System.out.println("size: " + pq2.size());
 
		System.out.print("pq2: " + pq2);

    }    
}
