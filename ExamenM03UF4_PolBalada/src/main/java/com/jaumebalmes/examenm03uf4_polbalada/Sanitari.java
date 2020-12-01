package com.jaumebalmes.examenm03uf4_polbalada;
//AUTOR: Pol
public class Sanitari extends Persona{
    private int id_centre;
    private int llocDeTreball; // 1=> residencia; 2=>Primera Linea; 3=> altres;

    public Sanitari(String nom, int edat, boolean autoritzacio,int llocDeTreball) {
        super(nom, edat, autoritzacio);
        this.llocDeTreball=llocDeTreball;
        if(llocDeTreball==1)
            super.setGrup(1);
        else if(llocDeTreball==2)
            super.setGrup(2);
        else
            super.setGrup(3);
    }

    @Override
    public String toString() {
        return super.toString() + "Sanitari{" + "id_centre=" + id_centre + ", llocDeTreball=" + llocDeTreball + '}';
    }
}
