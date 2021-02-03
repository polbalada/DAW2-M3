package com.jaumebalmes.coleccions;
//AUTOR: Pol
public class Bot{
    public static void ferLikesRandom(LikesUsuari u,  int nLikes, int codiMinin, int codiMaxim){
        for (int i=0;i<nLikes;i++){
            int codi = (int)(Math.random()* (codiMaxim - codiMinin) + codiMinin);
            u.ferLike(codi);
        }
    }
}
