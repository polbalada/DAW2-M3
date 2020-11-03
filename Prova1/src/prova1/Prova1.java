/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1;

/**
 *
 * @author polba
 */
public class Prova1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float a =25 ,b=12, c=9, d=2, e=8, f=4, g=9, h=7, i=65;
        char lletra='A';
        
        System.out.print("25 >= 12 && !(9 < 2) && !(8<=4) && 9>7 && 65==’A’   -->   ");
        System.out.println(a >= b && !(c < d) && !(e<=f) && g>h && i==lletra);
        
        a=23;
        b=8;
        c=19;
        d=5;
        e=4;
        f=24;
        g=6;
        double j=12.0;
        h=3;
        i=9;
        float k=8;
        
        System.out.print("23<8 && 19>5*4 || (24/6<=12.0/3) && 9>=8   -->   ");
        System.out.println(a<b && c>d*e || (f/g<=j/h) && i>=k);
    }
    
}
