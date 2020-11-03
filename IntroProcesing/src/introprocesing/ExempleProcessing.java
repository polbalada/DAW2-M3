package introprocesing;
import processing.core.PApplet;
//AUTOR: Pol
public class ExempleProcessing extends PApplet{
    @Override
    public void draw(){
        background(0);
        fill(255,0,0);
        ellipse(mouseX,mouseY,50,50);
        background(0);
    }
    
    //@Override
    public void settings(){
        setSize(600,400);
    }
    
    //@Override
    public void setup(){
        bakground(0,0,0);
    }
    public static void main(String[] args) {
        ExempleProcessing.runSketch(new String[]{"Prova") new ExempleProcessing();
    }

}
