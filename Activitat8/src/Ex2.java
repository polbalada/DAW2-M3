/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pol
 */
import java.util.Scanner;
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        String v[];
        v = new String[10];
        for(int n=0;n<10;n++){
            System.out.print ("Introduce una palabra: ");
            v[n]=Scanner.next();
        }
        for (int n=0;n<v.length;n++)
            System.out.println("Element ["+n+"]="+v[n]);

    }
    
}
