/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.jaumebalmes.pguitart.introaprocessing;

import java.awt.Point;
import processing.core.PApplet;

/**
 *
 * @author pere
 */
public class ExempleProcessing extends PApplet{
    private Circle c;
    
    
    @Override
    //moviment (refresc)
    public void draw(){
        background(0);
//        fill(255, 0, 0);
        ellipse(mouseX, mouseY, 50, 50);
//        rect
//        triangle
        c.dibuixa(this);
        c.mou();
    }
    
    //Com serà el marc que crearem
    @Override
    public void settings(){
        setSize(600, 400);
    }
    
    //Què posem inicialment al marc
    @Override
    public void setup(){
        background(0, 0, 0);
        c = new Circle(50, new Point(200, 200));
        
    }    
    
    public static void main(String[] args) {
        ExempleProcessing.runSketch(new String[] {"Prova"},
                new ExempleProcessing());
 
    }
    
}
