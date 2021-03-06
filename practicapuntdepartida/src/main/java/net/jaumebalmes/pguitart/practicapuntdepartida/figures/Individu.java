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
    private int vX = Utils.atzarInt(1, 10) * Utils.atzarSigne();
    private int vY = Utils.atzarInt(1, 10) * Utils.atzarSigne();
    //private int vX = 1 * Utils.atzarSigne();
    //private int vY = 1 * Utils.atzarSigne();
    
    public int infectat=0; 
                //0 -> Sà
                //1 -> Infectat
                //2 -> Recuperat
    public int tempsRecuperacio= Utils.atzarInt(100,1000);
    
    
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
    
    private boolean canvi(Individu altre){
        Point p1=new Point(this.point.x+this.vX, this.point.y+this.vY);
        Point p2=new Point(altre.point.x+altre.vX, altre.point.y+altre.vY);
        return p1.distance(p2)<this.point.distance(altre.point);
    }
    
    public void infectar(Individu altre){
        if(xoquen(altre) && infectat==1){
            altre.infectat=1;
            altre.setColor(new Color(255,0,0));
        }
    }
    
    public void controlXocs(Individu altre){

//            si intercanviant velocitats s'allunyen
//              l'individu 1 agafa la trajectoria del 2
//              i el 2 de l'1. (intercvanvi velocitats)
        if (xoquen(altre)){
            if(canvi(altre)){
                int aux=vX; 
                vX=altre.vX;
                altre.vX=aux;
                aux=vY;
                vY=altre.vY;
                altre.vY=aux;
            }   
        } 
    }
    
    public void mou(PApplet pApplet){
        /*System.out.println(getPoint().x);
        System.out.println(getPoint().y);*/
        int x = getPoint().x;
        int y = getPoint().y;
        
        if(y +radi >= pApplet.height){
            vY=-Math.abs(vY);
        }else if(y-radi<=0){
            vY=Math.abs(vY);
        }
        if(x +radi>= pApplet.width ){
            vX=-Math.abs(vX);
        }else if(x-radi<=0){
            vX=Math.abs(vX);
        }
        
        x += vX;
        y += vY;
   
        
        setPoint(new Point(x, y));
        
    }
    
    
}
