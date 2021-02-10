package com.jaumebalmes.coleccions;
//AUTOR: Pol

import java.util.HashMap;
import java.util.Map;


public class Fotografies {
    private static Map<Integer, Integer> mapa = new HashMap<>();
    
    public static void afegirLike(Integer id){
        int nVegades = 1;
        if(mapa.containsKey(id))
            nVegades = mapa.get(id) +1;
        mapa.put(id,nVegades);
    }
    
    public static void treureLike(Integer id){
        int nVegades = mapa.get(id) -1;
        if(nVegades<=0)
            mapa.remove(id);
        else
            mapa.put(id,nVegades);
    }
    
    public static void mostrarTot(){
        System.out.println(mapa);
    }
    
}
