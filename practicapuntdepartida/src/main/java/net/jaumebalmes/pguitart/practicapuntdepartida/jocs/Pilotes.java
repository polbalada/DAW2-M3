package net.jaumebalmes.pguitart.practicapuntdepartida.jocs;
//AUTOR: Pol

import java.awt.Point;
import java.awt.Color;
import net.jaumebalmes.pguitart.practicapuntdepartida.figures.Individu;
import net.jaumebalmes.pguitart.practicapuntdepartida.utils.Utils;


public class Pilotes extends JocProcessing{
    
    /*Individu r = new Individu(10,new Point(Utils.atzarInt(1,1000),Utils.atzarInt(1,600)),Color.GREEN);
    Individu r2 = new Individu(10,new Point(Utils.atzarInt(1,1000),Utils.atzarInt(1,600)),Color.RED);*/
    
    Individu [] p = new Individu[50];
    
    
            
    public static void main(String[] args) {
        JocProcessing.runSketch(
            new String[]{"Quina passada"},
            new Pilotes());
    }

    @Override
    public void prepararJoc() {
        setSize(1000, 600);
        
        //fullScreen();
        for(int i=0;i<p.length;i++){
            p[i]=new Individu();
        }
        //fullScreen();
    }

    @Override
    public void iniciarJoc() {
        background(0);
        //frameRate(20);
        /*r.dibuixa(this);
        r2.dibuixa(this);*/
        //p[0].dibuixa(this);
        for(int i=0;i<p.length;i++)
            p[i].dibuixa(this);
        
    }

    @Override
    public void jugada() {
        background(0);
        for(int i=0;i<p.length;i++){
            for (int n=i+1;n<p.length;n++)
                p[i].controlXocs(p[n]);
            p[i].mou(this);
            p[i].dibuixa(this);
        }
        /*r.mou(this);
        r.dibuixa(this);
        r2.mou(this);
        r2.dibuixa(this);*/
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
