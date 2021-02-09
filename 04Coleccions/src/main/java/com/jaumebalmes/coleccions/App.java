package com.jaumebalmes.coleccions;
//AUTOR: Pol
public class App {
    public static void main(String[] args) {
        LikesUsuari joan = new LikesUsuari("Joan");
        joan.ferLike(1000);
        joan.ferLike(10000);
        joan.ferLike(30000);
        joan.ferLike(40000);
        System.out.print("Joan");
        //joan.mostrar();
        //Bot.ferLikesRandom(joan, 10, 1, 30);
        joan.mostrar();
        
        LikesUsuari maria = new LikesUsuari("Maria");
        //Bot.ferLikesRandom(maria, 20, 1, 30);
        maria.ferLike(40000);
        maria.ferLike(30000);
        maria.ferLike(300);
        System.out.print("Maria");
        maria.mostrar();
        
        System.out.print("Interseccio");
        System.out.println(joan.interseccio(maria));
        
        System.out.print("Diferencia");
        System.out.println(joan.diferencia(maria));
    }

}
