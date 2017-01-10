/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.ejemploListas;

import java.util.LinkedList;
import java.util.*;


/**
 *
 * @author AuditaQ
 */
public class EjemploLinkedList {
public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
 
        int num;
        int op;
 
        LinkedList lista = new LinkedList();
        do{
            System.out.println( "\t Menú \t" );
            System.out.println( "Operaciones con listas" );
            System.out.println( "1.- Insertar al principio" );
            System.out.println( "2.- Insertar al final" );
            System.out.println( "3.- Borrar al principio" );
            System.out.println( "4.- Borrar al final" );
            System.out.println( "5.- Mostrar la lista" );
            System.out.println( "6.- Borrar toda la lista" );
            System.out.println( "7.- Salir" );
            System.out.println( "\n" );
            System.out.println( "Elija la operación que desee" );
 
            op = leer.nextInt();
 
            switch(op){
                case 1:
                      System.out.println( "Inserte numero" );
                      num = leer.nextInt();
                      lista.addFirst(num);
                      //lista.add("JAVA");
                      //lista.add(1,100);
                      break;
                case 2:
                      System.out.println( "Inserte numero" );
                      num = leer.nextInt();
                      lista.addLast(num);
                      break;
                case 3:
                      System.out.println( "Se borrara el primer nodo" );
                      lista.removeFirst();
                      //lista.remove(0);
                      break;
                case 4:
                      System.out.println( "Se borrara el nodo final" );
                      lista.removeLast();
                      break;
                case 5:
                      System.out.println( "La lista es la siguiente" );
                      for(int i =0; i<lista.size(); i++){
                        //accediendo al dato en la posicion i
                        System.out.println(lista.get(i));
                        }
                       break;
                case 6:
                      System.out.println( "Se borraran todos los elementos de la lista" );
                      lista.clear();
                      break;
                case 7:
                      System.out.println( "Al rato" );
                      break;
                }
            }
 
        while( op != 7 );
    }
}

