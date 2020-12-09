/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.jaumebalmes.pguitart.uf5daw2grup1;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.util.Objects;

/**
 *
 * @author pere
 */
public class Segell {

    final public static double DEFAULT_VALUE=0;
    
    private double valor;
    private LocalDate data;
    private String descripcio;

    public Segell(double valor, LocalDate data) {

        if (data == null) {
            throw new IllegalArgumentException("La data no pot ser null");
        }
        setValor(valor);
        this.data = data;
    }

    public void setValor(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("VALOR NEGATIU");
        }        
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    
    public Segell() {
        this(DEFAULT_VALUE, LocalDate.now());
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Segell other = (Segell) obj;
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "Segell{" + "valor=" + valor + ", data=" + data + '}';
    }

    public static void main(String[] args) {
        Segell s1 = new Segell();
        Segell s2 = new Segell(10, LocalDate.of(2001, Month.JANUARY, 1));
        try {
            Segell s3 = new Segell(10, LocalDate.of(2001, Month.FEBRUARY, 30));
        } catch (DateTimeException e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();

        }

        System.out.println(s1);
        s1.setValor(-100);
        System.out.println(s2);

    }

}
