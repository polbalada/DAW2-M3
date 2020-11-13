/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.jaumebalmes.pguitart.practicapuntdepartida.utils;

import java.util.Random;

/**
 *
 * @author pereg
 */
public class Utils {
    private static final Random r = new Random();
    
    /**
     *
     * @param maxInt
     * @return valor a l'atzat de 0 a maxInt.
     */
    public static int atzarInt(int minInt,int maxInt){
        return r.nextInt(maxInt - minInt) + minInt;
    }
    
    public static int atzarSigne(){
        return(r.nextInt(2)==0)?1:-1;
    }
}
