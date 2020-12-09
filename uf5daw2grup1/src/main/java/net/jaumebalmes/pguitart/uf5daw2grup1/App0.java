/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.jaumebalmes.pguitart.uf5daw2grup1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author pere
 */
public class App0 {

    public static void main(String[] args) {
        Segells segells = new Segells();
        Segell s1 = new Segell(10, LocalDate.of(2001, Month.JANUARY, 1));
        Segell s2 = new Segell(10, LocalDate.of(1900, Month.JANUARY, 1));
        Segell s3 = new Segell(10, LocalDate.of(2003, Month.JANUARY, 1));
        Segell s4 = s1;

        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//false
        System.out.println(s1.equals(s4));//true
        System.out.println(s2.equals(s3));//false

        segells.afegir(new Segell(10, LocalDate.of(2001, Month.JANUARY, 10)));
        segells.afegir(s2);
        segells.afegir(s3);
        segells.afegir(s4);

        segells.mostrarTots();
        s1.setValor(9);
        segells.mostrarTots();  
        
        System.out.println("Ordenats creixent data");
        segells.ordenarPerLocalDate();
        segells.mostrarTots();
        
       

    }

}
