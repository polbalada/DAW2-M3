package com.jaumebalmes.coleccions;
//AUTOR: Pol

import java.util.TreeSet;


public class LikesUsuari {
    private String nom;
    private TreeSet<Integer> likes = new TreeSet<>();

    public LikesUsuari(String nom) {
        this.nom = nom;
    }
    
    public void ferLike(int id){
        if(likes.contains(id)){
            likes.remove(id);
        }else{
            likes.add(id);
        }
    }
    
    public void mostrar(){
        System.out.println(likes.toString());
    }

}
