package net.jaumebalmes.pguitart.practicapuntdepartida.jocs;
//AUTOR: Pol

import net.jaumebalmes.pguitart.practicapuntdepartida.figures.Circle;


public class Pilotes extends JocProcessing{
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
        Circle r = Circle.getCircle(this);
        r.dibuixa(this);
    }

    @Override
    public void jugada() {
        
        //setup();
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
