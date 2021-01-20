package com.jaumebalmes.persones_exemple;
//AUTOR: Pol

import java.time.LocalDate;
import java.util.Objects;

public class Persona implements Comparable<Persona>{
    private String nom;
    private String cognom1;
    private String cognom2;
    private String dni;
    private LocalDate DataNaixement;

    public Persona(String nom, String cognom1, String cognom2, String dni, LocalDate DataNaixement) {
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.dni = dni;
        this.DataNaixement = DataNaixement;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom1() {
        return cognom1;
    }

    public String getCognom2() {
        return cognom2;
    }

    public String getDni() {
        return dni;
    }

    public LocalDate getDataNaixement() {
        return DataNaixement;
    }

    @Override
    public int compareTo(Persona o) {
        return this.getDni().compareTo(o.getDni());
    }

    @Override
    public String toString() {
        return "Persona{" + "nom=" + nom + ", cognom1=" + cognom1 + ", cognom2=" + cognom2 + ", dni=" + dni + ", DataNaixement=" + DataNaixement + '}';
    }
 
}
