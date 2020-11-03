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
public class Caixer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        System.out.println();
        int c=teclado.nextInt();
        int b50= c/50;
        int resto= c %50;
        int b20= resto/20;
        if (c==b50*50+b20*20){
            System.out.println("Billetes de 50: "+b50+"  Billetes de 20: "+b20);
        }else if((50+resto)%20==0&&b50>1){
            b50+=-1;
            b20= (resto+50)/20;
            System.out.println("Billetes de 50: "+b50+"  Billetes de 20: "+b20);
        }else{
            System.out.println("ERROR");
        }
    }
    
}
