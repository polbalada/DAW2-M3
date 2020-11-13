/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.jaumebalmes.pguitart.practicapuntdepartida.figures;

import java.awt.Color;
import java.awt.Point;
import processing.core.PApplet;

/**
 * Un individu és un Circle que es mou a una velocitat donada, 
 * rebota amb les parets i amb altres individus
 * i pot estar SA, INFECTAT o RECUPERAT.
 * Si l'individu està confinat, la velocitat és 0 (no es mou).
 * Quan un individu INFECTAT xoca amb un individu SA, aquest passa a INFECTAT.
 * Un individu es manté INFECTAT un cert peíode de temps, fins que es cura i
 * passa a ser RECUPERAT.
 * 
 * 
 * @author pereg
 */
public class Individu extends Circle{
    private int vX = 15 /* Utils.atzarSigne()*/;
    private int vY = 15;
    
    public Individu(int radi, Point point, Color color) {
        super(radi,point, color);
        //this.radi = radi;
        
    }

    public Individu() {
    }
    public static Individu getIndividu(PApplet pApplet){
        return new Individu();
    }
    
    public void mou(PApplet pApplet){
        System.out.println(getPoint().x);
        System.out.println(getPoint().y);
        int x = getPoint().x;
        int y = getPoint().y;
        
        if(y +radi >= pApplet.height || y-radi<=0){
            vY=-vY;
        }
        if(x +radi>= pApplet.width || x-radi<=0){
            vX=-vX;
        }
        x += vX;
        y += vY;
        
        /*if (x  <= DEFAULT_RADI){
        //la velocitat ha de ser positiva per separar-se del x=0
        if (vX < 0) { vX = -vX; }
        //vX = -vX;
        //Math.abs(vX);
        } else if (x >= pApplet.width){
        vX = -vX;
        //if (vX > 0) vX = -vX;
        }     */      
        
        setPoint(new Point(x, y));
        
    }
    
    
}
