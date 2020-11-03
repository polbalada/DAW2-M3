package com.mycompany.processing;

import processing.core.PApplet;
//AUTOR: Pol
public class Processing extends PApplet{
    @Override
    public void draw(){
        background(0);
        fill(255,0,0);
        ellipse(mouseX,mouseY,50,50);
        background(0);
        //c.dibuixa(this);
    }
    
    //@Override
    public void settings(){
        setSize(600,400);
    }
    
    //@Override
    public void setup(){
        background(0,0,0);
    }
    public static void main(String[] args) {
        Processing.runSketch(new String[] {"Prova"},
                new Processing());
        
    }
    

}

