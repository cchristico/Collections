/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.ejemploListas;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author AuditaQ
 */
public class EjemplolinkedHashSet {
    public static void main(String[] args) {
    LinkedHashSet <PersonaSet> personas = new LinkedHashSet<PersonaSet>();
    PersonaSet p1 = new PersonaSet("Pablo",15);
    PersonaSet p2 = new PersonaSet("Pedro",15);
    PersonaSet p3 = new PersonaSet("Maria",19);
    PersonaSet p4 = new PersonaSet("Carmen",25);
    
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
