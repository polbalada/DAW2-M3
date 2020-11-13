package net.jaumebalmes.pguitart.practicapuntdepartida.jocs;
//AUTOR: Pol

import java.awt.Point;
import java.awt.Color;
import net.jaumebalmes.pguitart.practicapuntdepartida.figures.Individu;
import net.jaumebalmes.pguitart.practicapuntdepartida.utils.Utils;


public class Pilotes extends JocProcessing{
    
    Individu r = new Individu(10,new Point(Utils.atzarInt(1,1000),Utils.atzarInt(1,600)),Color.YELLOW);
    Individu r2 = new Individu(10,new Point(Utils.atzarInt(1,1000),Utils.atzarInt(1,600)),Color.RED);
    public static void main(String[] args) {
        JocProcessing.runSketch(
            new String[]{"Quina passada"},
            new Pilotes());
    }

    @Override
    public void prepararJoc() {
        setSize(1000, 600);
        //fullScreen();
    }

    @Override
    public void iniciarJoc() {
        background(0);
        //Circle r = Circle.getCircle(this);
        //Individu r = Individu.getIndividu(this);
        r.dibuixa(this);
        r2.dibuixa(this);
    }

    @Override
    public void jugada() {
        //Individu r = Individu.getIndividu(this);
        background(0);
        r.mou(this);
        r.dibuixa(this);
        r2.mou(this);
        r2.dibuixa(this);
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
