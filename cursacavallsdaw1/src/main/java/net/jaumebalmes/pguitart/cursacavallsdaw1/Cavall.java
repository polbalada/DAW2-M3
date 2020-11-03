/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.jaumebalmes.pguitart.cursacavallsdaw1;

/**
 *
 * @author pere
 */
public class Cavall {
    //estat
    int posicio;
    String nomNen;
    /*Dau d1;
    Dau d2;*/
       
   //comportament
    public Cavall(String nomNen){
        this.nomNen=nomNen;
    }
    public void endavant(int nPosicions){
        posicio+=nPosicions;
    }

    public void setPosicio(int posicio) {
        this.posicio = posicio;
    }



}
