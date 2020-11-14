/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.jaumebalmes.pguitart.practicapuntdepartida.figures;

import java.awt.Color;
import java.awt.Point;
import net.jaumebalmes.pguitart.practicapuntdepartida.utils.Utils;
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
    private int vX = 1 * Utils.atzarSigne();
    private int vY = 1 * Utils.atzarSigne();
    
    public Individu(int radi, Point point, Color color) {
        super(radi,new Point(Utils.atzarInt(1,1000),Utils.atzarInt(1,600)), color);
        //this.radi = radi;
        
    }

    public Individu() {
        super(DEFAULT_RADI,new Point(Utils.atzarInt(DEFAULT_RADI,1000),Utils.atzarInt(DEFAULT_RADI,600)), DEFAULT_COLOR);
    }
    public static Individu getIndividu(PApplet pApplet){
        return new Individu();
    }
    
    private boolean xoquen(Individu altre){
        return (this.getPoint().distance(altre.getPoint())<radi*2);
        //        sumaRadis >= distancia entre centres;
        
    }
    
    public void controlXocs(Individu altre){
        if (xoquen(altre)){
//            si intercanviant velocitats s'allunyen
//              l'individu 1 agafa la trajectoria del 2
//              i el 2 de l'1. (intercvanvi velocitats)
            int aux=vX; 
            vX=altre.vX;
            altre.vX=aux;
            aux=vY;
            vY=altre.vY;
            altre.vY=aux;
              
        }
        
        
    }
    
    public void mou(PApplet pApplet){
        /*System.out.println(getPoint().x);
        System.out.println(getPoint().y);*/
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
   
        
        setPoint(new Point(x, y));
        
    }
    
    
}
