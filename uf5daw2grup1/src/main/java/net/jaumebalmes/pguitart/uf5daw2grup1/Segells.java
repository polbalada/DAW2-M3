/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.jaumebalmes.pguitart.uf5daw2grup1;

import java.time.LocalDate;

/**
 *
 * @author pere
 */
public class Segells {

    final public static int MAX_SEGELLS = 100;

    private Segell[] segells = new Segell[MAX_SEGELLS];
    private int nSegells = 0;

    public void afegir(Segell s) {
        //Perill. No controla el màxim
        segells[nSegells] = s;
        nSegells++;
    }

    public void mostrarTots() {
        for (int i = 0; i < nSegells; i++) {
            System.out.println(segells[i]);
        }

    }

    public void ordenarPerLocalDate() {
        int i, j, pos;
        Segell menor, tmp; 

        for (i = 0; i < nSegells - 1; i++) {      // tomamos como menor el primero
            menor = segells[i];                       // de los elementos que quedan por ordenar                    
            pos = i;                            // y guardamos su posición
            for (j = i + 1; j < nSegells; j++) { // buscamos en el resto
                if (segells[j].getData().compareTo(menor.getData()) < 0) {           // del array algún elemento
                    menor = segells[j];             // menor que el actual
                    pos = j;
                }
            }
            if (pos != i) {                      // si hay alguno menor se intercambia                         
                tmp = segells[i];
                segells[i] = segells[pos];
                segells[pos] = tmp;
            }
        }
    }

}


