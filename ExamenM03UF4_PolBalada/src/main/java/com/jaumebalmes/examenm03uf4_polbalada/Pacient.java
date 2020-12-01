package com.jaumebalmes.examenm03uf4_polbalada;
//AUTOR: Pol
public class Pacient extends Persona{
    private boolean viuResidencia;
    private int grauDependencia = 0;

    public Pacient(String nom, int edat, boolean autoritzacio, boolean viuResidencia) {
        super(nom, edat, autoritzacio, viuResidencia);
        this.viuResidencia = viuResidencia;
        super.setGrup(1);
        if(!viuResidencia)
            super.setGrup(0);
        if(grauDependencia==3)
            super.setGrup(1);
        
    }
    
    public Pacient(String nom, int edat, boolean autoritzacio, boolean viuResidencia, boolean anticosos) {
        this(nom, edat, autoritzacio, viuResidencia);
        super.setAnticosos(anticosos);
    }
    
    public Pacient(String nom, int edat, boolean autoritzacio, boolean viuResidencia, int grauDependencia) {
        this(nom,edat,autoritzacio,viuResidencia);
        this.grauDependencia=grauDependencia;
    }

    @Override
    public String toString() {
        return super.toString() + "Pacient{" + "viuResidencia=" + viuResidencia + ", grauDependencia=" + grauDependencia + '}';
    }

   
}
