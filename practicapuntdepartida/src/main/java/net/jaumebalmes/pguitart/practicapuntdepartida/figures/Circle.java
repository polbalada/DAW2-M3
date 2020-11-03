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

import processing.core.PApplet;

/**
 *
 * @author pereg
 */
public class Circle extends Shape {
    public static int DEFAULT_RADI = 50;
    public static Point DEFAULT_POINT = new Point(100, 100);
    //super(DEFAULT_POINT);

    /*public int getCircle(PApplet pApplet) {
        int ESCALAT = 10;
        int MAX_RADI_RECT = pApplet.width / ESCALAT;
        int MIN_WIDTH_RECT = pApplet.width / (2 * ESCALAT);
        int MIN_HEIGHT_RECT = pApplet.height / (2 * ESCALAT);


        Point p = new Point(Utils.atzarInt(pApplet.width), 
                  Utils.atzarInt(pApplet.height));
        Color c = new Color(Utils.atzarInt(256),
                  Utils.atzarInt(256),
                  Utils.atzarInt(256));
        int radi = 
                Utils.atzarInt(MAX_RADI_RECT - MIN_HEIGHT_RECT) 
                + MIN_WIDTH_RECT;
        return new Circle(radi, p, c);
      }*/
    
    public Circle(int radi, Point point, Color color) {
        super(point, color);
        //this.radi = radi;
        
    }
    public Circle() {
        this(DEFAULT_RADI, DEFAULT_POINT, DEFAULT_COLOR);
    }

    @Override
    public void dibuixa(PApplet pApplet) {
        pApplet.fill(255, 0, 0);
        
        //pApplet.(getPoint().x, getPoint().y);
        
        /*pApplet.fill(getColor().getRed(), 
                getColor().getGreen(),
                getColor().getBlue());*/
        pApplet.ellipse(DEFAULT_POINT.x, DEFAULT_POINT.y,
                (float) (2*DEFAULT_RADI), 
                (float) (2*DEFAULT_RADI));
    }
    

    public static Circle getCircle(PApplet pApplet){
        return new Circle();
    }

    /*@Override
    public void dibuixa(PApplet pApplet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
}
