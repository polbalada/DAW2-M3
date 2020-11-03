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
public class Activitat6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        //EX1
//        System.out.println(Math.random());
//        System.out.println(Math.random());
//        System.out.println(Math.random());
        
        //EX2
//        System.out.println((int)(Math.random()*9)-3);
        
        //EX3
//        int num_rand= (int)(Math.random()*6)+1;
//        int num_user;
//        System.out.println("NUM:");
//        num_user = teclado.nextInt();
//        if (num_rand==num_user){
//            System.out.println("CORRECTO");
//        }else{
//            System.out.println("LOOSER \n El numero era: " + num_rand);
//        }
        
        //EX4
//        String abecedari= "ABCÇDEFGHIJKLMNOPQRSTUVWXYZ";
//        char num=(char) abecedari.length();
//        String lletra=""+abecedari.charAt((int)(Math.random()*num));
//        lletra+=abecedari.charAt((int)(Math.random()*num));
//        lletra+=abecedari.charAt((int)(Math.random()*num));
//        lletra+=abecedari.charAt((int)(Math.random()*num));
//        System.out.println(lletra);
        
        //EX5
//        String probabilitats= "1111111XX2";
//        System.out.println(probabilitats.charAt((int)(Math.random()*probabilitats.length())));
        
        //CAIXER
        int c=160;
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
