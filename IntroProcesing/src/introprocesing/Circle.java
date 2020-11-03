/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introprocesing;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author pereg
 */
public class Circle extends Shape {
    
    final public static int CODI_BASE=20000;
    
    private static int nCercles = 0;
    final public static double DEFAULT_RADIOUS=10;
    private double radious;
    
    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTORS">
    public Circle() {
        this(DEFAULT_RADIOUS,DEFAULT_POINT);
    }
    
    public Circle(double radious, Point point){
        
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="OVERRIDE">
    @Override
    public double area() {
        return Math.PI * radious * radious;
    }
    
    @Override
    public double perimeter() {
        return 2 * radious * Math.PI;
    }
    
    @Override
    protected void assingarCodi() {
        nCercles ++;
        codi = CODI_BASE + nCercles;
    }
    
    @Override
    public String toString() {
        return "Circle{" + "radious=" + radious + '}' + " " + super.toString();
    }
//</editor-fold>
    
    public static void main(String[] args) {
        Circle c = new Circle();
        
        
        
        System.out.println(c);
    }

    
    
}
