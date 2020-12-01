package com.jaumebalmes.examenm03uf4_polbalada;
//AUTOR: Pol
public abstract class Persona {
    private int id;
    private String  nom;
    private int edat;
    private boolean anticosos=false;
    private boolean autoritzacio;
    
    private int grup;
    
    public static int contador=0;
    public static int contadorAnticosos=0;
    public static int contadorVacunes=0;

    public Persona(String nom, int edat, boolean autoritzacio) {
        this.nom = nom;
        this.edat = edat;
        this.autoritzacio = autoritzacio;
        this.id=contador;
        contador++;
        
        if(autoritzacio)
            contadorVacunes++;
    }

    public Persona(String nom, int edat, boolean autoritzacio, boolean anticosos) {
        this(nom,edat,autoritzacio);
        this.anticosos = anticosos;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nom=" + nom + ", edat=" + edat + ", anticosos=" + anticosos + ", autoritzacio=" + autoritzacio +  ", GRUP="+grup +'}';
    }

    public void setAnticosos(boolean anticosos) {
        this.anticosos = anticosos;
        contadorAnticosos++;
    }

    public void setGrup(int grup) {
        if(anticosos || !autoritzacio)
            grup=0;
        this.grup=grup;
    }

    public int getGrup() {
        return grup;
    }

    public String getNom() {
        return nom;
    }

    public void setAutoritzacio(boolean autoritzacio) {
        this.autoritzacio = autoritzacio;
    }

    
    
}
