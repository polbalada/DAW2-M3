/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.jaumebalmes.pguitart.introaprocessing;

/**
 *
 * @author pere
 */
public class App {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Circle c1 = new Circle();
        Shape c2 = new Circle();
        Shape s2 = new Shape();
        
        System.out.println(s1);
        System.out.println("Area 0? " + s1.area());
        System.out.println(c1);
        System.out.println("Area " + Math.PI * 100 + "? " + c1.area());
        System.out.println(c2);
        System.out.println(s2);
    }
    
}
