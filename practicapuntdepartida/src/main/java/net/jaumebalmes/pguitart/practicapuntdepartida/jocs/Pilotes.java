package net.jaumebalmes.pguitart.practicapuntdepartida.jocs;
//AUTOR: Pol

import net.jaumebalmes.pguitart.practicapuntdepartida.figures.Individu;


public class Pilotes extends JocProcessing{
    
    Individu r = new Individu();
    public static void main(String[] args) {
        JocProcessing.runSketch(
            new String[]{"Quina passada"},
            new Pilotes());
    }

    @Override
    public void prepararJoc() {
        setSize(1000, 600);
    }

    @Override
    public void iniciarJoc() {
        background(0);
        //Circle r = Circle.getCircle(this);
        //Individu r = Individu.getIndividu(this);
        r.dibuixa(this);
    }

    @Override
    public void jugada() {
        //Individu r = Individu.getIndividu(this);
        background(0);
        r.mou(this);
        r.dibuixa(this);
    }

    @Override
    public boolean esFinal() {
        return false;
    }

    @Override
    public void finalJoc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
