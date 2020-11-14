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
    public static int DEFAULT_RADI = 10;
    //public static Point DEFAULT_POINT = new Point(100, 100);
    //super(DEFAULT_POINT);
    
    
    public int radi;
    
    public Circle(int radi, Point point, Color color) {
        super(point, color);
        this.radi = radi;
        
    }
    public Circle() {
        //this(DEFAULT_RADI, DEFAULT_POINT, DEFAULT_COLOR);
        this(DEFAULT_RADI, DEFAULT_POINT, DEFAULT_COLOR);
    }

    @Override
    public void dibuixa(PApplet pApplet) {
        //pApplet.fill(255, 0, 0);
        pApplet.fill(color.getRGB());

        pApplet.ellipse(point.x, point.y,
                (float) (2*radi), 
                (float) (2*radi));
    }

    public static Circle getCircle(PApplet pApplet){
        return new Circle();
    }
    
    
}
