package com.jaumebalmes.persones_exemple;
//AUTOR: Pol

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;

public class Contenidor<E extends GettersGenerics & Comparable<E>> {
    public ArrayList<E> element = new ArrayList<>();
  
    public void afegir(E e){
        element.add(e);
    }
    
    public void mostra(){
        System.out.println(element.toString());
    }
    
    public void ordena(){
        Collections.sort(element);
    }
    
    public void ordenaData(){
        element.sort((E a, E b) -> a.getData().compareTo(b.getData()));
    }
    
    public static void main(String[] args){
        Contenidor<Persona> persones;
        persones = new Contenidor<>();
        persones.afegir(new Persona("Pol", "Balada", "asd", "asd", LocalDate.now()));
        persones.afegir(new Persona("a", "a", "a", "a", LocalDate.of(2000, Month.MARCH, 20)));
        persones.afegir(new Persona("c", "c", "c", "c", LocalDate.now()));
        persones.afegir(new Persona("b", "b", "b", "b", LocalDate.now()));
        persones.mostra();
        
        System.out.println("\nOrdenat");
        persones.ordena();
        persones.mostra();
        
        System.out.println("\nOrdenat per data");
        persones.ordenaData();
        persones.mostra();
    }
}
