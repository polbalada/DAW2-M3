package com.jaumebalmes.persones_exemple;
//AUTOR: Pol

import java.time.LocalDate;
import java.time.Month;

public class App {
    public static void main(String[] args) {
        try{
        Persona p=new Persona("pol","balada","rigol","49284237K", LocalDate.of(2000, Month.NOVEMBER, 26));
        Persones.afegirPersona(p);

//        p=new Persona("FalsoPOL","balada","Rigol","49284237K", LocalDate.of(2000, Month.NOVEMBER, 26));
//        Persones.afegirPersona(p);
        
        p=new Persona("jhndsfkl","jsdf","kjzsdf","9213123", LocalDate.now());
        Persones.afegirPersona(p);
        
        p=new Persona("zasd","aasdjoks","ijdsf","1213123", LocalDate.now());
        Persones.afegirPersona(p);
        
        p=new Persona("asd","ccas","sadsd","213123", LocalDate.of(2010, Month.MAY, 4));
        Persones.afegirPersona(p);
        
        p=new Persona("asff","bdfss","sadssdfd","087574J", LocalDate.of(2022, Month.MAY, 4));
        Persones.afegirPersona(p);
        
        p=new Persona("asdsfgd","badsfs","sadsd","65128", LocalDate.now());
        Persones.afegirPersona(p);
        }catch (PersonaDuplicadaExcepcion ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\nOrdenat per defecte");
        Persones.mostrarTots();
        Persones.ordenarComparable();
        System.out.println("\nOrdenat per DNI");
        Persones.mostrarTots();
        Persones.ordenarData();
        System.out.println("\nOrdenat per Data i Cognom");
        Persones.mostrarTots();
    }

}
