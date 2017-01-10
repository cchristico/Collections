/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.ejemploListas;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author AuditaQ
 */
public class EjemploTreeSet {
    public static void main(String[] args) {
    TreeSet <PersonaTreeSet> personas = new TreeSet<PersonaTreeSet>();
    PersonaTreeSet p1 = new PersonaTreeSet("Pablo",30);
    PersonaTreeSet p2 = new PersonaTreeSet("Zara",18);
    PersonaTreeSet p3 = new PersonaTreeSet("Maria",19);
    PersonaTreeSet p4 = new PersonaTreeSet("Carmen",25);
    
    
    personas.add(p1);
    personas.add(p2);
    personas.add(p3);
    personas.add(p4);
    
    //personas.remove(p4);
    System.out.println(personas.size());
    //System.out.println(personas.contains(p4));
    System.out.println(personas);
    
}  
}