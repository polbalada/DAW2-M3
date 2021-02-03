package com.jaumebalmes.coleccions;
//AUTOR: Pol
public class App {
    public static void main(String[] args) {
        LikesUsuari joan = new LikesUsuari("Joan");
        joan.ferLike(1000);
        joan.ferLike(10000);
        joan.ferLike(30000);
        joan.ferLike(40000);
        joan.mostrar();
        Bot.ferLikesRandom(joan, 100, 1000, 10000);
        joan.mostrar();
    }

}
