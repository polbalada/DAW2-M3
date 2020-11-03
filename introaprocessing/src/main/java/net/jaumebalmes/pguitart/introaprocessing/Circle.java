/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.jaumebalmes.pguitart.introaprocessing;

import java.awt.Point;

/**
 *
 * @author pereg
 */
public class Circle extends Shape {
    final public static int CODI_BASE = 20000;
    
    private static int nCercles=0;
    final public static double DEFAULT_RADIOUS = 10;
    private double radious;

//<editor-fold defaultstate="collapsed" desc="CONSTRUCTORS">
    /**
     *
     * @param radious
     * @param origin
     */
    public Circle(double radious, Point origin) {
        super(origin);
        this.radious = radious;
    }

    /**
     *
     */
    public Circle() {
        this(DEFAULT_RADIOUS, DEFAULT_POINT);
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="GETTERS/SETTERS">
    public double getRadious() {
        return radious;
    }
    
    public void setRadious(double radious) {
        this.radious = radious;
    }
    
    public static void main(String[] args) {
        Circle c = new Circle();
        
        System.out.println(c);
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="ARAA/PERIMETRE">
    /**
     *
     * @return
     */
    @Override
    public double area() {
        return Math.PI * radious * radious;
    }
    
    @Override
    public double perimeter() {
        return 2 * radious * Math.PI;
    }
//</editor-fold>

    @Override
    protected void assignarCodi() {
        nCercles++;
        codi = CODI_BASE + nCercles;
    }

    @Override
    public String toString() {
        return "Circle{" + "radious=" + radious + '}' 
                + " " + super.toString();
    }

    public void dibuixa(ExempleProcessing marc) {
        marc.fill(getColor().getRed(), 
                getColor().getGreen(),
                getColor().getBlue());
        marc.ellipse(getOrigin().x, getOrigin().y,
                (float) (2*radious), 
                (float) (2*radious));
    }
    
    public void mou(){
        setOrigin(
                new Point(getOrigin().x + 5, getOrigin().y + 5));
    }
    
    
    
}
