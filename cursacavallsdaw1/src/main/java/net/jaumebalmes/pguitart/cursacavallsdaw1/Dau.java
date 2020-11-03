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
public class Dau {
    short punts;
    
    short tirada(){
        punts = (short)(Math.random()*6 + 1);
        return punts;
    }

    /*public Dau(short punts){
        this.punts = punts;
    }*/

}
