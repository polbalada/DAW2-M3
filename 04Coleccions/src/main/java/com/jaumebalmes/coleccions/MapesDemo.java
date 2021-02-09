package com.jaumebalmes.coleccions;
//AUTOR: Pol

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapesDemo {
    public static Map<Character, Integer> freqCaracters(String frase){
        Map<Character, Integer> mapa = new HashMap<>();
        int nCharacters = frase.length();
        for(int i=0; i<nCharacters;i++){
            char car = frase.charAt(i);
            int nVegades = 1;
            if(mapa.containsKey(car))
                nVegades = mapa.get(car) +1;
            mapa.put(car,nVegades);
        }
        
        return mapa;
    }
    public static void main(String[] args) {
        Map<Character, Integer> mapa;
        mapa = freqCaracters("aaabbbbzzz");
        System.out.println(mapa);

        for(Map.Entry<Character, Integer> e: mapa.entrySet()){
            System.out.println(e.getKey() + "-" + e.getValue());
        }
        
        ArrayList<Map.Entry<Character, Integer>> llista;
        //llista = 

    }
}
