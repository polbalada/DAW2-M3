package com.jaumebalmes.coleccions;
//AUTOR: Pol

import java.util.Deque;
import java.util.LinkedList;

public class ExemplesPiles {
    public static void main(String[] args) {
        String frase = "orit nu ragep oreiuq em ,esalc ed aroh anu adeuq aívadoT";
        Deque<Character> pila = new LinkedList<>();
        
        for(int i=0;i<frase.length();i++){
            pila.push(frase.charAt(i));
        }
        while(!pila.isEmpty()){
            System.out.print(pila.pop());
        }
    }

}
