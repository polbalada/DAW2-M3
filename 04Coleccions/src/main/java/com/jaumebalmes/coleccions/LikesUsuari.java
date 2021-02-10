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
            Fotografies.treureLike(id);
        }else{
            likes.add(id);
            Fotografies.afegirLike(id);
        }
    }
    
    public void mostrar(){
        System.out.println(likes.toString());
    }
    
    public TreeSet<Integer> interseccio(LikesUsuari u){
        TreeSet<Integer> interseccio = (TreeSet<Integer>) likes.clone();
        interseccio.retainAll(u.getLikes());
        return interseccio;
    }
    public TreeSet<Integer> diferencia(LikesUsuari u){
        TreeSet<Integer> diferencia = new TreeSet<>(likes);
        diferencia.removeAll(u.getLikes());
        return diferencia;
    }

    public TreeSet<Integer> getLikes() {
        return likes;
    }

}
